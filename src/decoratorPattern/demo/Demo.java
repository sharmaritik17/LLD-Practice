package decoratorPattern.demo;

import decoratorPattern.service.component.Coffee;
import decoratorPattern.service.component.impl.SimpleCoffee;
import decoratorPattern.service.decorator.impl.MilkDecorator;

public class Demo {
    public static void main(String[] args) {
        Coffee simpleCoffee = new SimpleCoffee();
        Coffee coffee = new MilkDecorator(simpleCoffee);
        System.out.println("Your Coffee is ready having " + coffee.getDescription());
        System.out.println("Your Bill is " + coffee.getCost());
    }
}
