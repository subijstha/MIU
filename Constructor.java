/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author subij
 */
public class Constructor {
    int modelYear;
    String modelName;
    
    public Constructor(int year, String name){
        modelYear = year;
        modelName = name;
       
    }
   
    public static void main(String[] args){
        Constructor main = new Constructor(1997, "Subij");
        System.out.println("Year: " + main.modelYear);
        System.out.println("Name: " + main.modelName);
    }
    
}
