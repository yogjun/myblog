package action.visitor;

import java.util.ArrayList;
import java.util.List;

public class Structure {
    private List<Element> elementList = new ArrayList<Element>();
    public void add(Element element){
        elementList.add(element);
    }
    public void remove(Element element){
        elementList.remove(element);
    }
    public void accept(Visitor visitor){
        for (Element element:elementList) {
            element.accept(visitor);
        }
    }
}
