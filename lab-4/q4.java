// Program to check a user entered number is palindrome or not.
import java.util.*;
class palindrome{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = sc.nextInt();
        int r=0;
        int t = n;
        while(t!=0){
            r=r*10 + (t%10);
            t=t/10;
        }
        System.out.println(r);
        if(r==n){
            System.out.println("Palindrome");
        }else{
            System.out.println("Not palindrome");
        }
    }
}