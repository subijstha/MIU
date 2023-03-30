/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MIUQuestions;

/**
 *
 * @author subij
 */
public class Solve10 {
    public static void main(String[] args){
        int[] result = solve10();
        for(int number : result){
            System.out.println(number);
        }
    }
    
    static int[] solve10(){
      /*  int[] solve10 = new int[2];
        int x = 0;
        int y = 0;
        int tenFact = 1;
        boolean factFound = false;
        
        for(int i=1; i<=10; i++){
            tenFact = tenFact *i;
        }
        
        for(x = 0; x<10 ; x++){
            int xFact = 1;
            if(x>0){
                for(int i = 1; i<=x ; i++){
                 xFact = xFact * x;
                }
            }
            
            for(y = 0; y<10; y++){
                int yFact = 1;
                if(y>0){
                    for(int j=1; j<y; j++){
                        yFact = yFact * y;
                    }
                }
                
                if(xFact * yFact == tenFact ){
                    factFound = true;
                    break;
                }
                       
            }
            
            if(factFound){
                break;
            }
            
        }
        
        if(x==10 && y==10){
            x=0;
            y=0;
        }
        solve10[0]= x;
        solve10[1]= y;
        
        return solve10;*/
      
      
      int[] solve10 = new int[2];
      int i= 0,j=0;
      for( i =1; i<10; i++){
          for( j=i+1; j<10; j++){
              if(fact(i) * fact(j) == fact(10)){
                  solve10[0] = i;
                  solve10[1] = j;
                  return solve10;
              }
          }
           
      }
      if(i ==10 && j==10){
          solve10[0] =0;
          solve10[1] =0;
          
      }
      return solve10;
    }
    
    static int fact(int n){
        
        if(n == 0 || n==1) return 1;
        else{  
        return (n*fact(n-1));}
    }
      
       /*
        int fact10 = factorial(10);
        int[] resultArray = new int[2];
        int[] tempArray = new int[10];

        for (int i = 0; i < 10; i++) {
            tempArray[i] = factorial(i);
        }

        for (int i = 0; i < 10; i++) {
            for (int j = i + 1; j < 10; j++) {
                if (tempArray[i] * tempArray[j] == fact10) {
                    resultArray[0] = i;
                    resultArray[1] = j;
                    return resultArray;
                }
            }
        }
        return resultArray;
    }

    private static int factorial(int n) {
        if (n == 1 || n == 0)
            return 1;
        else return (n * factorial(n - 1));
    }
*/
}
