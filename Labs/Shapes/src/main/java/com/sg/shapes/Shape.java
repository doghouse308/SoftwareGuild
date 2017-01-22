
package com.sg.shapes;

/**
 *
 * @author Paul Peterson
 */
public abstract class Shape {
    
    private String color;

    public Shape(){
        
    }
    public Shape(String color){
        this.color = color;
    }
        
    public abstract double perimeter();
    public abstract double area();

    /**
     * @return the color
     */
    public String getColor() {
        return color;
    }

    /**
     * @param color the color to set
     */
    public void setColor(String color) {
        this.color = color;
    }
    
}
