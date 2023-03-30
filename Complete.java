/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MIUQuestions;

/**
 *
 * @author subij
 */
public class Complete {
    
    public static void main(String[] args){
        System.out.println(isComplete(new int[]{36, -28}));
        System.out.println(isComplete(new int[]{36, 28}));
        System.out.println(isComplete(new int[]{4}));
        System.out.println(isComplete(new int[]{3, 2, 1, 1, 5, 6}));
        System.out.println(isComplete(new int[]{3, 7, 23, 13, 107, -99, 97, 81}));
    }
   /* static int isComplete(int[] a){
        int isComplete =0;
    
        for(int i=0; i<a.length; i++){
            if(a[i] % 2 ==0){
                isComplete++;
                break;
            }
        }    
        for(int i=0; i<a.length; i++){
            if(isPerfectSquare(a[i])){
                isComplete++;
                break;
            }
        }
        
        for(int i=0; i<a.length; i++){
            for(int j=0; j<a.length; j++){
                if(i!=j){
                    if(a[i] +a[j] ==8){
                        isComplete++;
                        break;
                                
                    }
                        
                }
                    
            }
        }
        
        if(isComplete == 3)
            return 1;
        
        return 0;
           
           
    }
    
    static boolean isPerfectSquare(int n){
        for(int i=0; i<=n/2; i++){
            if(i*i ==n)
                return true;
        }
        return false;
    }*/
    
      static int isComplete(int[] a) {
        boolean squareFlag = false;
        boolean evenFlag = false;
        boolean sumFlag = false;
        for (int i = 0; i < a.length; i++) {
            if (a[i] % 2 == 0)
                evenFlag = true;

            if (a[i] != 1 && IsSquare.isSquare(a[i]) == 1)
                squareFlag = true;

            for (int j = i + 1; j < a.length; j++) {
                if (a[i] + a[j] == 8) {
                    sumFlag = true;
                    break;
                }
            }

            if (evenFlag && squareFlag && sumFlag)
                return 1;
        }

        return 0;
    }
}
