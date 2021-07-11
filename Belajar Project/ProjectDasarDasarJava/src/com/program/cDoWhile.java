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
public class cDoWhile {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("Masukan Batas :");
        int batas = input.nextInt();
        
        System.out.print("Masukan Nilai Awal :");
        int nilaiAwal = input.nextInt();
        
        do {            
            System.out.println(nilaiAwal); //aksi yang akan dilakukan
            nilaiAwal++; //step atau langkah langkahnya
            batas--;
        } while (nilaiAwal <= batas); //pengecekann kembali
        
        System.out.println("Nilai Awal sekarang\n" +nilaiAwal);
        System.out.println("Nilai Batas Sekarang\n" +batas);
    }
}
