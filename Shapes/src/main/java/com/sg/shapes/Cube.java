
package com.sg.shapes;

/**
 *
 * @author Paul Peterson
 */
public class Cube extends Square{

    public Cube(String color, double side) {
        super(color, side);
    }

    @Override
    public double area() {
        return Math.pow(getSide(), 2) * 6;
    }
    
    public double volume(){
        return Math.pow(getSide(), 3);
    }

}
