package com.krisna.praktikumpbo2.pertemuan3.animal.challange;

public class Challange {
    private String nama;
    private int visitorsToday;
    private int yearBuilt;
    
    public Challange (String nama,int visitorsToday, int yearBuilt){
        this.nama = nama;
        this.visitorsToday = visitorsToday;
        this.yearBuilt = yearBuilt;
    }
    public void showProfile(){
        System.out.println("Nama : " + nama);
        System.out.println("Pengunjung : " + visitorsToday);
        System.out.println("Tahun dibangun : " + yearBuilt);
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public int getVisitorsToday() {
        return visitorsToday;
    }

    public void setVisitorsToday(int visitorsToday) {
        this.visitorsToday = visitorsToday;
    }

    public int getYearBuilt() {
        return yearBuilt;
    }

    public void setYearBuilt(int yearBuilt) {
        this.yearBuilt = yearBuilt;
    }
    
}
