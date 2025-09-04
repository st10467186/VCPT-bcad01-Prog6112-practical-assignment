/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tvseries;

import java.util.Scanner;

/**
 *
 * @author lab_services_student
 */
public class TVSeries {
 public static void main(String[] args){
     //I used ChatGPT to debug and accuratetly match my variables and class objects 

    // Scanner 
    Scanner scanner = new Scanner(System.in); 
     
    //Class object 
    SeriesModel seriesmodel = new SeriesModel(); 
    Series series = new Series(); 
    
    //Program start 
    System.out.println("Press 1 to launch menu or any other key to exit:"); 
    String startInput = scanner.nextLine(); 
    if (!startInput.equals("1")){ 
    System.out.println("Exiting program. Goodbye!"); 
    scanner.close(); 
    System.exit(0); 
    } 
 
    System.out.println("Latest series - 2026"); 
    System.out.println("***********************************");
     
    int choice; 
 
    //Menu options 
    String[] menuOptions = {"(1).Capture series.", "(2).Search series", "(3).Update series age restriction.", "(4)>Delete Series", "(5).Print series report - 2026", "(6).Exit Application." 
    }; 
 
    do { 
         
        System.out.println("Please select on of the following"); 
        for (String option : menuOptions){ 
            System.out.println(option); 
        } 
        System.out.print("Enter your choice: "); 
 
        // Validate menu choice 
        while (!scanner.hasNextInt()){ 
            System.out.println("Invalid choice. Enter a number 1-6."); 
            scanner.next(); 
        } 
        choice = scanner.nextInt(); 
        scanner.nextLine(); 
 
        switch (choice){ 
            case 1: 
                // (1). Capture Series  
                series.captureSeries(); 
                break; 
            case 2://(2)Search Series 
                series.addSeries(new SeriesModel()); 
                series.promptToSearch(); 
                 
              break; 
 
            case 3: 
                series.updateAge(choice); 
                break; 
 
            case 4: 
                series.deleteSeries(choice); 
                break; 
 
            case 5: 
                series.seriesReport(); 
                break; 
 
            case 6: 
                series.exitSeriesApp(); 
                break; 
 
            default: 
                System.out.println("Invalid option. Please try again."); 
        } 
 
    } while (choice != 6); 
 
    scanner.close(); 
} 
  
    
    
}
