// Write a program in Java to take first name and last name from user and print both in
// one line as last name followed by first name.
import java.util.*;
class concat{
    public static void main(String[] args) {
        System.out.println("Enter your full name");
        Scanner sc = new Scanner(System.in);
        String fname = sc.nextLine();
        String lname = sc.nextLine();
        String fullname = lname+fname;
        System.out.println(fullname);

    }
}