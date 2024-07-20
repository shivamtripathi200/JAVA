// Write a program in java using inheritance to show how to call the base class
// parameterized constructors from the derived class using super.
package lab_7;
import java.util.*;

class Base{
    int x;
    Base(int x){
        this.x = x;
        System.out.println("Base constructor called");
    }
}

class Derived extends Base{
    int y;
    Derived(int x, int y){
        super(x);
        this.y = y;
        System.out.println("Derived constructor called");
    }
}

class q4_super{
    public static void main(String args[]){
        Derived d = new Derived(10, 20);
        System.out.println("x: " + d.x);
        System.out.println("y: " + d.y);
    }
}