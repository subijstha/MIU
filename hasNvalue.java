/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MIUQuestions;

/**
 *
 * @author subij
 */
public class hasNvalue {
     public static void main(String[] args) {
        System.out.println(hasNValues(new int[]{1, 2, 2, 1}, 2));
        System.out.println(hasNValues(new int[]{1, 1, 1, 8, 1, 1, 1, 3, 3}, 3));
        System.out.println(hasNValues(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10}, 10));
        System.out.println(hasNValues(new int[]{1, 2, 2, 1}, 3));
        System.out.println(hasNValues(new int[]{1, 1, 1, 8, 1, 1, 1, 3, 3}, 2));
        System.out.println(hasNValues(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10}, 20));
    }
     
     
    
/*
    static int hasNValues(int[] a, int n) {

        if (a.length < n)
            return 0;

        int[] uniqueArray = new int[n];
        int totalAdded = 0;
        boolean uniqueFlag;

        for (int anA : a) {
            uniqueFlag = false;
            for (int anUnique : uniqueArray) {
                if (anA == anUnique) {
                    uniqueFlag = true;
                    break;
                }
            }
            if (!uniqueFlag) {
                if (totalAdded >= n) return 0;
                uniqueArray[totalAdded] = anA;
                totalAdded++;
            }
        }

        if (totalAdded == n) return 1;
        return 0;
    }*/
    
    static int hasNValues(int[] a, int n){
        if(a.length <n) return 0;
        
        int[] dummy = new int[n];
        
        int count =0;
        
        int flag =0;
        
        for(int i=0; i<a.length ; i++){
            flag =0;
            for(int j=0; j<n; j++){
               if(a[i] ==  dummy[j]){
                   flag =1;
                   break;
               }
            }
            if(flag == 0){
                if(count>=n) return 0;
                dummy[count] = a[i];
                count++;
            }
            
        }
        
        if(count == n) return 1;
       
        return 0;
    }
}
