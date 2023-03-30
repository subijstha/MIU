/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MIUQuestions;

/**
 *
 * @author subij
 */
public class DanpheArray {
      public static void main(String[] args) {
        System.out.println(isDaphne(new int[]{4, 8, 6, 3, 2, 9, 8, 11, 8, 13, 12, 12, 6}));
        System.out.println(isDaphne(new int[]{2, 4, 6, 8, 6}));
        System.out.println(isDaphne(new int[]{2, 8, 7, 10, -4, 6}));
    }

    static int isDaphne(int[] a) {
        int headCount = 0;
        int tailCount = 0;
        boolean oddFlag = false;
        for (int i = 0; i < a.length; i++) {
            if (a[i] % 2 == 0) {
                headCount++;
            } else {
                oddFlag = true;
                break;
            }
        }

        for (int j = a.length - 1; j >= 0; j--) {
            if (a[j] % 2 == 0) {
                tailCount++;
            } else {
                break;
            }
        }
        if (headCount == tailCount && oddFlag) return 1;
         return 0;
        
        
       /* 
          int headCount = 0;
        int tailCount = 0;
        boolean oddFlag = false;
        for (int i = 0; i < a.length; i++) {
            if (a[i] % 2 == 0) headCount++;
            else oddFlag = true;

            if (a[a.length - 1 - i] % 2 == 0) tailCount++;

            if (headCount != tailCount) return 0;
        }

        if (oddFlag) return 1;
        return 0; */
    }
}
