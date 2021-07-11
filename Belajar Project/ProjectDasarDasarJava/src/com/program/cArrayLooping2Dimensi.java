/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.program;

import java.util.Scanner;

/**
 *
 * @author Intel
 */
public class cArrayLooping2Dimensi {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("Masukan jumlah Baris : ");
        int baris = input.nextInt();
        System.out.print("Masukan jumlah kolom : ");
        int kolom = input.nextInt();
        
        int[][] barisan = new int[baris][kolom];
        
        //program
        
        for (int iBaris = 0; iBaris < baris; iBaris++) {
            
            for (int iKolom = 0; iKolom < kolom; iKolom++) {
                
                //kalau baris yang kita inputkan genap
                if (baris % 2 == 0) {
                    
                    if (iBaris % 2 == 0){
                        barisan[iBaris][iKolom] = 0;
                    }else{
                        barisan[iBaris][iKolom] = 1;
                    }
                    
                }else{
                    if (iBaris % 2 == 0){
                        barisan[iBaris][iKolom] = 1;
                    }else{
                        barisan[iBaris][iKolom] = 0;
                    }
                }
                
            }
            
        } //tutup pengisian program 1
        
        //tampilkan program 1
        for (int iBaris = 0; iBaris < baris; iBaris++) {
                    
            for (int iKolom = 0; iKolom < kolom; iKolom++) {
                
                System.out.print(barisan[iBaris][iKolom] + " ");
                
            }

            System.out.println();
            
        }
        
        
        
        
        
        
        
        
        
    }
}
