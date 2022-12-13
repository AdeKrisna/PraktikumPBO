package com.krisna.praktikumpbo2.pertemuan3.Mobil;

public class Mobil {
    // Attribute
    String merk;
    String warna;
    
    public Mobil(){}
    
    public void Terparkir(){
        System.out.println("Mobil " + merk + " warna " + warna + " Sedang Terparkir ");
    }
    public void Berjalan(){
        System.out.println("Mobil " + merk + " warna " + warna + " Sedang Berjalan ");
    }
}
