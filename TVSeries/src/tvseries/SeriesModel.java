/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tvseries;

/**
 *
 * @author lab_services_student
 */
public class SeriesModel{

 //Data fields 

    public int seriesID; 
    public String seriesName; 
    public int seriesAge; 
    public int noOfEpi; 

    //Constructor 
    public SeriesModel(){ 

    } 

    //use when i search 
    public boolean matchesID(int id){ 
        return this.seriesID == id; 

    } 

     
}
