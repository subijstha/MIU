/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pattern;
import java.util.Scanner;

/**
 *
 * @author subij
 */
public class Pattern5 {
    
    public static void main(String[] args){
        
        int i,j,weed;
        
        System.out.print("Enter any number less than 10: ");
        Scanner sc = new Scanner(System.in);
        
        weed = sc.nextInt();
        
        //added just to set the limit works fine without this if
        
        if(weed<10){
            
            for(i=1; i<=weed ; i++){
                int num;  //initializing num to print 0 and 1
          
                //if is used to check if the row is odd count or even count. if even count start with printing 0 else with 1.
                if(i%2 == 0){
                    num = 0; 
                    for(j=1;j<=weed;j++){ 
                        System.out.print(num);
                        num = (num==1)? 0:1; //to place 0 and 1 at alternate place
                    }
                        
                    
                }else{
                    num = 1;
                    for(j=1; j<=weed; j++){
                        System.out.print(num);
                        num = (num==0)? 1 : 0;
                    }
                }
                System.out.println();
                
            }
            
        }else{
            System.out.println("Number Greater than 10. Please try again with number less than 10");
        }
    }
    
}
