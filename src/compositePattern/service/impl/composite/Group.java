package compositePattern.service.impl.composite;

import compositePattern.service.Graphic;

import java.util.ArrayList;
import java.util.List;

public class Group implements Graphic {
    private final List<Graphic> groupList = new ArrayList<>();

    public void add(Graphic graphic) {
        groupList.add(graphic);
    }

    public void remove(Graphic graphic) {
        groupList.remove(graphic);
    }

    public Graphic getChild(int i) {
        return groupList.get(i);
    }

    @Override
    public void draw() {
        System.out.println("Drawing Group:");
        for (Graphic graphic : groupList) {
            graphic.draw();
        }
    }
}
