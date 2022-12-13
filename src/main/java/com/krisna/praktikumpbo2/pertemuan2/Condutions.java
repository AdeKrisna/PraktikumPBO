
package com.krisna.praktikumpbo2.pertemuan2;

import java.util.Scanner;

public class Condutions {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Masukan Bilangan Bulat : ");
        int bilangan = input.nextInt();
        
        if(bilangan > 0)
            System.out.println(bilangan + " Adalah Bilangan Positif !");
        else if(bilangan < 0)
            System.out.println(bilangan + " Adalah Bilangan Negatif !");
        else
            System.out.println(bilangan + " Adalah nol ");
    }
}
