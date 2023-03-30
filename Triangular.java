/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MIUQuestions;

/**
 *
 * @author subij
 */
public class Triangular {
    
    public static void main(String[] args){
        System.out.println(isTriangular(1));
        System.out.println(isTriangular(2));
        System.out.println(isTriangular(3));
        System.out.println(isTriangular(4));
        System.out.println(isTriangular(5));
        System.out.println(isTriangular(6));
        System.out.println(isTriangular(10));
        System.out.println(isTriangular(8));
        
        
    }
    static int isTriangular(int n){
        int sum =0;
        for(int i=1; sum<=n; i++){
            sum += i;
            
            if(sum ==n)
                return 1;
            
                        
        }
        return 0;
    }
}
