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
public class cSnannerUserInput {
    
    public static void main(String[] args) {
        
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("Masukan Nama Kamu : ");     
        String nama = input.nextLine();
        System.out.print("Masukan Nilai : ");
        int nilai = input.nextInt();
         
        System.out.println("Selamat Datang " + nama);
        System.out.println("Nilai kamu adalah " + nilai);
        
        
        
        
        
        
        
        
    }
}
