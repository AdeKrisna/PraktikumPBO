package com.krisna.praktikumpbo.pertemuan4.tugas;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        
        System.out.println("Pilih Lapangan :");
        System.out.println("1. Lapangan Sepak Bola ");
        System.out.println("2. Lapngan Futsal");
        System.out.println("3. Keluar");
        System.out.println("Masukan Pilihan : ");
        int Pilihan = input.nextInt();
        //object
        lapsepakbola sb = new lapsepakbola();
        lapfutsal ft = new lapfutsal();
        
        // isi nilai attribute
        
        sb.namalapangan = "Krida Nusantara";
        sb.lokasilapangan = "Banyumas";
        sb.namatim = "Black horse";
        
        ft.namalapangan = "Orion";
        ft.lokasilapangan = "Karang Klesem";
        ft.namatim = "Bintang Timur";
        
        //pemanggilan method
        switch(Pilihan){
            case 1 -> {
               sb.kappenonton(5000 );
               sb.jenisrumput("alami");
               sb.lapangan();
               sb.showinfo();
            }
            case 2 -> {
              ft.jenis("rumput sintetis");
              ft.kappemain(10);
              ft.lapangan();
              ft.showinfo();
            }
            case 3 -> {
                System.out.println("Anda Keluar Program");
            }
        }
        
    }
}
