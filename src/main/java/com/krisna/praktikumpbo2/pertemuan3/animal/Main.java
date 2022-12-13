package com.krisna.praktikumpbo2.pertemuan3.animal;

public class Main {
    //'main' + tab
    public static void main(String[] args) {
        // Membuat objek dari class Animal
       Animal dog = new Animal("Rambo", 5, "Black");
       Animal cat = new Animal("Apin", 3, "White");
       Animal lion = new Animal("Sijon", 6, "Gold");
       
      
           // memanggil method
        System.out.println("Dog");
        dog.showProfile();
        System.out.println("Cat");
        cat.showProfile();
        System.out.println("Lion");
        lion.showProfile();
        
         // Demo getter & setter
        System.out.println("Dog's Name (before) : " + dog.getName());
        dog.setName("Blacky");
        System.out.println("Dog's name (after ) : " + dog.getName());
        System.out.println("cat's Name (before) : " + cat.getName());
        cat.setName("Upin");
        System.out.println("cat's Name (after) : " + cat.getName());
        System.out.println("Lion's Name (before) : " + lion.getName());
        lion.setName("Rambo");
        System.out.println("Lion's Name (after) : " + lion.getName());
    }
}
