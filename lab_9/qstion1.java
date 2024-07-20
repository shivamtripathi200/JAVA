package lab_9;
import java.util.*;

interface Motor {
    int capacity = 1000;

    void run();

    void consume();
}

class WashingMachine implements Motor {
    public void run() {
        System.out.println("Washing Machine is running");
    }

    public void consume() {
        System.out.println("Washing Machine is consuming");
    }
}

class question1 {
    public static void main(String[] args) {
        WashingMachine wm = new WashingMachine();
        wm.run();
        wm.consume();
        System.out.println("Capacity of Washing Machine is " + Motor.capacity);
    }
}