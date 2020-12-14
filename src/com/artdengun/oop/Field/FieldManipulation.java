package com.artdengun.oop.Field;

class FieldManipulation {
    String name;
    String age;
    final String country = "Indonesia";

    public static void main(String[] args) {
        var person = new FieldManipulation();
        person.name = "Deni Gunawan";
        person.age = "10 tahun";
//        person.country = "asdas";

        System.out.println(person.name);
        System.out.println(person.age);
        System.out.println(person.country);
    }
}
