package com.sg.shapes;

/**
 *
 * @author Paul Peterson
 */
//assumes square pyramid
public class Pyramid extends Triangle {

    public Pyramid(String color, double a, double base, double c, double height) {
        super(color, a, base, c, height);
    }

    @Override
    public double area() {
        return Math.pow(getBase(), 2) + ((getBase() * 4) * getBase()) / 2;
    }

    public double volume(){
        double pHeight = Math.sqrt(Math.pow(getHeight(), 2) - (Math.pow(getBase(), 2) / 4));
        
        return (Math.pow(getBase(), 2) * pHeight) / 3;
    }
}
