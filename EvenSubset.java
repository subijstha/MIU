/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MIUQuestions;

/**
 *
 * @author subij
 */
public class EvenSubset {
    
    
    public static void main(String[] args){
        System.out.println(isEvenSubset(2,6));
         System.out.println(isEvenSubset(6,2));
          System.out.println(isEvenSubset(18,12));
           System.out.println(isEvenSubset(18,32));
           
    }
    static int isEvenSubset(int m, int n){
       /* for(int i=2; i<m ; i+=2 ){
            if(m%i == 0 && n%i != 0 )
                return 0;
        }*/
       
        for(int i=2; i<m ; i++ ){
            if(i%2==0 && m%i == 0 && n%i != 0 )
                return 0;
        }
        
        return 1;
    }
    
}
