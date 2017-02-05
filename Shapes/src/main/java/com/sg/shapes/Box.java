
package com.sg.shapes;

/**
 *
 * @author Paul Peterson
 */
public class Box extends Rectangle{
    
    private double height;

    public Box(String color, double length, double width, double height) {
        super(color, length, width);
        this.height = height;
    }

    @Override
    public double area() {
        return 2 * (getLength() * getWidth() + getLength() * getHeight() + getWidth() * getHeight());
    }
    
    public double volume(){
        return getLength() * getWidth() * getHeight();
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
