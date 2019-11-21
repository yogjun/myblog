package structure.proxy;

public class Proxy implements AbstractService{
    private AbstractService service;
    public Proxy() {
        service = new ServiceImpl();
    }

    @Override
    public void request() {
        beforeRequst();
        service.request();
        afterRequst();
    }

    private void beforeRequst(){
        System.out.println("预处理");
    }
    private void afterRequst(){
        System.out.println("事后处理");
    }
}
