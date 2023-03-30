/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MIUQuestions;

/**
 *
 * @author subij
 */
public class SameNumberOfFactors {
    
    public static void main(String[] args){
        System.out.println(sameNumberOfFactors(-6,21));
        System.out.println(sameNumberOfFactors(6,21));
        System.out.println(sameNumberOfFactors(23,97));
        System.out.println(sameNumberOfFactors(0,1));
        System.out.println(sameNumberOfFactors(0,0));
    }
    static int sameNumberOfFactors(int n1, int n2){
        if(n1<0 || n2<0)
            return -1;
        
        if(factors(n1) == factors(n2))
            return 1;
        
        return 0;
    }
    
    static int factors(int n){
        int count =0;
        for(int i=1; i<=n; i++){
            if(n%i ==0)
                count++;
        }
             return count;
    }
}
