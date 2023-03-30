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
public class IntegerBasedRounding {
      public static void main(String[] args) {
        int[] a = new int[]{1, 2, 3, 4, 5};
        doIntegerBasedRounding(a, 2);
        System.out.println(Arrays.toString(a));

        int[] b = new int[]{11, 2, 3, 4, 15};
        doIntegerBasedRounding(b, 3);
        System.out.println(Arrays.toString(b));

        int[] c = new int[]{1, 2, 3, 4, 5};
        doIntegerBasedRounding(c, -3);
        System.out.println(Arrays.toString(c));

        int[] d = new int[]{-1, -2, -3, -4, -5};
        doIntegerBasedRounding(d, 3);
        System.out.println(Arrays.toString(d));

        int[] e = new int[]{-18, 1, 2, 3, 4, 5};
        doIntegerBasedRounding(e, 4);
        System.out.println(Arrays.toString(e));

        int[] f = new int[]{1325234234, 2, 3, 4, 5};
        doIntegerBasedRounding(f, 5);
        System.out.println(Arrays.toString(f));

        int[] g = new int[]{1, 2, 3, 4, 5};
        doIntegerBasedRounding(g, 100);
        System.out.println(Arrays.toString(g));
    }
      
      static void doIntegerBasedRounding(int[] a, int n){
          if(n>0){
              for(int i=0; i<a.length; i++){
                  int j=1;
                  if(a[i]<0)
                      continue;
                  
                  while(true){
                      int prev = n * (j-1);
                      int next = n * j;
                      
                      if(a[i] >= prev && a[i] <= next){
                          if(a[i] == prev){
                              a[i] = prev;
                          }
                          else if(a[i] == next){
                              a[i] = next;
                          }
                          
                          else if(a[i] - prev == next - a[i]){
                              a[i] = next;
                          }
                          else if(a[i] - prev > next - a[i]){
                              a[i] = next;
                          }
                          else {
                              a[i] = prev;
                          }
                          
                          break;
                      }
                      j++;
                  }
              }
          }
      }
}
