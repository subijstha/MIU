/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MIUQuestions;

/**
 *
 * @author subij
 */
public class SumFactor {
  public static void main(String[] args){
		int result = sumFactor(new int[] {3, 0, 2, -5, 0});
		System.out.println(result);
		result = sumFactor(new int[] {9, -3, -3, -1, -1});
		System.out.println(result);
		result = sumFactor(new int[] {1});
		System.out.println(result);
		result = sumFactor(new int[] {0, 0, 0});
		System.out.println(result);
  }
  
  static int sumFactor(int[] a){
      int sum =0;
      int sumFactor = 0;
      for(int i=0; i<a.length; i++){
          sum += a[i];
      }
      
      for(int i =0; i<a.length; i++){
          if (sum == a[i]){
              sumFactor++;
          }
      }
  
      return sumFactor;
    }
}
