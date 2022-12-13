package com.krisna.praktikumpbo.pertemuan4.kendaraan;


public class Kendaraan {
    // Atribute
    String nama;
    int jmlRoda;
    
    //Method
    public void nyalakanMesin(){
        System.out.println("Mesin " + nama + "Telah di Nyalakan !");
    }
    
    public void showinfo(){
        System.out.println("Nama        : " + nama);
        System.out.println("Jml Roda    : " + jmlRoda);
        extrainfo();
    }

    public void extrainfo(){
        
    }
}
