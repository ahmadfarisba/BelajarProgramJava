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
public class cWhile {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("Masukan Batas :");
        int batas = input.nextInt();
        
        System.out.print("Masukan Nilai Awal :");
        int nilaiAwal = input.nextInt();
        
        while(nilaiAwal >= batas) {            
            //Action yang ingin dilakukan apa
            System.out.println(nilaiAwal);
            nilaiAwal--; //nilaiAwal++; ini dimanakan inkremen atau increase (naik)
        }
        
        
        
        
        
        
        
    }
}
