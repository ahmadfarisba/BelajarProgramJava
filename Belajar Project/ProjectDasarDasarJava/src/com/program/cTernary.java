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
public class cTernary {
    
    public static void main(String[] args) {
        
       Scanner input = new Scanner(System.in);
       // percabangan ternary ini mempersingkat if else, tapi percabangan ternary ini hanya memberikan nilai pd variabel
       int nilai = input.nextInt();
       String keterangan = nilai>=70&&nilai<=100 ? "Lulus Dong":"Gimana sih";
    
    //nilai >= 70 && <=100, keterangan = lulus atau tidak lulus
    
     //if (nilai>=70 && nilai<=100) {
     //       System.out.println("Lulus");
     //}else{
     //     System.out.println("Tidak Lulus");
     //}
    
        System.out.println(keterangan);
    
}
}