package com.krisna.praktikumpbo.pertemuan5;

public class Array2 {
    public static void main(String[] args) {
        //Pembuat array
        String[] name = {"Rain", "Thunder", "Storm"};
        
        // cek panjang array
        System.out.println("Panjang Array : " + name.length);
        
        //menampilkan semua nilai array
        for(int i=0; i < name.length; i++){
            System.out.println(i+":"+name[i]);
        }
    }
}
