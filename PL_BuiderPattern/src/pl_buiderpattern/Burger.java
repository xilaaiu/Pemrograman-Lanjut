/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pl_buiderpattern;

/**
 *
 * @author alexa
 */
public abstract class Burger implements Item {
    
    @Override
    public Packing packing() {
        return new Wrapper();
    }

    @Override
    public abstract float price();
    
    
}
