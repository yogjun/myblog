package action.iterator;

import java.util.List;

public interface Aggregate {
    void add(Object o);
    void remove(Object o);
    Iterator getIterator(List list);
}
