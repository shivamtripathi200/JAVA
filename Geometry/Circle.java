// java program to write an interface numbers with a method int process (int x,
// int y). write a class sum in which the process method find the sum of two
// numbers and return int value. write another class average in which the
// process method find the average of two numbers and return int value.
// implement a class demo to test the run time polymorphism.
package Geometry;

public class Circle{
    private double radius;

    public void setRadius(double radius){
        this.radius = radius;
    }

    public double getRadius(){
        return radius;
    }

    public double getArea(){
        return Math.PI * radius * radius;
    }

    public double getPerimeter(){
        return 2 * Math.PI * radius;
    }
}