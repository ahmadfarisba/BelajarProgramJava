/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.program;

import java.time.Clock;

/**
 *
 * @author Intel
 */
public class cIfTunggalGanda {
    
    public static void main(String[] args) {
        
        // secara sintaks. untuk tunggal dan ganda sebagai berikut ini
        // TUNGGAL
        // if (kondisi){
        //                   aksi yang akan dilakukan jika kondisi berhasil terpenuhi;
        //                  }
        
        // GANDA
        // if (kondisi){
        //                   aksi yang akan dilakukan jika kondisi berhasil terpenuhi;
        // }else{ 
        //                  aksi yang akan dilakukan jika kondisi berhasi salah;
        // }
        
        // Jika ingin membandingkan sebuah string, jangan menggunakan operator "=="
        // bisa menggunakan if (variable.equalsIgnore // variable.equalsIgnoreCase ) yang biasanya untuk password
        
        
        int nilai = 60;
        
        if (nilai >= 70) {
            System.out.println("Nilai anda Bagus");
        }else{
            System.out.println("Anda Bisa belajar Lagi");
        }
        
        
        System.out.println(nilai);
        
        
        
        
    }
}
