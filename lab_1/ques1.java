// Write a program to overload subtract method with various parameters in a class in Java

import java.util.*;

class Solution1{

    public static int subtract(int num1,int num2){
        return num1-num2;
    }

    public static int subtract(int num1,int num2,int num3){
        return num1-num2-num3;
    }
    

    public static void main(String args[])

        Scanner sc=new Scanner(System.in);
        int num1,num2,num3;
        System.out.print("Enter the numbers:");
        num1=sc.nextInt();
        num2=sc.nextInt();
        num3=sc.nextInt();

        System.out.println("Subtraction of two numbers is:"+subtract(num1,num2));
        System.out.println("Subtraction of three numbers is:"+subtract(num1,num2,num3));


    }



 }