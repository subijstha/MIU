/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MIUQuestions;

/**
 *
 * @author subij
 */
public class NextPerfectSquare {
    
    public static void main(String[] args){
        System.out.println(isNextPerfectSquare(0));
        System.out.println(isNextPerfectSquare(46));
    }
    static int isNextPerfectSquare(int n){
        int square =0;
        int i=1;
        while(square<n){
            square = i*i;
            i++;
        }
        
        
        return square;
        
    }
}
