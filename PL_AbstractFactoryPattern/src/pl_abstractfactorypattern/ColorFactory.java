/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pl_abstractfactorypattern;

import pl_abstractfactorypattern.color.Blue;
import pl_abstractfactorypattern.color.Green;
import pl_abstractfactorypattern.color.Red;
import pl_abstractfactorypattern.shape.Circle;
import pl_abstractfactorypattern.shape.Rectangle;
import pl_abstractfactorypattern.shape.Square;

/**
 *
 * @author alexa
 */
public class ColorFactory extends AbstractFactory{

    @Override
    Color getColor(String color) {
        if (color == null)
            return null;
        
        if (color.equalsIgnoreCase("RED")) {
            return new Red();   
        }
        else if (color.equalsIgnoreCase("GREEN")) {
            return new Green();
        }
        else if (color.equalsIgnoreCase("BLUE")) {
            return new Blue();
        }
       
        return null;
    }

    @Override
    Shape getShape(String shape) {
        if (shape == null)
            return null;
        
        if (shape.equalsIgnoreCase("CIRCLE")) {
            return new Circle();   
        }
        else if (shape.equalsIgnoreCase("SQUARE")) {
            return new Square();
        }
        else if (shape.equalsIgnoreCase("RECTANGLE")) {
            return new Rectangle();
        }
       
        return null;
    }
    
}
