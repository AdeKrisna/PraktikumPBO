package com.krisna.praktikumpbo.pertemuan5.tugas;

public class Tugas_array {
    public static void main(String[] args) {
        //Membuat array
        String [] bensin = {"Pertalite = 10.000","Pertamax = 13.900"}; 
        
        //cek panjang array
        System.out.println("Banyak Bensin : " + bensin.length);
        
        //Menampilkan nilai array
        for(int i=0; i < bensin.length; i++){
            System.out.println(bensin[i]);
        }
    }
}
