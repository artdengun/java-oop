package com.artdengun.oop;


public class ShapeApp {
    public static void main(String[] args) {
        var shapes = new Shape();
        System.out.println(shapes.getCorner());

        var rectangle = new Rectangle();
        System.out.println(rectangle.getCorner());
        System.out.println(rectangle.getParentCorner());
    }
}
