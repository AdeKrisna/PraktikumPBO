package com.krisna.praktikumpbo.pertemuan4.tugas;


public class lapfutsal extends lapangan {

    public void jenis(String jenislap){
        System.out.println("Lapangan Futsal " + namalapangan + " berjenis lantai : " +jenislap  );
    }
    public void kappemain(int kapasitas){
        System.out.println("Lapangan Futsal " + namalapangan + " Berpkapasitas pemain : " 
                + kapasitas + " Orang ");
    }
    public void lapangan(){
       System.out.println("Lapangan " + namalapangan + " yang berlokasi di : " + lokasilapangan);
   }
   public void showinfo(){
       System.out.println(namatim + " Akan bertanding di " + namalapangan + " yang berlokasi di : "
       + lokasilapangan);
   }
}
