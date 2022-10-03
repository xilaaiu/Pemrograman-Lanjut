/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pl_abstractfactorypattern.color;

import pl_abstractfactorypattern.Color; 
/**
 *
 * @author alexa
 */

public class Red implements Color{

    @Override
    public void fill() {
        System.out.println("Ini Red::fill() method.");
    }
    
}
