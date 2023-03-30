/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ArrayList;

import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author subij
 */
public class Main {
    public static void main(String[] args){
        ArrayList<String> cars = new ArrayList();
        cars.add("Tesla");
        cars.add("Ferrari");
        cars.add("Ford");
        cars.add("Mazda");
        cars.set(0,"Mustang");
        
        
        Collections.sort(cars);
        
        for(int i=0 ; i<=1-cars.size() ; i++){
           System.out.println(cars.get(i));
        }
    }
}
