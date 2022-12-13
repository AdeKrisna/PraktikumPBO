package com.krisna.praktikumpbo.pertemuan4.kendaraan;


public class Pesawat extends Kendaraan {
    
    public void kapasitas(int jmlPenumpang){
        System.out.println("Maksimal Jumlah Penumpang Pesawat " + nama + " : " + jmlPenumpang + "Orang" );
    }
    public void Mesin(String msn){
        System.out.println("Pesawat " + nama + " Menggunakan Mesin : " + msn);
    }
}
