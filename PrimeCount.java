/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MIUQuestions;

/**
 *
 * @author subij
 */
public class PrimeCount {
 
    public static void main(String[] args){
        int count;
        count = primeCount(10,30);
        System.out.println(count);
        
        count = primeCount(11,29);
        System.out.println(count);
        
        count = primeCount(20,22);
        System.out.println(count);
        
        count = primeCount(1,1);
        System.out.println(count);
        
        count = primeCount(5,5);
        System.out.println(count);
        
        count = primeCount(6,2);
        System.out.println(count);
        
        count = primeCount(-10,6);
        System.out.println(count);
        
    }
    
    static int primeCount(int start, int end){
		int primeCount = 0;
		for(int i = start; i <= end; i++){
			if(i > 1){	
				boolean isPrime = true;
				for(int j = 2; j <= i-1; j++){
					if(i % j == 0){
						isPrime = false;
						break;
					}
				}
				if(isPrime){
					primeCount++;
				}
			}
		}
		return primeCount;
	}
      
}
