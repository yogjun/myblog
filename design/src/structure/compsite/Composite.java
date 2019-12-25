package structure.compsite;

import java.util.ArrayList;
import java.util.List;

public class Composite implements Component{
    private List<Component> componentList = new ArrayList<>();

    @Override
    public void add(Component c) {
        componentList.add(c);
    }

    @Override
    public void remove(Component c) {
        componentList.remove(c);
    }

    @Override
    public Component getChildren(int i) {
        return componentList.get(i);
    }

    @Override
    public void operation() {
        for (Component c :componentList){
            c.operation();
        }
    }
}
