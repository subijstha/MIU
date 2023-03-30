/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MIUQuestions;

/**
 *
 * @author subij
 */
public class SquarePair {
    public static void main(String[] args){
        int result = countSquarePairs(new int[]{11, 5, 4, 20});
		System.out.println(result);
		result = countSquarePairs(new int[]{9, 0, 2, -5, 7});
		System.out.println(result);
		result = countSquarePairs(new int[]{9});
		System.out.println(result);
                
        
    }
    
    /*static int countSquarePairs(int[] a){
        int countPairs = 0;
        
        
        for(int i=0 ; i<a.length ;i++){
            for(int j=0 ; j<a.length;j++){
                
                if(a[i]>0 && a[j]>0){
                    if(a[i]<a[j]){
                        if(isPerfectSquare( a[i] +  a[j]) == 1){
                            countPairs++;
                        }
                    }
                }
            }
        }
        return countPairs;
    }
    
    static int isPerfectSquare(int a){
        int value = 0;
        
        if(a>0){
            double sqrtResult = Math.sqrt(a);
            
            if(sqrtResult == (int)sqrtResult){
            
                value = 1;
            }else{
                value = 0;
            }
            
        }
        
        return value;
    }*/
    
    static int countSquarePairs(int[] a){
        int count =0;
        for(int i=0; i<a.length; i++){
            if(a[i]>0){
                for(int j=0; j<a.length; j++){
                    if(a[i]<a[j]){
                        if(isPerfectSquare(a[i] + a[j])){
                            count++;
                        }
                    }
                }
            }
        }
        return count;
    }
    
    static boolean isPerfectSquare(int n){
        for(int i=1; i<n; i++){
            if(i*i == n)
                return true;
        }
        return false;
    }
}
