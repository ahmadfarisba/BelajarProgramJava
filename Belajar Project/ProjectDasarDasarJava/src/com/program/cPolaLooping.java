/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.program;

//import java.util.Scanner;

/**
 *
 * @author Intel
 */
public class cPolaLooping {
    public static void main(String[] args) {
        
        //Scanner input = new Scanner(System.in);
        
        //System.out.print("Masukan Batas :");
        int batas = 5;
        int a,x,y,z;
        z = 9;
        a = 2;
                   

       // System.out.print("Masukan Nilai X :");
       // System.out.print("Masukan Nilai Y :");
        
           //perulangan Y
       for (y=1; y<=batas; y++){
           
           // perulangan spasi
            for(int spasi=y; spasi>1; spasi--){
                System.out.print(" ");
            }
            
            // perulangan X
            x=1;
            while(x<=batas){
                System.out.print(x);
                x++;
            }
           // perulangan spasi setiap baris
            for (int spasi=z; spasi>y; spasi--){
                System.out.print(" ");
             
               }
            
            x=1;
            while(x<=batas){
                System.out.print(x);
                x++;
            }
               System.out.println();
               z=z-1;
        }
       
       
       for (y=1; y<batas; y++){
           
           // perulangan spasi
            for(int spasi=batas; spasi>y+1; spasi--){
                System.out.print(" ");
            }
            
            // perulangan X
            x=1;
            while(x<=batas){
                System.out.print(x);
                x++;
            }
            
                for (int spasi=1; spasi<=a; spasi++){
                System.out.print(" ");
             
               }
            
            x=1;
            while(x<=batas){
                System.out.print(x);
                x++;
            }
                        
            a=a+2;
            System.out.println();
        }
      
      
        
        
        
        
        
        
        
        
        
        
    }
}
