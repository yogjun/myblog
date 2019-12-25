package structure.compsite;

public interface Component {
    void add(Component c);
    void remove(Component c);
    Component getChildren(int i);
    void operation();
}
