
package com.sg.shapes;

/**
 *
 * @author Paul Peterson
 */
public class Triangle extends Shape{

    private double a;
    private double base;
    private double c;
    private double height;
    
    public Triangle(String color, double a, double base, double c, double height){
        super(color);
        this.a = a;
        this.base = base;
        this.c = c;
        this.height = height;
    }
    @Override
    public double perimeter() {
        return getA() + getBase() + getC();
    }

    @Override
    public double area() {
        return (getBase() * getHeight()) / 2;
    }

    /**
     * @return the a
     */
    public double getA() {
        return a;
    }

    /**
     * @param a the a to set
     */
    public void setA(double a) {
        this.a = a;
    }

    /**
     * @return the base
     */
    public double getBase() {
        return base;
    }

    /**
     * @param base the base to set
     */
    public void setBase(double base) {
        this.base = base;
    }

    /**
     * @return the c
     */
    public double getC() {
        return c;
    }

    /**
     * @param c the c to set
     */
    public void setC(double c) {
        this.c = c;
    }

    /**
     * @return the height
     */
    public double getHeight() {
        return height;
    }

    /**
     * @param height the height to set
     */
    public void setHeight(double height) {
        this.height = height;
    }
    
}
