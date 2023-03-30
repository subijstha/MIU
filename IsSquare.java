/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MIUQuestions;

/**
 *
 * @author subij
 */
public class IsSquare {
    public static void main(String[] args){
        int result = isSquare(4);
        System.out.println(result);
        
        result = isSquare(9);
        System.out.println(result);
        
        result = isSquare(25);
        System.out.println(result);
        
        result = isSquare(-4);
        System.out.println(result);
        
        result = isSquare(8);
        System.out.println(result);
        
        result = isSquare(0);
        System.out.println(result);
    }
    
    static int isSquare(int n){
        int isSquare = 0;
        if(n<0){
            return 0;
        }
        for(int i=0; i<=n/2;i++){
            if(i*i == n){
                isSquare = 1;
                break;
            }
        }
        return isSquare;
    }
    
}
