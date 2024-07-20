// Write a program in Java to define a class Number with appropriate data
// members and member functions to input n number of integers and swap the biggest
// and smallest elements. Use member functions read(), swap() and display().

import java.util.*;

class Number{
    int n;
    int arr[];
    Number(int n){
        this.n = n;
        arr = new int[n];
    }
    void read(){
        Scanner sc = new Scanner(System.in);
        for(int i=0; i<n; i++){
            System.out.print("Enter the number " + (i+1) + ":");
            arr[i] = sc.nextInt();
        }
    }

    void swap(){
        int max = arr[0];
        int min = arr[0];
        int max_index = 0;
        int min_index = 0;
        for(int i=1; i<n; i++){
            if(arr[i] > max){
                max = arr[i];
                max_index = i;
            }
            if(arr[i] < min){
                min = arr[i];
                min_index = i;
            }
        }
        int temp = arr[max_index];
        arr[max_index] = arr[min_index];
        arr[min_index] = temp;
    }

    void display(){
        for(int i=0; i<n; i++){
            System.out.print(arr[i] + " ");
        }
    }



    public static void main(String args[] ){
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.print("Enter the number of elements:");
        n = sc.nextInt();
        Number obj = new Number(n);
        obj.read();
        obj.swap();
        obj.display();
    }
}