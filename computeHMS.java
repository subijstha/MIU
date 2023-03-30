/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MIUQuestions;
import java.util.Arrays;
/**
 *
 * @author subij
 */
public class computeHMS {
    
    public static void main(String[] args){
       System.out.println(Arrays.toString(computeHMS(3735)));
    }
    
    
    static int[] computeHMS(int seconds){
        int[] time = new int[3];
        
        int hour = 0;
        int minute =0;
        int second = 0;
        
        hour = seconds/3600;
        seconds = seconds %3600;
        time[0] = hour;
        
        minute = seconds/60;
        seconds = seconds%60;
        time[1] = minute;
        
        second = seconds;
        time[2] = second;
        
        return time;
    }
}
