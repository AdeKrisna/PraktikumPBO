package com.krisna.praktikumpbo2.pertemuan3.Transportasi;

public class main {
    public static void main(String[] args) {
        //Pembuatan class
        Transportasi mobil = new Transportasi();
        Transportasi motor = new Transportasi();
        
        //mengisi nilai atribut objek mobil
        mobil.jenis = "SUV";
        mobil.merk = "BMW";
        mobil.warna = "Biru";
        
        //Mengisi nilai attribute objek motor
        motor.jenis ="Sport";
        motor.merk = "Kawasaki";
        motor.warna = "Hijau";
        
        // menjalankan method 'showprofil' masing masing objeck
        mobil.showprofile();
        motor.showprofile();
    }
}
