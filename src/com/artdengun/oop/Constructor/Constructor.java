package com.artdengun.oop.Constructor;

public class Constructor {
    String name;
    String password;

    Constructor(String nama, String password){
        this.name = nama;
        this.password = password;
    }

    public static void main(String[] args) {
        var construc = new Constructor("Deni", "12menit");
        System.out.println(construc.name);
        System.out.println(construc.password);
    }
}
