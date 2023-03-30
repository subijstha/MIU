/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MIUQuestions;

/**
 *
 * @author subij
 */
public class PowerfulCube {
    public static void main(String[] args){
        System.out.println(isCubePowerful(153));
        System.out.println(isCubePowerful(370));
        System.out.println(isCubePowerful(153));
        System.out.println(isCubePowerful(0));
        System.out.println(isCubePowerful(-81));
        
    }
    
    static int isCubePowerful(int n){
        
        int temp = n;
        int sum =0;
        
        if(n<=0) return 0;
        while(temp>0){
            
            int digit = temp%10;
            
            temp /= 10;
            
            sum += cube(digit);
            
           
        }
        
        if(sum == n)
            return 1;
        else 
            return 0;
                    
                
    }
    
    static int cube(int n){
        return n*n*n;
    }
}
