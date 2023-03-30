/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Input;

import java.util.Scanner;

/**
 *
 * @author subij
 */
public class Main {
    public static void main(String[] args){
        Scanner myObj =  new Scanner(System.in);
        System.out.print("Enter name :");
        String name = myObj.nextLine();
        System.out.print("Enter age: ");
        
        int age = myObj.nextInt();
        System.out.print("Enter your salary: ");
        double salary = myObj.nextDouble();
        
        System.out.println("Name: "+ name);
        System.out.println("Age: "+ age);
        System.out.println("Salary: " + salary);
    }
}
