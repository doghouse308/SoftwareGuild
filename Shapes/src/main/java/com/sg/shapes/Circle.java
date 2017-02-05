
package com.sg.shapes;

/**
 *
 * @author Paul Peterson
 */
public class Circle extends Shape{
    
    protected final double pi = Math.PI;
    private double r;
    
    public Circle(String color, double r){
        super(color);
        this.r = r;
    }

    @Override
    public double perimeter() {
        return 2 * pi * getR();
    }

    @Override
    public double area() {
        return pi * Math.pow(getR(), 2);
    }

    /**
     * @return the r
     */
    public double getR() {
        return r;
    }

    /**
     * @param r the r to set
     */
    public void setR(double r) {
        this.r = r;
    }
    
}
