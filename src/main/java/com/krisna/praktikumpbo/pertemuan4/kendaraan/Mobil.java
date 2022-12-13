package com.krisna.praktikumpbo.pertemuan4.kendaraan;

public class Mobil extends Kendaraan {
    int maxGear;
    public void belok(String arah){
        System.out.println("Mobil " + nama + " Belok ke " + arah + "!");
        
    }
    public void belok(){
        System.out.println("Error : Mohon Masukan arah!");
    }
    public void extrainfo(){
        System.out.println("Max gear    : " + maxGear);
    }
}
