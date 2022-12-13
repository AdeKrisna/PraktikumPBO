package com.krisna.praktikumpbo2.pertemuan2;

import java.util.Scanner;

public class LoginSederhana {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Login");
        System.out.print("Masukan Username : ");
        String username = input.nextLine();
        System.out.print("Masukan Password : ");
        String password = input.nextLine();
        
        if(username.isEmpty()){
            System.out.println("Masukan Username !");
        }else if(password.isEmpty()){
            System.out.println("Masukan Password !");
        }else if(!username.equals("krisna")){
            System.out.println("Username Salah !");
        }else if(!password.equals("1234")){
            System.out.println("Password Salah !");
        }else{
            System.out.println("Anda Berhasil Login !");
        }
    }
}
