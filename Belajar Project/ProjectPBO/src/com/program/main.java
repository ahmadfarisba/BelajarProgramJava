/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.program;
import com.program.classku.Barang;
import com.program.classku.Penjual;
import com.program.classku.Pembeli;
import java.util.Scanner;
/**
 *
 * @author Intel
 */
public class main {
    
    public static void main(String[] args) {
        
        // Percobaan dengan input
        // Scanner input = new Scanner(System.in);
        
        // Instansiasi Objek dari class Barang
        Barang barang1 = new Barang("Buku", 15000, 100);
        Barang barang2 = new Barang("Rokok", 20000, 10);
        Barang barang3 = new Barang("Dompet");
        
//        // Akses Property dalam Objek
//        barang1.namaBarang = "Shampoo";
//        barang1.hargaBarang = 15000;
//        barang1.stokBarang = 100;

        // Call Method didalam Object
        barang1.cetakInfoBarang();
        barang2.cetakInfoBarang();
        barang3.cetakInfoBarang();
        
//        // Akses Propery dalam objek Barang menggunakan Scanner
//        System.out.print("Masukan Nama Barang : ");
//        barang1.namaBarang = input.nextLine();
//        System.out.print("Masukan Harga Barang : ");
//        barang1.hargaBarang = input.nextInt();
//        System.out.print("Masukan Jumlah Stok Barang : ");
//        barang1.stokBarang = input.nextInt();
        
     
                
        // Instansiasi Objek Penjual
        Penjual penjual1 = new Penjual("Faris","Laki Laki",26,2);
        
//        // Akses Property dalam Objek Penjual
//        penjual1.nama = "Faris";
//        penjual1.umur = 26;
//        penjual1.jenisKelamin = "Laki Laki";
//        penjual1.lamaKerjaPertahun = 2;
        
        // Call Method dalam class Penjual pada Object Penjual
        penjual1.cetakInfoPenjual();
        
        // Instansiasi Objek Penjual
        Pembeli pembeli1 = new Pembeli("Dhea","Perempuan",26,"080989999","Kreo Selatan");
        
//        // Akses Property dalam Objek Penjual
//        pembeli1.nama = "Dhea";
//        pembeli1.umur = 26;
//        pembeli1.jenisKelamin = "Perempuan";
//        pembeli1.notelp = "08098999";
//        pembeli1.alamat = "Cipadu";
        
        // Call Method dalam class Penjual pada Object Penjual
        pembeli1.cetakInfoPembelil();
    }
}
