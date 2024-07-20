import java.util.Scanner;

class TwoDimensional {
    double length, breadth;

    void input() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter length in feet: ");
        length = scanner.nextDouble();
        System.out.print("Enter breadth in feet: ");
        breadth = scanner.nextDouble();
        scanner.close();
    }

    double area() {
        return length * breadth;
    }

    double cost() {
        return area() * 40;
    }
}

class ThreeDimensional extends TwoDimensional {
    double height;

    void input() {
        super.input();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter height in feet: ");
        height = scanner.nextDouble();
        scanner.close();
    }

    double volume() {
        return area() * height;
    }

    double cost() {
        return volume() * 60;
    }
}

public class PlasticCostCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter 2 for 2D sheet and 3 for 3D box: ");
        int choice = scanner.nextInt();
        scanner.close();

        TwoDimensional twoD;
        if (choice == 2) {
            twoD = new TwoDimensional();
            twoD.input();
            System.out.println("Cost of plastic sheet: Rs " + twoD.cost());
        } else if (choice == 3) {
            ThreeDimensional threeD = new ThreeDimensional();
            threeD.input();
            System.out.println("Cost of plastic box: Rs " + threeD.cost());
        } else {
            System.out.println("Invalid choice");
        }
    }
}