package com.artdengun.oop;

public class ManaggerApp {
    public static void main(String[] args) {
        var manager = new Manager();
        manager.name = " Deni";
        manager.sayHello("degun");


        var vicePresident = new VicePresident();
        vicePresident.name  = " president";
        vicePresident.sayHello("awakwn");
    }
}
