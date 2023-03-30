/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MIUQuestions;

/**
 *
 * @author subij
 */
public class SequentiallyBounded {
      public static void main(String[] args) {
        System.out.println(isSequentiallyBounded(new int[]{2, 3, 3, 99, 99, 99, 99, 99}));
        System.out.println(isSequentiallyBounded(new int[]{2, 3, 3, 3, 3}));
        System.out.println(isSequentiallyBounded(new int[]{0,12, 12, }));
        System.out.println(isSequentiallyBounded(new int[]{0}));
        System.out.println(isSequentiallyBounded(new int[]{0, 1}));
        System.out.println(isSequentiallyBounded(new int[]{-1, 2}));
        System.out.println(isSequentiallyBounded(new int[]{}));
        System.out.println(isSequentiallyBounded(new int[]{5, 5, 5, 5}));
         System.out.println(isSequentiallyBounded(new int[]{3}));
        System.out.println(isSequentiallyBounded(new int[]{5, 5, 5, 2, 5}));
    }
      
      static int isSequentiallyBounded(int[] a){
          int count = 1;
          
          if(a.length ==1 && a[0] <=0 )
              return 0;
          
          for(int i=0; i<a.length-1 ; i++){
              if(a[i]>a[i+1]){
                 return 0;
              }
              
              if(a[i]==a[i+1])
                  count++;
              else
                  count = 1;
              
              if(a[i] <=  count)
                  return 0;
          }
          return 1;
      }
}
