/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MIUQuestions;

/**
 *
 * @author subij
 */
public class NewClass {
    
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
    public static int is121Array(int[] a) {
		int pre2countof1 = 0;
		int post2countof1= 0;
		int mid2count = 0;
		for (int i = 0; i < a.length; i++) {
			if (a[i] == 1) {
				if(mid2count==0){
					pre2countof1++;
				}
				else{
					post2countof1++;
				}
			}
			else if(a[i]==2&&post2countof1==0){
				mid2count++;
			}
			else{
				return 0;
			}
		}
		if(pre2countof1!=post2countof1||mid2count==0|| pre2countof1==0&&post2countof1==0){
			return 0;
		}
		return 1;

	}
}
