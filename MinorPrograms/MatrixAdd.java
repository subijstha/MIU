/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MinorPrograms;

/**
 *
 * @author subij
 */
public class MatrixAdd {
    
    static int [][] mat1 ={ {1,2,3}, {4,5,6}};
    static int [][] mat2 = {{2,4,6},{3,6,9}};
    static int [][] mat3 = {{0,0,0},{0,0,0}};
    
    public static void main(String[] args){
        
       // if (mat1.length == mat2.length ){
            
        
            for( int i=0; i<mat1.length; i++){
                for(int j=0;j<mat1[i].length; j++){
                System.out.println("Setting value of i "+ i + " and j " + j);
            
                mat3[i][j] = mat1[i][j] + mat2[i][j];
                }
                System.out.println();
            
       // }else{
          //  System.out.print("aMatrix order is not same sp addition is not possible.");
        } for( int i=0; i<mat1.length; i++){
                for(int j=0;j<mat1[i].length; j++){
                
                System.out.print(mat3[i][j] +  " ");
                mat3[i][j] = mat1[i][j] + mat2[i][j];
                }
                System.out.println();
            
            
            
    }
}}
           
