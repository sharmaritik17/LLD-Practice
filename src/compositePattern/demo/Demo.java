package compositePattern.demo;

import compositePattern.service.Graphic;
import compositePattern.service.impl.Circle;
import compositePattern.service.impl.Rectangle;
import compositePattern.service.impl.composite.Group;

public class Demo {
    public static void main(String[] args) {
        Graphic circle1 = new Circle();
        Graphic rectangle1 = new Rectangle();
        Graphic rectangle2 = new Rectangle();

        Group group1 = new Group();
        group1.add(circle1);
        group1.add(rectangle1);

        Group group2 = new Group();
        group2.add(rectangle2);
        group2.add(group1);

        group2.draw();
    }
}
