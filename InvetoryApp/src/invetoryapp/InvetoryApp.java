/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package invetoryapp;
import java.util.Scanner;
/**
 *
 * @author lab_services_student
 */
public class InvetoryApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //I used ChatGPT to plan, debug and add changes if necesary
         
        Scanner scanner = new Scanner(System.in); 

        Product[] products = new Product[5];

        int count = 0; 

 

        while (true){ 
            System.out.println("INVENTORY APPLICATION");
            System.out.println("----------------------");
            
            System.out.println("1. Add Product");
            System.out.println("2. Show Products"); 
            System.out.println("3. Exit"); 
            System.out.print("Choose an option: "); 

            int choice = scanner.nextInt(); 
            scanner.nextLine(); 

            if(choice == 1){ 
                if(count >= products.length){
                    System.out.println("Inventory full!");
                    continue;
                }
                System.out.print("Product name: "); 
                String name = scanner.nextLine(); 
                System.out.print("Price: r");
                double price = scanner.nextDouble(); 
                scanner.nextLine();
  
                System.out.print("Is it expiring? (yes/no): ");
                String expire = scanner.nextLine(); 

                if(expire.equalsIgnoreCase("yes")){ 

                    System.out.print("Time to expire: "); 
                    int days = scanner.nextInt(); 
                    scanner.nextLine();
                    products[count] = new expiringProduct(name, price, days); 
                }else{ 
                    products[count] = new Product(name, price); 

                } 
                count++; 

                System.out.println("Product added");
            }  

            else if(choice == 2){ 
                if(count == 0){ 
                    System.out.println("No products yet."); 
                    continue; 

                }
                for(int i = 0; i < count; i++){ 
                    products[i].display(); 
                    System.out.println("---");
                } 

            }  

            else if(choice == 3){
                System.out.println("Exiting..."); 

                break; 

            }  

            else { 

                System.out.println("Invalid choice!"); 

            } 

        } 

        scanner.close(); 

    } 
    
    
}
