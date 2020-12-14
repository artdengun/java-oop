package com.artdengun.oop;

public class VariableShadowing {
    String nama;
    String address;

    public VariableShadowing(String paramNama, String paramAddress) {
        this.nama = paramNama;
        this.address = paramAddress;
    }

    VariableShadowing(){
    }

    public static void main(String[] args) {

        var shadow = new VariableShadowing();

        shadow.nama  = "Deni Gunawan";
        shadow.address = "Gundul";

        System.out.println("Nama Saya " + shadow.nama + " Nama kedua " + shadow.address);
    }
}
