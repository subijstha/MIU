/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MIUQuestions;

/**
 *
 * @author subij
 */
public class StantonMeasure {
    
    public static void main(String[] args){
        int result = stantonMeasure(new int[] {1});
		System.out.println(result);
		result = stantonMeasure(new int[] {0});
		System.out.println(result);
		result = stantonMeasure(new int[] {3, 1, 1, 4});
		System.out.println(result);
		result = stantonMeasure(new int[] {1, 3, 1, 1, 3, 3, 2, 3, 3, 3, 4});
		System.out.println(result);
		result = stantonMeasure(new int[] {});
		System.out.println(result);
        
    }
    
    static int stantonMeasure(int[ ] a){
        int measure = 0;
        int count1 = 0;
      
        for(int i=0; i<a.length; i++){
            if(a[i] ==1){
                count1++;
            }
        }
        for(int i=0; i<a.length; i++){
            if(a[i]== count1){
                measure++;
            }
        }
        return measure;
    }
}
