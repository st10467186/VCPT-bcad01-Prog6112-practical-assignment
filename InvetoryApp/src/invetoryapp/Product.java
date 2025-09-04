/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package invetoryapp;

/**
 *
 * @author lab_services_student
 */
public class Product { 
    //Data fields
    private String name;
    private double price; 

 

    public Product(String name, double price){  
    // Constructor 
        this.name = name; 
        this.price = price; 

    }
    // Getters 
    public String getName(){ 
        return name;  
    }
    public double getPrice(){ 
        return price; 
    }

    public void display(){
        System.out.println("Name: " + name + ", Price: R" + price); 

    }

} 

class expiringProduct extends Product{ 
    private int shelfLife; 

    public  expiringProduct(String name, double price, int shelfLife){ 
        super(name, price); 

        this.shelfLife = shelfLife;
    }
    
}
