/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.program.classku;

/**
 *
 * @author Intel
 */

// Penjualan sederhana
// Class Barang

public class Barang {
    
    // Property / Attribute
    // bisa juga memberikan default untuk setiap property di class 
    public String namaBarang = "Nama Barang tidak di Ketahui";
    public int hargaBarang = 0;
    public int stokBarang = 0;
    
    // Method Constructor (Magic Method)
    // Di java bisa membuat constructor lebih dari 1 yang dimana bisa ada parameter atau pun tidak
    // Sedangkan kalau di C++ itu bisa menampung nilai default pada setiap method constructor di parameternya
    
    public Barang()
    {
    }
    public Barang(String namaBarang)
    {
        // bisa menggunakan juga Java Reserved Keywords (this), yang berfungsi untuk 
        // menekankan bahwa variable pada object inilah method atau contructor yg dituju
        this.namaBarang = namaBarang; 
    }
    public Barang(String inputBarang, int inputHarga)
    {
        namaBarang = inputBarang;
        hargaBarang = inputHarga;
    }
    public Barang(String inputBarang, int inputHarga, int inputStok)
    {
        namaBarang = inputBarang;
        hargaBarang = inputHarga;
        stokBarang = inputStok;
    }
    
    // method / Behavior tambah Barang
    public void tambahStok(int jmlTambah)
    {
        stokBarang += jmlTambah; //stokBarang = stokBarang + jmlTambah;
        System.out.print("Stok barang Berhasil ditambahkan menjadi : " + stokBarang + "\n");
    }
    
    // method / Behavior kurangi Barang
     public void kurangStok(int jmlKurang)
    {
        stokBarang -= jmlKurang; //stokBarang = stokBarang - jmlKurang;
        System.out.print("Stok barang Berhasil dikurangi menjadi : " + stokBarang + "\n");
    }
     
    // method / Behavior cek stok
     public boolean cekStok()
    {
        return stokBarang > 0;
    }
     
     public  void cetakInfoBarang()
     {
         System.out.println("Nama Barang : " + namaBarang + "\n" + "Harga Barang : Rp. " + hargaBarang + 
         "\n" + "Jumlah Barang : " + stokBarang +" Pcs" + "\n");
     }
}
