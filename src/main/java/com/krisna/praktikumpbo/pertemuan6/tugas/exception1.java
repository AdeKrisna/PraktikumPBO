package com.krisna.praktikumpbo.pertemuan6.tugas;


public class exception1 {
    public static void main(String[] args) {
        try
        {
            int bagi = 5/0;
        }
        catch (Exception e)
        {
            System.out.println("ada kesalahan yang terdeteksil");
        }
        finally
        {
            System.out.println("terima kasih telah menjalankan program");
        }
    }
}
