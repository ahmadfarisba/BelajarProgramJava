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
public class cFor {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        System.out.println("Masukan Batas :");
        short batas = input.nextShort();
        int nilaiAwal;
       
        for( nilaiAwal=batas; nilaiAwal>=1; nilaiAwal--){
            System.out.println(nilaiAwal);
        }
        
        System.out.println("-----------\n"+nilaiAwal);
        
        
        
        
        
    }
}
