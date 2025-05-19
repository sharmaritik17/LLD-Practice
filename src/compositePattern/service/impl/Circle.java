package compositePattern.service.impl;

import compositePattern.service.Graphic;

public class Circle implements Graphic {
    @Override
    public void draw() {
        System.out.println("Drawing Circle");
    }
}
