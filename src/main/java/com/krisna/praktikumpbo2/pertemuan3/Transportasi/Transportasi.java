package com.krisna.praktikumpbo2.pertemuan3.Transportasi;

public class Transportasi {
    // Attribute
    String warna;
    String merk;
    String jenis;
    
    public Transportasi(){}
    
    public void showprofile(){
        System.out.println("Jenis : " + jenis);
        System.out.println("Merk : "+ merk);
        System.out.println("Warna :"+ warna);
    }
}
