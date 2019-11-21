package structure.proxy;

public class ServiceImpl implements AbstractService{
    @Override
    public void request() {
        System.out.println("业务处理！");
    }
}
