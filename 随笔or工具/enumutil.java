
public class EnumUtils {

    /**
     * 根据反射 class 获取 枚举List[code,desc ]
     */
    public static <T extends Enum<T>> List<PublicEnumPojoVo> selectEnumPojoList(Class<T> pojo) {
        List<PublicEnumPojoVo> list = new ArrayList<>();
        if (pojo == null) {
            return list;
        }
        for (T stateEnum : pojo.getEnumConstants()) {
            PublicEnumPojoVo vo = new PublicEnumPojoVo();
            Method getCode = null;
            Method getDesc = null;
            try {
                getCode = pojo.getMethod("getCode", null);
                getDesc = pojo.getMethod("getDesc", null);
                vo.setValue(Integer.parseInt(getCode.invoke(stateEnum).toString()));
                vo.setDesc(getDesc.invoke(stateEnum).toString());
            } catch (NoSuchMethodException e) {
                e.printStackTrace();
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            } catch (InvocationTargetException e) {
                e.printStackTrace();
            }
            list.add(vo);
        }

        return list;
    }

    /**
     * 根据反射 class 获取 枚举List[code,desc ]
     */
    public static Map<String, List<PublicEnumPojoVo>> selectEnumPojoMap(
        EnumBuilder builder) {
        Map<String, List<PublicEnumPojoVo>> publicEnumPojoVoMap = Maps
            .newHashMapWithExpectedSize(4);
        if (builder == null && builder.isEmpty()) {
            return publicEnumPojoVoMap;
        }
        builder.getClassMap().entrySet().stream().forEach(entry ->
            publicEnumPojoVoMap.put(entry.getKey(), selectEnumPojoList(entry.getValue()))
        );
        return publicEnumPojoVoMap;
    }


}


public class EnumBuilder {

    private Map<String, Class> classMap = Maps.newHashMapWithExpectedSize(2);

    public static EnumBuilder newInstance() {
        return new EnumBuilder();
    }

    public EnumBuilder build(String name, Class clazz) {
        this.classMap.put(name, clazz);
        return this;
    }

    public boolean isEmpty() {
        return this.classMap.isEmpty();
    }

    public Map<String, Class> getClassMap() {
        return classMap;
    }
}

