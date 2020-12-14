package com.artdengun.oop;

public class Shape {
        int getCorner(){
            return 0;
        }
    }
    class Rectangle extends com.artdengun.oop.Shape {
        int getCorner() {
            return 4;
        }

        int getParentCorner(){
            return  super.getCorner();
        }
    }

