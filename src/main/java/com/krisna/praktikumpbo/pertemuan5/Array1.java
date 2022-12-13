package com.krisna.praktikumpbo.pertemuan5;

public class Array1 {
    public static void main(String[] args) {
        //Pembuat array
        String[] name = new String[5];
        
        // cek panjang array
        System.out.println("Panjang Array : " + name.length);
        
        // memasukan nilai ke array
        name[0] = "Rain";
        name[1] = "Thunder";
        name[2] = "Storm";
        
        //menampilkan semua nilai array
        for(int i=0; i < name.length; i++){
            System.out.println(i+":"+name[i]);
        }
    }
}
