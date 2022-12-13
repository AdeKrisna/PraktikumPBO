package com.krisna.praktikumpbo.pertemuan4.kendaraan;

public class main {
    public static void main(String[] args) {
        // pembuatan object
        Mobil mb = new Mobil();
        Kendaraan kn = new Kendaraan();
        Pesawat pwt = new Pesawat();
        
        // memaasukan nilai attribute
        mb.nama ="Lamborghini";
        mb.jmlRoda = 4;
        mb.maxGear = 6;
        
        kn.nama = "Kendaraan Misterius";
        kn.jmlRoda = 8;
        /*
        pwt.nama = "KrisnaAir";
        pwt.jmlRoda = 3;
        */
        // Uji coba pemanggilan method
        mb.showinfo();
        mb.belok("kanan");
        mb.belok();
        /*
        pwt.showinfo();
        pwt.kapasitas(300);
        pwt.Mesin("Boeing 337 Turbo");
       */
    }
}
