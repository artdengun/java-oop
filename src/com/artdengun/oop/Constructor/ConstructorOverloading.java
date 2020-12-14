package com.artdengun.oop.Constructor;

public class ConstructorOverloading {
    String nama;
    String address;


    ConstructorOverloading(){
        this(null);
    }

    ConstructorOverloading(String nama){
       this(nama, null);
    }

    ConstructorOverloading(String nama, String address){
        this.nama = nama;
        this.address = address;
    }
}
