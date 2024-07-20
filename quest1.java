//Write an interface Numbers with a method int process
//        (int x, int y). Write a class Sum in which the process()
//        method finds the sum of two numbers and returns an int
//        value. Write another class Average in which the process()
//        method finds the average of the two numbers and returns
//        an int value. Implement an application class Demo where
//        the functionality of above two classes are tested that
//        exhibit run time polymorphism.
//        Implement a package Geometry which contains a class

import java.util.*;

interface Numbers {
    int process(int x, int y);
}

class Sum implements Numbers {
    public int process(int x, int y) {
        return x + y;
    }
}

class Average implements Numbers {
    public int process(int x, int y) {
        return (x + y) / 2;
    }
}

class Demo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers: ");
        int x = sc.nextInt();
        int y = sc.nextInt();
        Numbers n = new Sum();
        System.out.println("Sum: " + n.process(x, y));
        n = new Average();
        System.out.println("Average: " + n.process(x, y));
    }
}