/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MIUQuestions;

/**
 *
 * @author subij
 */
public class MadhavArray {
    
    public static void main(String[] args){
        
        int result;
        
        result = isMadhavArray(new int[]{2,1,1});
        System.out.println(result);
        
        result = isMadhavArray(new int[]{2,1,1,4,-1,-1});
        System.out.println(result);
        
        result = isMadhavArray(new int[]{6,2,4,2,2,2,1,5,0,0});
        System.out.println(result);
        
        result = isMadhavArray(new int[]{18,9,10,6,6,6});
        System.out.println(result);
        
        result = isMadhavArray(new int[]{-6,-3,-3,8,-5,-4});
        System.out.println(result);
        
        result = isMadhavArray(new int[]{0,0,0,0,0,0,0,0,0,0,1,1,1,-2,-1});
        System.out.println(result);
        
        result = isMadhavArray(new int[]{3,1,2,3,0});
        System.out.println(result);
        
        
        
        
    }
     static int isMadhavArray(int[] a) {
        boolean correctLength = false;
        int n = 2;
        double checkLength = 1;
        while (checkLength <= a.length) {
            checkLength = n * (n + 1) / 2.0;
            if (checkLength == a.length) {
                correctLength = true;
                break;
            }
            n++;
        }
        if (!correctLength) return 0;
        int index = 1;
        for (int i = 2; index < a.length; i++) {
            int sum = 0;
            for (int j = 1; j <= i; j++) {
                sum += a[index];
                index++;
            }
            if (sum != a[0]) return 0;
        }
        return 1;
    }
  
/*
    static int isMadhavArray(int[] a){
        
        int isMadhav = 1;
        
        if(a.length<3){
            return 0;
        }
        
        int isLengthisMadhav = 0;
        
        for(int i=1; i<=a.length && isLengthisMadhav == 0 ; i++){
            if(a.length == i * (i-1) / 2 ){
                isLengthisMadhav = 1;
            }
        }
        
        if(isLengthisMadhav ==0){
            return 0;
        }
        
        int startindex = 1, round = 1;
        int firstvalue = a[0];
        int endindex = startindex + round;
        
        while(isMadhav == 1 && endindex <= a.length){
            int sum = 0;
            for(int i = startindex ; i<=endindex; i++){
                sum += a[i];
            }
            
            if(firstvalue != sum){
                isMadhav = 0;
            }
                round++;
                
                startindex = endindex + 1;
                endindex = startindex + round;
            
        }
        
        
        return isMadhav;
     }
}*/
}
