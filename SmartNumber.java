/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MIUQuestions;

/**
 *
 * @author subij
 */
public class SmartNumber {
    
    public static void main(String[] args) {
        System.out.println(isSmart(11));
        System.out.println(isSmart(22));
        System.out.println(isSmart(1));
        System.out.println(isSmart(56));
        System.out.println(isSmart(46));
        System.out.println(isSmart(28));
        
    }

    static int isSmart(int n){
        int temp =1;
        int sub =1 ;
        while(temp <n){
            temp +=sub;
            sub++;
        }
        if(temp ==n)
            return 1;
        
        return 0;
    }
}
