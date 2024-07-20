/*Create a class account having data members bankname,acconnt-id,account-name,balance and pass word.It contains 
member function:get-account-details to input acc details,display to display details ,withdraw and deposit validate 
to check password */
import java.util.*;
class Account{
    Scanner sc = new Scanner(System.in);
    String bank_name;
    int acc_id;
    String acc_name;
    int balance;
    int password;
    void get_acc_details(){
        System.out.println("Enter bank name:");
        bank_name=sc.nextLine();
        System.out.println("Enter account id:");
        acc_id=sc.nextInt();
        System.out.println("Enter Account name:");
        acc_name=sc.nextLine();
        System.out.println("Enter Balance:");
        balance=sc.nextInt();
        System.out.println("Enter passcode:");
        password=sc.nextInt();
    }
    void display(){
        System.out.println("Bank name:"+bank_name);
        System.out.println("Account id:"+acc_id);
        System.out.println("Account name:"+acc_name);
        System.out.println("Balance:"+balance);
    }
    
    void withdraw(){
        System.out.println("Enter the amount to withdraw");
        int withdraw=sc.nextInt();
        System.out.println("Enter the password");
        int pass=sc.nextInt();
        if(validate(pass)){
            balance-=withdraw;
        }else{
            System.out.println("Wrong password");
        }
    }
    void deposit(){
        System.out.println("enter the amount to deposit");
        int deposit=sc.nextInt();
        System.out.println("enter the password");
        int pass=sc.nextInt();
        if(validate(pass)){
            balance+=deposit;
        }else{
            System.out.println("Wrong password");
        }
    }
    boolean validate(int pass){
        if (pass==password) {
            return true;
        }else{
            return false;
        }
    }
public static void main(String[] args) {
    Account ac=new Account();
    ac.get_acc_details();
    ac.display();
    ac.withdraw();
    ac.deposit();
    ac.display();
}
};