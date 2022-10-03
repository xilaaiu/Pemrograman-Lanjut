/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pl_buiderpattern;

/**
 *
 * @author alexa
 */
public class PL_BuiderPattern {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        MealBuilder mealBuilder = new MealBuilder();
        
        Meal vegMeal = mealBuilder.prepareVegMeal();
        System.out.println("VEG MEAL");
        vegMeal.showItems();
        System.out.println("Total cost: " + vegMeal.getCost());
        
        System.out.println("=======");
        
        Meal nonVegMeal = mealBuilder.prepareNonVegMeal();
        System.out.println("NON-VEG MEAL");
        nonVegMeal.showItems();
        System.out.println("Total cost: " + nonVegMeal.getCost());
    }
    
}
