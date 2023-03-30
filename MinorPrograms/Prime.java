/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MinorPrograms;
import java.util.Scanner;


/**
 *
 * @author subij
 */
public class Prime {
    public static void main(String[] args){
        
        System.out.print("Enter a number: ");
        Scanner s = new Scanner(System.in);
        int num = s.nextInt();
        int flag = 0;
        
        if(num == 1 || num == 0 ){
            
            System.out.println(" Neither prime nor Composite ");
            
        }else if(num<0){
            System.out.println("Invalid choice. ");
        }
        else{
            
            for(int i=2; i<=num-1; i++){
                
                if(num%i == 0){
                     flag = flag + 1;
                }
                
            }
            if(flag == 0){
                System.out.println("Number is Prime. ");
            }else{
                System.out.println("Number is not Prime. ");
            }
        }
        
    }
}
