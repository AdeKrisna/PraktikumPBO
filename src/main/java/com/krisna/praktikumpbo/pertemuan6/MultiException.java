package com.krisna.praktikumpbo.pertemuan6;

import java.util.InputMismatchException;
import java.util.Scanner;


public class MultiException {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        try{
            System.out.println("Masukan Bilangan : ");
            int bilangan = input.nextInt();
            
            System.out.println("Masukan Pembagi : ");
            int pembagi = input.nextInt();
            
            int hasil = bilangan/pembagi;
            
            System.out.println("Hasil Pembagian di Bulatkan : " + hasil);
        }
        catch(ArithmeticException e){
            System.out.println("Error : Tidak Dapat Memproses");
        }
        catch(InputMismatchException e){
            System.out.println("Error : Harap Masukan Angka Saja!");
        }
    }
}
