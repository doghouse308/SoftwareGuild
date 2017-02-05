package com.sg.shapes;

import java.util.HashMap;

/**
 *
 * @author Paul Peterson
 */
public class ShapeDemo {

    public static void main(String[] args) {

        Square Square1 = new Square("Red", 6);
        Square Square2 = new Square("Blue", 9);

        System.out.println(Square1.getColor() + " Square:  \n\tSide:  " + Square1.getSide()
                + "\n\tPerimeter:  " + Square1.perimeter() + "\n\tArea:  " + Square1.area());
        System.out.println("Blue Square:  \n\tSide:  " + Square2.getSide()
                + "\n\tPerimeter:  " + Square2.perimeter() + "\n\tArea:  " + Square2.area());

        Cube cube1 = new Cube("Red", 6);
        Cube cube2 = new Cube("Blue", 9);

        System.out.println(cube1.getColor() + " Cube:  \n\tSide:  " + cube1.getSide()
                + "\n\tPerimeter:  " + cube1.perimeter() + "\n\tArea:  " + cube1.area()
                + "\n\tVolume:  " + cube1.volume());
        System.out.println(cube2.getColor() + " Cube:  \n\tSide:  " + cube2.getSide()
                + "\n\tPerimeter:  " + cube2.perimeter() + "\n\tArea:  " + cube2.area()
                + "\n\tVolume:  " + cube2.volume());

        Rectangle rectangle1 = new Rectangle("Green", 3, 7);
        Rectangle rectangle2 = new Rectangle("Yellow", 12, 15);
        System.out.println(rectangle1.getColor() + " Rectangle:  \n\tLength:  " + rectangle1.getLength()
                + "\n\tWidth:  " + rectangle1.getWidth() + "\n\tPerimeter:  "
                + rectangle1.perimeter() + "\n\tArea:  " + rectangle1.area());
        System.out.println(rectangle2.getColor() + "Yellow Rectangle:  \n\tLength:  " + rectangle2.getLength()
                + "\n\tWidth:  " + rectangle2.getWidth() + "\n\tPerimeter:  "
                + rectangle2.perimeter() + "\n\tArea:  " + rectangle2.area());

        Box box1 = new Box("Orange", 3, 7, 4);
        Box box2 = new Box("White", 12, 15, 7);
        System.out.println(box1.getColor() + " Box:  \n\tLength:  " + box1.getLength()
                + "\n\tWidth:  " + box1.getWidth() + "\n\tHeight:  "
                + box1.getHeight() + "\n\tPerimeter:  " + box1.perimeter()
                + "\n\tArea:  " + box1.area() + "\n\tVolume:  " + box1.volume());
        System.out.println(box2.getColor() + " Box:  \n\tLength:  " + box2.getLength()
                + "\n\tWidth:  " + box2.getWidth() + "\n\tHeight:  "
                + box2.getHeight() + "\n\tPerimeter:  " + box2.perimeter()
                + "\n\tArea:  " + box2.area() + "\n\tVolume:  " + box2.volume());

        Triangle triangle1 = new Triangle("Blue", 3, 6, 4, 7);
        Triangle triangle2 = new Triangle("Silver", 5, 7, 5, 9);
        System.out.println(triangle1.getColor() + " Triangle:  \n\tSide A:  " + triangle1.getA()
                + "\n\tBase:  " + triangle1.getBase() + "\n\tSice C:  "
                + triangle1.getC() + "\n\tPerimeter:  " + triangle1.perimeter()
                + "\n\tArea:  " + triangle1.area());
        System.out.println(triangle1.getColor() + " Triangle:  \n\tSide A:  " + triangle2.getA()
                + "\n\tBase:  " + triangle2.getBase() + "\n\tSice C:  "
                + triangle2.getC() + "\n\tPerimeter:  " + triangle2.perimeter()
                + "\n\tArea:  " + triangle2.area()); 
        
        Pyramid pyramid1 = new Pyramid("Purple", 3, 6, 4, 7);
        Pyramid pyramid2 = new Pyramid("Brown", 15,16, 17, 15);
        System.out.println(pyramid1.getColor() + " Pyramid:  \n\tSide A:  " + pyramid1.getA()
                + "\n\tBase:  " + pyramid1.getBase() + "\n\tSice C:  "
                + pyramid1.getC() + "\n\tPerimeter:  " + pyramid1.perimeter()
                + "\n\tArea:  " + pyramid1.area() + "\n\tVolume:  " + pyramid1.volume());
        System.out.println(pyramid2.getColor() + " Pyramid:  \n\tSide A:  " + pyramid2.getA()
                + "\n\tBase:  " + pyramid2.getBase() + "\n\tSice C:  "
                + pyramid2.getC() + "\n\tPerimeter:  " + pyramid2.perimeter()
                + "\n\tArea:  " + pyramid2.area() + "\n\tVolume:  " + pyramid2.volume());      
        
        Circle circle1 = new Circle("Black", 23);
        Circle circle2 = new Circle("Amber", 35);
        System.out.println(circle1.getColor()+ " Circle:  \n\tSide:  " + circle1.getR()
                + "\n\tPerimeter:  " + circle1.perimeter() + "\n\tArea:  " + circle1.area());
        System.out.println(circle1.getColor()+ " Circle:  \n\tSide:  " + circle2.getR()
                + "\n\tPerimeter:  " + circle2.perimeter() + "\n\tArea:  " + circle2.area());  
        
        Sphere sphere1 = new Sphere("Gold", 6);
        Sphere sphere2 = new Sphere("Copper", 9);
        System.out.println(sphere1.getColor() + " Sphere:  \n\tSide:  " + sphere1.getR()
                + "\n\tPerimeter:  " + sphere1.perimeter() + "\n\tArea:  " + sphere1.area()
                + "\n\tVolume:  " + sphere1.volume(sphere1.getR()));
        System.out.println(sphere2.getColor() + " Sphere:  \n\tSide:  " + sphere2.getR()
                + "\n\tPerimeter:  " + sphere2.perimeter() + "\n\tArea:  " + sphere2.area()
                + "\n\tVolume:  " + sphere2.volume(sphere2.getR()));    
        
        HashMap<Integer, Shape> test = new HashMap();
        
        test.put(1, box2);
        Box tBox = (Box) test.get(1);
        System.out.println("Volume:  " + tBox.volume());
    }

}
