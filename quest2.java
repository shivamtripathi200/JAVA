import java.util.*;
import Geometry.Circle;

class Demo2{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter radius: ");
        double radius = sc.nextDouble();
        Circle c = new Circle();
        c.setRadius(radius);
        System.out.println("Area: " + c.getArea());
        System.out.println("Perimeter: " + c.getPerimeter());
    }
}