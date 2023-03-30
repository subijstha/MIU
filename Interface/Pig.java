/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Interface;

/**
 *
 * @author subij
 */
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Interface;

/**
 *
 * @author subij
 */
public class Pig implements Animal {
    public void animalSound(){
        System.out.println("The Pig says: wee wee");
    }
    
    public void sleep(){
        System.out.println("I am sleepy");
    }
}

class Main{
    public static void main(String[] args){
        Pig myPig = new Pig();
        myPig.animalSound();
        myPig.sleep();
    }
}
