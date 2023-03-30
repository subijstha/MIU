/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MIUQuestions;

/**
 *
 * @author subij
 */
public class EncodeArray1 {
     public static void main(String[] args) {
        System.out.println(Arrays.toString(encodeArray(0)));
        System.out.println(Arrays.toString(encodeArray(1)));
        System.out.println(Arrays.toString(encodeArray(-1)));
        System.out.println(Arrays.toString(encodeArray(100001)));
        System.out.println(Arrays.toString(encodeArray(999)));
    }

    static int[] encodeArray(int n) {
        if (n == 0)
            return new int[]{1};

        int size = n < 0 ? 1 : 0;
        int nCopy = n < 0 ? -n : n;

        while (nCopy > 0) {
            int digit = nCopy % 10;
            nCopy /= 10;
            size += digit + 1;
        }

        int[] result = new int[size];

        nCopy = n < 0 ? -n : n;
        for (int i = size-1; i >=0; i--) {
           

            while (nCopy > 0) {
                int digit = nCopy % 10;
                nCopy /= 10;
                
                result[i] =1;
                i--;
                for (int j = 0; j < digit; j++) {
                    result[i] = 0;
                    i--;
                }
                
                
                
            }
             if (i == 0 && n < 0) {
                result[i] = -1;
            }
        }
        return result;
    }
}
