package compositePattern.service.impl;

import compositePattern.service.Graphic;

public class Rectangle implements Graphic {
    @Override
    public void draw() {
        System.out.println("Drawing Rectangle");
    }
}
