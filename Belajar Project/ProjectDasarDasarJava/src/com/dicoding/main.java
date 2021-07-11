package com.dicoding;

// Source Dicoding

import org.apache.commons.lang3.time.DateUtils;
import java.util.Date;
 
public class main {
    
    public static void main(String[] args) 
    {

        System.out.println("abc");
        String cde = "cde";
        System.out.println("abc" + cde);
        String c = "abc".substring(0,1);
        String d = cde.substring(1);
        System.out.println(c);
        System.out.println(d);
        
//        System.out.println("Hello world!");
// 
//        Date today = new Date();
//        System.out.println("Hari ini = " + today);
//        Date tomorrow = DateUtils.addDays(today, 1);
//        System.out.println("Besok = " + tomorrow);
//        
//Praktik yang kita lakukan barusan adalah menambahkan library (file jar) secara manual ke proyek. 
//Cara ini sebenarnya kurang efektif jika dilakukan untuk proyek besar. Bayangkan jika kita menggunakan library A 
//yang bergantung (dependencies) ke library B, C, D, lalu library B bergantung ke library X dan Y. Cukup bikin repot kan? 
//Solusinya, gunakan tools seperti maven atau gradle. Pembahasan maven dan gradle di luar cakupan dari class ini. 
//Saran kami, bacalah referensi yang ada di bawah karena kedua tools tersebut sudah menjadi standar dalam development Java.

    }
    
}