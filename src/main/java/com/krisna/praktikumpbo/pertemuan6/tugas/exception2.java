package com.krisna.praktikumpbo.pertemuan6.tugas;


public class exception2 {
    public static void main(String[] args) { 
        int a[]=new int[5];
        try
        { 
            a[7]=70;
        }
        catch(Exception e)
        {
            System.out.println("terlalu banyak");
        }
    }
}
