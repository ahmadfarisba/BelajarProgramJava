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
public class cSwitchCase {

    //private static int jumlahAyam;
    public static void main(String[] args) {
      
        // Setiap hari nya peternak ayam akan ditanya tentang pasokan ayam setiap kandang
        // kemudian untuk menambahkan 10 ayam itu mesti ada 2-5 ayam kedalam kandang
        // Apabila dikandang ayam itu hanya ada 1 ayam, itu perlu ditambahkan 15 ayam kedalam kandang
        // Jika lebih dari 6, hanya akan di tambahkan 1 ayam
        
        int ayam, jumlahAyam, banyakAyam;
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("Halo Pak Sugita, berapakah jumlah ayam diKandang tersebut hari ini? ");
        banyakAyam = input.nextInt();
        jumlahAyam = banyakAyam;

        switch (jumlahAyam) 
        {
            case 1 :
                System.out.println("Tolong Masukan 15 ayam kedalam Kandang ya, Pak Sugita");
                ayam = jumlahAyam+15;
                System.out.println("Baik Pak, Sekarang jumlah Ayam dikandang sudah " + ayam + " ekor");
            
                break;
            
            case 2 :
            case 3 :
            case 4 :       
            case 5 :
                System.out.println("Tolong Masukan 10 ayam kedalam Kandang ya, Pak Sugita");
                ayam = jumlahAyam+10;
                System.out.println("Baik Pak, Sekarang jumlah Ayam dikandang sudah " + ayam + " ekor");      
                
                break;
                
            case 6 :
                System.out.println("Tolong Masukan 1 ayam kedalam Kandang ya, Pak Sugita");
                ayam = jumlahAyam+1;
                System.out.println("Baik Pak, Sekarang jumlah Ayam dikandang sudah " + ayam + " ekor");
            
                break;
          default:
                System.out.println("Baik Pak jika sudah ada " +jumlahAyam +" Ekor, tidak Perlu masukan ayam lagi kedalam kandang ya, Pak Sugita");
                //ayam = jumlahAyam+1;
                System.out.println("Baik Pak Faris");
        }
       
        

        
    }
}
