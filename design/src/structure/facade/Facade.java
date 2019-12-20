package structure.facade;

public class Facade {
    SubSys1 sys1 = new SubSys1();
    SubSys2 sys2 = new SubSys2();
    public void method(){
        sys1.method1();
        sys2.method2();
    }
}
