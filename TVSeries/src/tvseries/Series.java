/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tvseries;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author lab_services_student
 */
public class Series {
   

//Save all series 
private ArrayList<SeriesModel>seriesList; 

//Data fields
public int seriesID;
public String seriesName;
public int seriesAge;
public int noOfEpi;

 
//Contructor 
public Series(){ 
    seriesList = new ArrayList<>(); 
}     
 
public void captureSeries(){ 
    //Declaration 
    int id, age, epi; 
    String name; 
     
     
    Scanner scanner = new Scanner(System.in); 
     
    while(true){ 
    System.out.println("---Capture Series---"); 
    System.out.print("Enter series ID: "); 
    if(scanner.hasNextInt()){ 
        id = scanner.nextInt(); 
        scanner.nextLine(); 
        break; 
    }else{ 
        System.out.print("You have entered an incorrecr series ID! \nEnter digits only: "); 
        scanner.nextLine(); 
    } 
    } 
    while(true){//Name 
        System.out.print("Enter series name: "); 
        name = scanner.nextLine().trim(); 
        if(!name.isEmpty()){ 
            break; 
        }else{ 
            System.out.print("Enter series name: "); 
        } 
    } 
    while(true){ 
        System.out.print("Enter series age restriction (2-18): "); 
        if(scanner.hasNextInt()){ 
        age = scanner.nextInt(); 
        scanner.nextLine(); 
         
        if(age>=2 && age<=18){ 
            break; 
        }else{ 
            System.out.println("You entered an incorrect series age!!!\nPlease re-enter the series age: "); 
        }  
        } 
    } 
        while(true){ 
            System.out.print("Enter number of episodes: "); 
            if(scanner.hasNextInt()){ 
                epi = scanner.nextInt(); 
                scanner.nextLine(); 
                if(epi >= 1){ 
                    System.out.println("Series captured successfuly."); 
                    break; 
                }else{ 
                    System.out.println("Enter number of episodes: "); 
                    scanner.nextLine(); 
                } 
            } 
        } 
        
//Updating the searchList

    SeriesModel newSeries = new SeriesModel(); 
    newSeries.seriesID = id; 
    newSeries.seriesName = name; 
    newSeries.seriesAge = age; 
    newSeries.noOfEpi = epi; 
    addSeries(newSeries); 
} 
//Adding to the search list 
public void addSeries(SeriesModel s){ 
    if(s != null){ 
        seriesList.add(s); 
        System.out.println("Series added: " + s.seriesName); 
} 
} 
 
 
public SeriesModel searchSeries(int id){ 
    for(SeriesModel s : seriesList){ 
        if(s.seriesID == id){ 
            return s; 
        } 
     
    } 
    return null; 
} 
public void printSeriesById(int id){ 
    SeriesModel s = searchSeries(id); 
    if(s != null){ 
        System.out.println("ID: " + s.seriesID); 
        System.out.println("Name: " + s.seriesName); 
        System.out.println("Age: " + s.seriesAge); 
        System.out.println("Number of episode: " + s.noOfEpi); 
    }else{ 
        System.out.println("Series not found."); 
    } 
 
 
} 
 
public void promptToSearch(){ 
    Scanner scanner = new Scanner(System.in); 
    //declaration 
    int id; 
     
    System.out.println("Search Series"); 
    System.out.println("-------------------------"); 
    while(true){ 
        System.out.println("Enter series ID to search: "); 
        if(scanner.hasNextInt()){ 
            id = scanner.nextInt(); 
            if(id>0) break; 
            else System.out.println("Re-enter ID."); 
        }else{ 
            System.out.println("Invalid input. Enter ID"); 
            scanner.next(); 
        } 
    } 
    SeriesModel s = searchSeries(id); 
    if(s != null){ 
        System.out.println("Series found:"); 
        System.out.println("ID: " + s.seriesID); 
        System.out.println("Name: " +s.seriesName); 
        System.out.println("Age: " + s.seriesAge); 
        System.out.println("Number of episodes: " + s.noOfEpi); 
    }else{ 
        System.out.println("Series not found."); 
    } 
    
} 
public void updateAge(int id){ 
    Scanner scanner = new Scanner(System.in); 
    SeriesModel s = searchSeries(id); 
    if(s != null){ 
        System.out.println("Update series age restrictio."); 
        System.out.println("-----------------------------"); 
        System.out.println("Age restriction: \n" + s.seriesName + ":" + s.seriesAge); 
         
        int newAge; 
        while(true){ 
            System.out.print("Enter new series age restriction (2-18+): "); 
            if(scanner.hasNextInt()){ 
            newAge = scanner.nextInt(); 
            if(newAge >= 2 && newAge <= 18){ 
                s.seriesAge = newAge; 
                break; 
            }else{ 
                System.out.println("Age must be between 2-18."); 
            } 
        }else{ 
                System.out.println("Enter a numer."); 
                scanner.next(); 
            } 
        } 
    }else{ 
        System.out.println("Series not found."); 
    } 
} 
public void deleteSeries(int id){ 
    SeriesModel s = searchSeries(id); 
     
    if(s != null){ 
        seriesList.remove(s); 
        System.out.println("Series deleted successfully."); 
    }else{ 
        System.out.println("Series not found."); 
    } 
} 
  

public void seriesReport(){ 
    if(seriesList.isEmpty()){
       System.out.println("No series found.");
       
       return;
    
    } 
    System.out.println("SERIES REPORT"); 
    System.out.println("-----------------------------"); 

    
    for(SeriesModel s: seriesList){ 
    System.out.println("ID: " + seriesID); 
    System.out.println("name: " + seriesName); 
    System.out.println("Age: " + seriesAge); 
    System.out.println("Number of episodes: " +noOfEpi); 
    System.out.println("-------------------------------"); 

  } 
  

} public void exitSeriesApp(){ 
    System.out.println("Exited"); }  
    

    
}
