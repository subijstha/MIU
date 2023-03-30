/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MinorPrograms;

/**
 *
 * @author subij
 */
public class FibonacciUsingRec {
    static int a= 0, b = 1,c;
    public static void main(String[] args){
        
        System.out.print(a + " " + b);
        
        FibonacciUsingRec rec = new FibonacciUsingRec();
        rec.Fib(20);
        
    }
   
    void Fib(int i){
        if(i>=1){
            c = a+b;
            System.out.print(" "+c);
            a = b;
            b = c;
            Fib(i-1);
        }
    }
}
