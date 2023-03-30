/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MIUQuestions;

/**
 *
 * @author subij
 */
public class VanillaArray {
   

    public static void main(String[] args) {
        System.out.println(isVanilla(new int[]{1, 1, 11, 1111, 1111111}));
        System.out.println(isVanilla(new int[]{11, 101, 1111, 11111}));
        System.out.println(isVanilla(new int[]{11, 222, 1111, 11111}));
        System.out.println(isVanilla(new int[]{1}));
        System.out.println(isVanilla(new int[]{11, 22, 13, 34, 125}));
        System.out.println(isVanilla(new int[]{9, 999, 99999, -9999}));
        System.out.println(isVanilla(new int[]{}));
    }

    static int isVanilla(int[] a) {
        if (a.length == 0)
            return 1;

        int digit = a[0] % 10;

        for (int arrayelement : a) {
            arrayelement = (arrayelement < 0) ? -arrayelement : arrayelement;
            while (arrayelement > 0) {
                int d = arrayelement % 10;
                arrayelement /= 10;
                if (d != digit)
                    return 0;
            }
        }
        return 1;
    }
    
}
