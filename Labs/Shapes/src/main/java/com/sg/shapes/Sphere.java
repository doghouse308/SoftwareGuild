package com.sg.shapes;

/**
 *
 * @author Paul Peterson
 */
public class Sphere extends Circle {

    public Sphere(String color, double r) {
        super(color, r);
    }

    @Override
    public double area() {
        return pi * Math.pow(getR(), 2) * 4;
    }

    public double volume(double r) {
        return (4 * pi * Math.pow(r, 3)) / 3;
    }

}
