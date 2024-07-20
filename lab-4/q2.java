// Program to print the corresponding grade for the given mark using if..else
// statement in Java
import java.util.*;
class solution{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your mark: ");
        int mark = sc.nextInt();
        System.out.println("Your grade is: ");
        if(mark>=90){
            System.out.println("O");
        }else if(mark>=80){
            System.out.println("E");
        }else if (mark>=70) {
            System.out.println("A");
        }else if(mark>=60){
            System.out.println("B");
        }
    }
};