// Write a program in java to input and display the details of n number of
// students having roll, name and cgpa as data members. Also display the name of the
// student having lowest cgpa.

import java.util.*;

class Solution2{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.print("Enter the number of students:");
        n = sc.nextInt();
        String name[] = new String[n];
        int roll[] = new int[n];
        float cgpa[] = new float[n];
        for(int i=0; i<n; i++){
            System.out.print("Enter the name of student " + (i+1) + ":");
            name[i] = sc.next();
            System.out.print("Enter the roll of student " + (i+1) + ":");
            roll[i] = sc.nextInt();
            System.out.print("Enter the cgpa of student " + (i+1) + ":");
            cgpa[i] = sc.nextFloat();
        }
        float min = cgpa[0];
        int index = 0;
        for(int i=1; i<n; i++){
            if(cgpa[i] < min){
                min = cgpa[i];
                index = i;
            }
        }
        System.out.println("The name of the student having lowest cgpa is " + name[index]);
    }
}