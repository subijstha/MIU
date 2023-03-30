/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AbsClass;

/**
 *
 * @author subij
 */
public class Second {
    public static void main(String[] args){
        Student myObj = new Student();
        
        System.out.println("Name : " + myObj.name);
        System.out.println("Age : " + myObj.age);
        System.out.println("Graduted in : " + myObj.graduationYear);
        myObj.open();
        
    }
}
