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
public class cIfMajemuk {
  
    public static void main(String[] args) {
     
        Scanner input = new Scanner(System.in); //deklarasi ini, bisa menggunakan ctrl+space ketika lupa untuk membeli/memanggil scanner disebelumya
        
        // Pekerjaan misalkan programmer , desaigner akan diterima sebagai menantu
        // tidak diterima
        
        // Validasi
        // 1. nama tidak boleh kosong
        // 2. Pekerjaan nya harus programmer / desaigner
        System.out.println("Hai, Nama  Kamu siapa?");
        String nama = input.nextLine();

        System.out.println("Pekerjaan Kamu apa?");
        String pekerjaan = input.nextLine();
        
        if (!nama.isEmpty() && pekerjaan.equalsIgnoreCase("programmer")){
            System.out.println("Hallo " +nama + " Anda menantu Idaman Mentri Komunikasi");
        }else if (!nama.isEmpty() && pekerjaan.equalsIgnoreCase("Pesepakbola")) {
            System.out.println("Hallo " +nama + " Anda menantu Luar Biasa");
        }else{
            System.out.println("Maaf " +nama + " Anda  tidak bakat menjadi menantu Idaman");
        }
    
        
        
    }
}
