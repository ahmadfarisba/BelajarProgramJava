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
public class Pembeli {
   
    // Property / attribute
    public String nama;
    public String jenisKelamin;
    public int umur;
    public String notelp;
    public String alamat;

    // Method Constructor (Magic Method)
    // Di java bisa membuat constructor lebih dari 1 yang dimana bisa ada parameter atau pun tidak
    // Sedangkan kalau di C++ itu bisa menampung nilai default pada setiap method constructor di parameternya
    public Pembeli(String nama, String jenisKelamin, int umur, String notelp, String alamat)
    {
        // bisa menggunakan juga Java Reserved Keywords (this), yang berfungsi untuk 
        // menekankan bahwa variable pada object inilah method atau contructor yg dituju
        this.nama = nama;
        this.jenisKelamin = jenisKelamin;
        this.umur = umur;
        this.notelp = notelp;
        this.alamat = alamat;
    } 

    // Method / behaviour
    public void cetakInfoPembelil()
    {
    System.out.println("Nama Pembeli : "+alamat+"\n" +
                    "Umur Pembeli : "+umur+" tahun"+"\n" +
                    "Jenis Kelamin Pembeli: "+jenisKelamin+"\n"+
                    "Nomor Handphone : "+notelp+"\n"+
                    "Alamat : "+alamat);
    }
}
