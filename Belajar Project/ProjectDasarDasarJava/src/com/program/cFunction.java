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
public class cFunction {
     
    public static void main(String[] args) {
        ucapan("Abdul");
        System.out.println("Jumlah perkalian adalah " +  perkalian(3,9));
    }
    // Prosedur, sebuah fungsi yang tidak mengembalikan nilai
    public static void ucapan(String nama)
    {
        System.out.println("Selamat Siang "+ nama);
    }       
    
    // Function, sebuah fungsi yang membalikan nilai
    public static int perkalian(int x, int y)
    {
        return x*y;
    }       
  
    // Method, sebuah function pada java tapi dalam istilah OOP
    // Jika didalam prosedural itu disebut function, namun jika di Java karena menganut OOP
    // sehingga di sebutnya method.
    // jadi untuk Prosedur dan Function diatas adalah jenis Method di Java
    
}
