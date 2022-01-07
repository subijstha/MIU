/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MIUQuestions;

/**
 *
 * @author subij
 */
public class GuthrieSequece {
    public static void main(String[] args){
        
       int result = isGuthrieSequence(new int[] {8, 4, 2, 1});
		System.out.println(result);
		result = isGuthrieSequence(new int[] {8, 17, 4, 1});
		System.out.println(result);
		result = isGuthrieSequence(new int[] {8, 4, 1});
		System.out.println(result);
		result = isGuthrieSequence(new int[] {8, 4, 2});
		System.out.println(result);
        
        
        
    }
    
    static int isGuthrieSequence(int[] a){
        int isGuthrieSequence = 0 ;
        int sequence = a[0];
        
        if(a[a.length-1]==1){
            for(int i=0; i<a.length ; i++){
                
                if( sequence == a[i]){
                    isGuthrieSequence = 1;
                    
                    if(a[i] % 2 == 0){
                        sequence = a[i]/2;
                    }else{
                        sequence = (a[i]*3) + 1;
                    }
                       
                   
                }else{
                    isGuthrieSequence = 0;
                    break;
                }
            
            }
        }
        
        return isGuthrieSequence;
    }

   
}
