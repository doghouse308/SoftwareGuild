
package com.sg.shapes;

/**
 *
 * @author Paul Peterson
 */
public class Rectangle extends Shape{
    
    private double length;
    private double width;
    
    public Rectangle(String color, double length, double width){
        super(color);
        this.length = length;
        this.width = width;
    }

    @Override
    public double perimeter() {
        return (getLength() + getWidth()) * 2;
    }

    @Override
    public double area() {
        return getLength() * getWidth();
    }

    /**
     * @return the length
     */
    public double getLength() {
        return length;
    }

    /**
     * @param length the length to set
     */
    public void setLength(double length) {
        this.length = length;
    }

    /**
     * @return the width
     */
    public double getWidth() {
        return width;
    }

    /**
     * @param width the width to set
     */
    public void setWidth(double width) {
        this.width = width;
    }
    
}
