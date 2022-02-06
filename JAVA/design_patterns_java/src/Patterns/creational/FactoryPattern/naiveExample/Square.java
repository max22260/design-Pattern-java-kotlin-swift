package Patterns.creational.FactoryPattern.naiveExample;

import Patterns.creational.FactoryPattern.naiveExample.Shape;

public class Square implements Shape {


    @Override
    public void draw() {
        System.out.println("Inside Square::draw() method.");
    }
}
