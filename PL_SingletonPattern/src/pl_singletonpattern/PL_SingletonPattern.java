/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pl_singletonpattern;

/**
 *
 * @author alexa
 */
public class PL_SingletonPattern {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       //error; private constructor
       //SingleObject object = new SingleObject(); 
       
       SingleObject object = SingleObject.getInstance();
       object.showMessage();
       //object.hitung();
       //object.jumlah();
    }
    
}
