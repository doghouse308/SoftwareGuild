
package com.sg.shapes;

/**
 *
 * @author Paul Peterson
 */
public class Square extends Shape{
    
    private double side;
    
    public Square (String color, double side){
        super(color);
        this.side = side;
    }

    @Override
    public double perimeter() {
        return getSide() * 4;
    }

    @Override
    public double area() {
        return getSide() * getSide();
    }

    /**
     * @return the side
     */
    public double getSide() {
        return side;
    }

    /**
     * @param side the side to set
     */
    public void setSide(double side) {
        this.side = side;
    }
    
}
