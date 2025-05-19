package protoTypePattern.demo;

import protoTypePattern.service.Shape;
import protoTypePattern.service.impl.Circle;

import java.util.ArrayList;
import java.util.List;

public class Demo {
    public static void main(String[] args) {
        List<Shape> shapes = new ArrayList<>();
        List<Shape> shapesCopy = new ArrayList<>();

        Circle circle = new Circle();
        circle.x = 10;
        circle.y = 20;
        circle.radius = 15;
        circle.color = "red";
        shapes.add(circle);

        Circle anotherCircle = (Circle) circle.clone();
        shapes.add(anotherCircle);

//        Rectangle rectangle = new Rectangle();
//        rectangle.width = 10;
//        rectangle.height = 20;
//        rectangle.color = "blue";
//        shapes.add(rectangle);

        cloneShapes(shapes, shapesCopy);
    }

    private static void cloneShapes(List<Shape> shapes, List<Shape> shapesCopy) {
        for(Shape shape : shapes) {
            shapesCopy.add(shape.clone());
        }

        for (int i = 0; i < shapes.size(); i++) {
            if (shapes.get(i) != shapesCopy.get(i)) {
                System.out.println(i + ": Shapes are different objects (yay!)");
                System.out.println(shapesCopy.get(i).color);
                System.out.println(shapesCopy.get(i).x);
                System.out.println(shapesCopy.get(i).y);
//                System.out.println(shapesCopy.get(i));
                if (shapes.get(i).equals(shapesCopy.get(i))) {
                    System.out.println(i + ": And they are identical (yay!)");
                } else {
                    System.out.println(i + ": But they are not identical (booo!)");
                }
            } else {
                System.out.println(i + ": Shape objects are the same (booo!)");
            }
        }
    }
}
