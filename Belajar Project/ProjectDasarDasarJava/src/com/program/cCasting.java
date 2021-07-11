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
public class cCasting {
    
    public static void main(String[] args) {
        
        // float a=5, b=2; // float adalah bilangan untuk pecahan
        // int hasil = a/b; // tidak dapat dicompile jika type float di eksekusi dalam integer
        // bisa juga untuk tipe data angka, atau integer menggunakan teknik "nilaiF"
        // contoh : hasil = 9f / b;   maka jika di run hasil yang akan keluar adalah 4.5
        // kenapa? dikarenakan nilai 9 itu berubah menjadi float atau f
        
        int a=5, b=2; 
        float hasil =  a / b; //dimana artinya nilai pada variabel A yang tadinya tipe data integer
                                     // beruah menjadi float jika di depannya ditambahkan (float)
                                     // ini merupakan teknik casting
        
        System.out.println(hasil);
        
        
        
        
        
        
        
        
    }
    
}
