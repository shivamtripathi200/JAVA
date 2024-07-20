package lab_9;

import java.util.*;

class question2{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string");
        String str = sc.nextLine();
        System.out.println("Enter another string");
        String str2 = sc.nextLine();

        System.out.println("Changing case of string");
        System.out.println("Upper case: " + str.toUpperCase());
        System.out.println("Lower case: " + str.toLowerCase());

        System.out.println("Reversing string");
        System.out.println("Reversing " + str);
        System.out.print("Result: ");
        for (int i = str.length() - 1; i >= 0; i--) {
            System.out.print(str.charAt(i));
        }

        System.out.println("Comparing two strings");
        System.out.println("Comparing " + str + " and " + str2);
        System.out.println("Result: " + str.compareTo(str2));

        System.out.println("Inserting one string into another string");
        System.out.println("Enter the index where you want to insert the string");
        int index = sc.nextInt();
        System.out.println("Inserting " + str + " into " + str2 + " at index " + index);
        System.out.println("Result: " + str2.substring(0, index) + str + str2.substring(index));


    }
}