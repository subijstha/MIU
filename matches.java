/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MIUQuestions;

/**
 *
 * @author subij
 */
public class matches {
    public static void main(String[] args){
        int result = matches(new int[]{1,  2,  3, -5, -5,  2, 3, 18},new int[]{4,-1,3} );
        System.out.println(result);
        result = matches(new int[]{1,  2,  3, -5, -5,  2, 3, 18} ,new int[]{2,-3,-3});
        System.out.println(result);
        result = matches(new int[] {1,  2,  3, -5, -5,  2, 3, 18} , new int[]{8});
        System.out.println(result);
        
        System.out.println(matches(new int[]{1,  2,  3, -5, -5,  2, 3, 18}, new int[]{3, -2, 3} ));

   
    }
    static int matches(int[] a, int[] p){
        
        int sum = 0;
        for(int i=0;i<p.length;i++){
            
            sum += (p[i]>0 ? p[i] : -p[i]);
            
        }    
         if(sum != a.length)
                 return 0;
        int arraystart =0;
        for(int i = 0;i<p.length;i++){
            
                for( int j=0;j<(p[i]>0 ? p[i] : -p[i]);j++){
                    if(p[i]>0 && a[arraystart]<0 || p[i]<0 && a[arraystart]>0){
                        return 0;
                    }
                    arraystart++;
                }         
            
        }
        
        return 1;
    }    
        
}
