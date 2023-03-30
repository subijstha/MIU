/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MIUQuestions;

/**
 *
 * @author subij
 */
public class isCentered15 {
    public static void main(String[] args){
		int result = isCentered15(new int[] {3, 2, 10, 4, 1, 6, 9});
		System.out.println(result);
		result = isCentered15(new int[] {2, 10, 4, 1, 6, 9});
		System.out.println(result);
		result = isCentered15(new int[] {3, 2, 10, 4, 1, 6});
		System.out.println(result);
		result = isCentered15(new int[] {1, 1, 8, 3, 1, 1});
		System.out.println(result);
		result = isCentered15(new int[] {9, 15, 6});
		System.out.println(result);
		result = isCentered15(new int[] {1, 1, 2, 2, 1, 1});
		System.out.println(result);
		result = isCentered15(new int[] {1, 1, 15, -1, -1});
		System.out.println(result);
	}

	static int isCentered15(int[] a){
		int isCentered15 = 0;
		int lowIndex = 0;
                int upIndex = 0;
                
                if(a.length % 2 == 0){
                    lowIndex = (a.length /2 )-1 ;
                    upIndex = (a.length /2);
                }else{
                    lowIndex = (a.length - 1)/2;
                    upIndex = lowIndex;
                }
                
                while(lowIndex>0 && upIndex<a.length){
                    int sum =0;
                    for(int i = lowIndex; i<=upIndex ; i++){
                        sum += a[i];
                    }
                    if(sum==15){
                        isCentered15 = 1;
                        break;
                    }
                    lowIndex--;
                    upIndex++;
                }
                   
		return isCentered15;
        }
}
