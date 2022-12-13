
package com.krisna.praktikumpbo2.pertemuan2;

import java.util.Scanner;

public class input {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Masukan Nama : ");
        String nama = input.nextLine();
        
        System.out.print("Masukan Usia : ");
        int usia = input.nextInt();
        
        System.out.println("Nama saya : " + nama);
        System.out.println("Usia Saya : " + usia + " Tahun");
        
    }
}
