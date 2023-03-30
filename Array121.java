/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MIUQuestions;

/**
 *
 * @author subij
 */
public class Array121 {
    public static void main(String[] args) {
        System.out.println(is121Array(new int[]{1, 2, 1}));
        System.out.println(is121Array(new int[]{1, 1, 2, 2, 2, 1, 1}));
        System.out.println(is121Array(new int[]{1, 1, 2, 2, 2, 1, 1, 1}));
        System.out.println(is121Array(new int[]{1, 1, 2, 1, 2, 1, 1}));
        System.out.println(is121Array(new int[]{1, 1, 1, 2, 2, 2, 1, 1, 1, 3}));
        System.out.println(is121Array(new int[]{1, 1, 1, 1, 1, 1}));
        System.out.println(is121Array(new int[]{2, 2, 2, 1, 1, 1, 2, 2, 2, 1, 1}));
        System.out.println(is121Array(new int[]{1, 1, 1, 2, 2, 2, 1, 1, 2, 2}));
        System.out.println(is121Array(new int[]{2, 2, 2}));
    }
    
    static int is121Array(int[] a){
       // if(a.length <3 || a[0] != 1 || a[a.length-1]!=1)
         //   return 0;
        
        int count1left =0 , count1right =0, mid2 =0;
        for(int i=0; i<a.length;i++){
            if(a[i]==1){
                
                if(mid2 == 0){
                    count1left++;
                }
                else{
                    count1right++;
                }
                
            }else if(a[i]==2 && count1right ==0){
                mid2++;
            }else
                return 0;
                
        }
        if(count1left != count1right || mid2 ==0 || count1left ==0 && count1right ==0)
            return 0;
        return 1;
    }
}
