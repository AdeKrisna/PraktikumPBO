package com.krisna.praktikumpbo.pertemuan6;


public class Basic {
    public static void main(String[] args) {
        //membuat array isi 3;
        int[] myNumbers = {1,2,3};
    
        // Uji coba print nilai array index ke-10
        try{
            System.out.println(myNumbers[10]);
        }
        
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Array gak sebesar itu ya ges ya");
        }
    }
}
