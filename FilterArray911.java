/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MIUQuestions;

/**
 *
 * @author subij
 */
public class FilterArray911 {
    
     public static void main(String[] args) {
        System.out.println(isFilter(new int[]{1, 2, 3, 9, 6, 11}));
        System.out.println(isFilter(new int[]{3, 4, 6, 7, 14, 16}));
        System.out.println(isFilter(new int[]{1, 2, 3, 4, 7, 9,10, 11, 13}));
        System.out.println(isFilter(new int[]{3, 6, 5, 5, 13, 6, 13}));
        System.out.println(isFilter(new int[]{9, 6, 18}));
        System.out.println(isFilter(new int[]{4, 7, 13}));
    }
      static int isFilter(int[] a) {
        boolean cond1 = true;
        boolean cond2 = true;

        for (int i = 0; i < a.length; i++) {

            if (a[i] == 9) {
                for (int j = 0; j < a.length; j++) {
                    if (a[j] == 11) {
                        cond1 = true;
                        break;
                    } else cond1 = false;
                }
            }

            if (a[i] == 7) {
                for (int k = 0; k < a.length; k++) {
                    if (a[k] == 13) {
                        cond2 = false;
                        break;
                    } else cond2 = true;
                }
            }

        }

        if (cond1 && cond2) return 1;
        else return 0;
    }

     
     /*
       static int isFilter(int[] a) {
        boolean cond9Flag = false;
        boolean cond7Flag = false;
        boolean cond11Flag = false;
        boolean cond13Flag = false;

        for (int i = 0; i < a.length; i++) {
            if (a[i] == 9) {
                cond9Flag = true;
            }  if (a[i] == 11) {
                cond11Flag = true;
            } if (a[i] == 7) {
                cond7Flag = true;
            }  if (a[i] == 13) {
                cond13Flag = true;
            }
        }

        if ((cond9Flag && cond11Flag) || (cond7Flag && !cond13Flag) || (!cond9Flag && !cond7Flag))
            return 1;
        return 0;
    }*/
}
