/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MIUQuestions;

/**
 *
 * @author subij
 */
public class stackedNumber {
    public static void main(String[] args){
        System.out.println(isStacked(6));
        System.out.println(isStacked(7));
        System.out.println(isStacked(10));
        System.out.println(isStacked(15));
        System.out.println(isStacked(21));
        System.out.println(isStacked(20));
        
    }
    
    static int isStacked(int n){
        int isStacked = 0;
        int sum = 0;
        if(n>0){
            for(int i=1; i<=n ; i++){
                if(sum < n){
                    sum += i;
                }
                if(sum == n){
                    isStacked = 1;
                    break;
                }
            }
        }
        return isStacked;
    }
}
