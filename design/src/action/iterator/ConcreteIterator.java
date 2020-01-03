package action.iterator;

import java.util.List;

public class ConcreteIterator implements Iterator{
    private List list = null;
    private int index = -1;
    public ConcreteIterator(List list) {
        this.list = list;
    }

    @Override
    public Object first() {
        index = 0;
        return list.get(index);
    }

    @Override
    public Object next() {
        return list.get(index++);
    }

    @Override
    public boolean hasNext() {
        if (index < list.size() - 1) {
            return true;
        } else {
            return false;
        }
    }
}
