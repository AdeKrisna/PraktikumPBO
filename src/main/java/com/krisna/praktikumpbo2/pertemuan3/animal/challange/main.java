package com.krisna.praktikumpbo2.pertemuan3.animal.challange;

public class main {
    public static void main(String[] args) {
        Challange taman = new Challange("Taman Andang", 300, 2000);
        Challange mall = new Challange("Rita Super Mall", 400, 2010);
        Challange lapangan = new Challange("Lapangan Krida", 100, 1945);
        
        taman.showProfile();
        mall.showProfile();
        lapangan.showProfile();
    }
}
