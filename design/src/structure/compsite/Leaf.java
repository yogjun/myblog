package structure.compsite;

public class Leaf implements Component{
    private String name;

    public Leaf(String name) {
        this.name = name;
    }

    @Override
    public void add(Component c) {

    }

    @Override
    public void remove(Component c) {

    }

    @Override
    public Component getChildren(int i) {
        return null;
    }

    @Override
    public void operation() {
        System.out.println("leaf: "+name);
    }
}
