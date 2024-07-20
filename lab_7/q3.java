// Write a program to create an Account class containing acc_no, balance as data
// members and disp() to display the details. Inherit it in Person class with all mentioned
// data members and functions. Person class also has name and aadhar_no as extra data
// members of its own. Override disp() function. Create 5 persons‟ details.
package lab_7;
import java.util.*;
class Account{
    int acc_no;
    double balance;
    void display(){
        System.out.println("Account number: " + acc_no);
        System.out.println("Balance: " + balance);
    }
}

class Person extends Account{
    String name;
    String aadhar_no;
    void display(){
        super.display();
        System.out.println("Name: " + name);
        System.out.println("Aadhar number: " + aadhar_no);
    }
}

class q3_bank{
    public static void main(String args[]){
        Person p[] = new Person[5];
        for(int i = 0; i < 5; i++){
            p[i] = new Person();
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter account number: ");
            p[i].acc_no = sc.nextInt();
            System.out.print("Enter balance: ");
            p[i].balance = sc.nextDouble();
            System.out.print("Enter name: ");
            p[i].name = sc.next();
            System.out.print("Enter aadhar number: ");
            p[i].aadhar_no = sc.next();
        }
        for(int i = 0; i < 5; i++){
            p[i].display();
            System.out.println();
        }
    }
}