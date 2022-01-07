/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MIUQuestions;

/**
 *
 * @author subij
 */
public class Inertial {
    
    public static void main(String[] args){
        int result = isInertial(new int[]{1});
		System.out.println(result);
		result = isInertial(new int[]{2});
		System.out.println(result);
		result = isInertial(new int[]{1, 2, 3, 4});
		System.out.println(result);
		result = isInertial(new int[]{1, 1, 1, 1, 1, 1, 2});
		System.out.println(result);
		result = isInertial(new int[]{2, 12, 4, 6, 8, 11});
		System.out.println(result);
		result = isInertial(new int[]{2, 12, 12, 4, 6, 8, 11});
		System.out.println(result);
		result = isInertial(new int[]{-2, -4, -6, -8, -11});
		System.out.println(result);
		result = isInertial(new int[]{2, 3, 5, 7});
		System.out.println(result);
		result = isInertial(new int[]{2, 4, 6, 8, 10});
		System.out.println(result);
        
    }
    static int isInertial(int[] a){
        int isInertial = 1;
        
        int maxvalue = 0;
        int evenindex = -1;
        int oddindex = -1;
        int[] oddValues = new int[a.length];
        int[] evenValues = new int[a.length];
        
        for(int i=0; i<a.length; i++){
            if(a[i]>maxvalue){
                maxvalue = a[i];
            }
            if(a[i] % 2 !=0){
                oddindex++;
                oddValues[oddindex] = a[i];
            }else{
                evenindex++;
                evenValues[evenindex] = a[i];
            }
        }
        if(oddindex <0){
            return 0;
        }
        if(maxvalue % 2 !=0){
            return 0;
        }
        
        int evenvalue = 0;
        int oddvalue = 0;
        for(int i=0; i<=oddindex && isInertial == 1 ; i++){
            oddvalue = oddValues[i];
            for(int j = 0; j<=evenindex && isInertial == 1 ; j++){
                evenvalue = evenValues[j];
                
                if(evenvalue != maxvalue){
                    if(evenvalue > oddvalue){
                         isInertial = 0;
                    }
                }
            }
        }
        
        
        
        return isInertial;
    }
}
