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
public class Penjual {
    
    // Deklarasi Property / attribute
    public String nama;
    public String jenisKelamin;
    public int umur;
    public int lamaKerjaPertahun;
    
    // Method Constructor (Magic Method)
    // Di java bisa membuat constructor lebih dari 1 yang dimana bisa ada parameter atau pun tidak
    // Sedangkan kalau di C++ itu bisa menampung nilai default pada setiap method constructor di parameternya
    public Penjual(String nama, String jenisKelamin, int umur, int lamaKerjaPertahun)
    {
        // bisa menggunakan juga Java Reserved Keywords (this), yang berfungsi untuk 
        // menekankan bahwa variable pada object inilah method atau contructor yg dituju
        this.nama = nama;
        this.umur = umur;
        this.lamaKerjaPertahun = lamaKerjaPertahun;
        this.jenisKelamin = jenisKelamin;
    }
    
    // Deklarasi Method / behaviour
    public void cetakInfoPenjual()
    {
    System.out.println("Nama Penjual : "+nama+"\n" +
                 "Umur Penjual : "+umur+" tahun"+"\n" +
                 "Jenis Kelamin : "+jenisKelamin+"\n" +
                 "Lama Kerja Per Tahun : "+lamaKerjaPertahun+" tahun"+"\n");

    }
}
