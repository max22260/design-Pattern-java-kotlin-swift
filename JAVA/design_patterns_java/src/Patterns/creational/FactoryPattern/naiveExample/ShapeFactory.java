package Patterns.creational.FactoryPattern.naiveExample;

import Patterns.creational.FactoryPattern.naiveExample.*;

public class ShapeFactory {

    public Shape getShape(Shapes shapeType)  {
        return  switch (shapeType){
            case CIRCLE -> new Circle() ;
            case SQUARE ->  new Square() ;
            case RECTANGLE -> new Rectangle();
        };
    }
}
