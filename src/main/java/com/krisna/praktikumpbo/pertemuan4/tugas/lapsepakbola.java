package com.krisna.praktikumpbo.pertemuan4.tugas;

public class lapsepakbola extends lapangan{

    public void kappenonton(int kappenonton){
        System.out.println("Lapangan Sepak Bola " + namalapangan + "Berkapasitas Penonton : " 
                + kappenonton + " Penonton");
    }
    public void jenisrumput(String rumput){
        System.out.println("Lapangan Sepak Bola " + namalapangan + " berjenis Rumput " + rumput);
    }
    public void lapangan(){
       System.out.println("Lapangan " + namalapangan + " yang berlokasi di : " + lokasilapangan);
   }
   public void showinfo(){
       System.out.println(namatim + " Akan bertanding di " + namalapangan + " yang berlokasi di : "
       + lokasilapangan);
   }
}
