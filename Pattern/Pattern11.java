/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pattern;

/**
 *
 * @author subij
 */
public class Pattern11 {
    
    public static void main(String[] args){
        
        int i,j,row = 10;
        
        for(i=1 ; i<row ; i++){
            int num;
            
            //if(i%2==0){
                num = 1;
                for(j=1 ; j<=i ; j++){
                      System.out.print(num);
                
                num = (num==1)? 0 : 1;
                    
               }
                
           /* }else{
               num = 1;
                
                for(j=1; j<=i ; j++){
                System.out.print(num);
                
                num = (num==1)? 0 : 1;
               
                }
            }*/
           
            
            System.out.println();
        }
     
        
    }
}
