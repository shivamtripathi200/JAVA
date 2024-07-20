//Write a program to calculate area according to user input, whether it is circle, square or triangle (Menu Driven).

import java.util.*;

class Q3
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1 for circle, 2 for square, 3 for triangle");
        int choice = sc.nextInt();
        switch (choice)
        {
            case 1:
                System.out.print("Enter radius: ");
                float r = sc.nextFloat();
                System.out.println("Area of circle: " + (3.14 * r * r));
                break;
            case 2:
                System.out.print("Enter side: ");
                float s = sc.nextFloat();
                System.out.println("Area of square: " + (s * s));
                break;
            case 3:
                System.out.print("Enter base: ");
                float b = sc.nextFloat();
                System.out.print("Enter height: ");
                float h = sc.nextFloat();
                System.out.println("Area of triangle: " + (0.5 * b * h));
                break;
            default:
                System.out.println("Invalid choice");
        }
    }
}