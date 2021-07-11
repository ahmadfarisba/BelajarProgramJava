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
public class cOperator {
    
    public static void main(String[] args) {
        
        //OPERATOR
        
         // 1, Operator Penegasan (=)
         // int bilangan = 10;
        
         // 2. Operator Aritmaika ( +, -, *, /, %, ++, --, +=, -= )
         // int bill1 = 29;
         // int bill2 = 12;
         // int bilangan = bill1 % bill2;
         // bill1 -= 5;   untuk operator ini jika dijabarkan akan menjadi bill1 = bill1 - 5; 24
         // bill1 += 5;   untuk operator ini jika dijabarkan akan menjadi bill1 = bill1 + 5; 3
         
         // 3. Operator Perbandingan ( <, >, <=, >=, ==, != ) type data boolean untuk true or false
         // int bill1 = 29,
         //      bill2 = 12;
         // boolean bilangan = bill1 >= bill2;
 
         // 4. Operato Logika ( &&, ||, ! )
         int totalBayar = 150000;
         boolean shoopingCard = false;
         
         boolean hasil = totalBayar >= 100000 || shoopingCard == true;
         hasil = !hasil;
         
    System.out.println(hasil);  

    
    
    }
    
}
