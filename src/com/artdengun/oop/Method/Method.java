package com.artdengun.oop.Method;

public class Method {

    String name;
    String address;
    final String country = "Indonesia";

    void sayHello(String paramName){
        System.out.println("Hello " + paramName + ", My Name Is " + name);
    }

    public static void main(String[] args) {
        var person1 = new Method();
        person1.name = "Deni";
        person1.sayHello("Deni Gunawan");
    }
}
