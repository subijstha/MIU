/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MIUQuestions;

/**
 *
 * @author subij
 */
public class ContinuosFactored {
      public static void main(String[] args) {
        System.out.println(isContinuousFactored(6));
        System.out.println(isContinuousFactored(60));
        System.out.println(isContinuousFactored(120));
        System.out.println(isContinuousFactored(90));
        System.out.println(isContinuousFactored(121));
        System.out.println(isContinuousFactored(2));
        System.out.println(isContinuousFactored(1320));
    }

    static int isContinuousFactored(int n) {
           
           
           int j =2;
           for(int i=2; i<n; i=j){
               int product =1;
                while(product < n){
                    product = product * i;
                    i++;
                }
                    
             if(product == n) return 1;
             j++;
       
           }
        return 0;
    }
}
