/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AbsClass;

/**
 *
 * @author subij
 */
abstract class AbstractClass {
    public String name = "Subij";
    public int age = 24;
    public abstract void open();
    
}

class Student extends AbstractClass{

    public int graduationYear = 2019;
    
    @Override
    public void open() {
        System.out.println("Opened to all during my working hour");// Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
 
}