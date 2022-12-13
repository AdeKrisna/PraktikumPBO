package com.krisna.praktikumpbo2.pertemuan3.Mobil;

public class main {
    public static void main(String[] args) {
        //Pembuatan class
        Mobil mobilorang = new Mobil();
        
        //Pengisian nilai atribut objec mobilorang 
        mobilorang.merk = "Lamborghini";
        mobilorang.warna = "Merah";
        
        //mennjalankan method masing masing objeck
        mobilorang.Terparkir();
        mobilorang.Berjalan();
    }
}
