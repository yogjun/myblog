import com.google.common.collect.Lists;
import lombok.Data;
import org.springframework.util.CollectionUtils;

import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.BiConsumer;
import java.util.function.Function;

/**
 * {@link FillCurryKit}
 *
 * @author <a href="mailto:matthew.miao@yunlsp.com">matthew.miao</a>
 * @version ${project.version} - 2021/12/11
 */
public class FillCurryKit<T> {

  private Collection<T> fillCollection = null;
  private List<FillCurryBean<T>> curryBeanList = Lists.newArrayList();

  /** must not instantiate */
  private FillCurryKit() {}

  private FillCurryKit(Collection<T> fillCollection) {
    this.fillCollection = fillCollection;
  }

  /** create curry to fill */
  public static <T> FillCurryKit createFillCurry(Collection<T> collection) {
    return new FillCurryKit(collection);
  }

  public FillCurryKit handle(
      BiConsumer<T, Object> fillFunction,
      Function<T, Object> getUKMethod,
      Function<Set<Object>, Map<Object, Object>> mapGetFunction) {
    // validate fill function param
    if (fillFunction == null || getUKMethod == null || mapGetFunction == null) {
      return this;
    }
    // add fill function
    FillCurryBean fillCurryBean = new FillCurryBean();
    fillCurryBean.setFillFunction(fillFunction);
    fillCurryBean.setGetUKMethod(getUKMethod);
    fillCurryBean.setMapGetFunction(mapGetFunction);
    curryBeanList.add(fillCurryBean);
    return this;
  }

  public void finish() {
    // finish commit if not empty
    if (CollectionUtils.isEmpty(fillCollection) || CollectionUtils.isEmpty(curryBeanList)) {
      return;
    }
    curryBeanList.forEach(
        curryBean -> {
          // get collection keys
          Set<Object> ids = StreamKit.getFiledSet(fillCollection, curryBean.getGetUKMethod());
          if (ids.isEmpty()) {
            return;
          }
          // get fillInfo map
          Map<Object, Object> map = curryBean.getMapGetFunction().apply(ids);
          if (map.isEmpty()) {
            return;
          }
          fillCollection.stream()
              .forEach(
                  item -> {
                    // fill info
                    Object matchObj = map.get(curryBean.getGetUKMethod().apply(item));
                    if (matchObj != null) {
                      curryBean.getFillFunction().accept(item, matchObj);
                    }
                  });
        });
  }
}

@Data
class FillCurryBean<T> {
  private BiConsumer<T, Object> fillFunction;
  private Function<T, Object> getUKMethod;
  private Function<Set<Object>, Map<Object, Object>> mapGetFunction;
}
