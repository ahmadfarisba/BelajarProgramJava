/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.program;

/**
 *
 * @author Intel
 */
public class cArray {
    
    public static void main(String[] args) {
        // array 2 dimensi
        // assignment
        int[][] angka2 = {{2,4,5,7,8},{12,20,41,52}};
    
        
        for (int i = 0; i < angka2.length; i++) {
            
            for (int index = 0; index < angka2[i].length; index++) {
                System.out.print(angka2[i][index] + " ");
              }
            System.out.println();
        }
        
        
        //deklarasi
        
        int[][] bilangan = new int[3][5];
        bilangan[1][2] = 5;
        bilangan[0][2] = 5;
        bilangan[2][2] = 5;
        
         System.out.println();

         for (int i = 0; i < bilangan.length; i++) {
            
            for (int index = 0; index < bilangan[i].length; index++) {
                System.out.print(bilangan[i][index] + " ");
              }
            System.out.println();
        }
        
        
        
        
        
        
        
        
        
    } 
}
