/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MIUQuestions;

/**
 *
 * @author subij
 */
public class ComputeDepth {
    
    public static void main(String[] args){
        System.out.println(computeDepth(7));
        System.out.println(computeDepth(25));
    }
    static int computeDepth(int n){
      
        boolean[] flag =  new boolean[10];
        
        for(int i=0; i<10; i++){
            flag[i] = false;
        }
         int index =1;
        
        
        while(true){
            int product = n*index;
            while(product>0){
                int rem = product % 10;
                product /= 10;
                
                if(!flag[rem]){
                    flag[rem] = true;
                }    
            }
            
            boolean finalFlag = true;
            
            for(boolean aflag : flag){
                if(!aflag)
                    finalFlag = false;
            }
            
            if(finalFlag){ 
                break;
            }
            index++;
        }
        return index;
    }
   /* boolean[] flags = new boolean[10];
        for (int i = 0; i < 10; i++) 
            flags[i] = false;
        int index = 1;
        while (true) {
            int product = n * index;
            while (product > 0) {
                int rem = product % 10;
                product /= 10;

                if (!flags[rem]) {
                    flags[rem] = true;
                }
            }

            boolean finalFlag = true;
            for (boolean aFlag : flags) {
                if (!aFlag)
                    finalFlag = false;
            }

            if (finalFlag) break;
            index++;
        }

        return index;
    }*/
    
}
