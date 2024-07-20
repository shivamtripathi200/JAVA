import java.util.*;

class odd_even{
    public static void main(String args[]){
        int even=0, odd=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 10 numbers: ");
        for(int i=0; i<10; i++){
            int num = sc.nextInt();
            if(num%2==0)
                even++;
            else
                odd++;
        }
        System.out.println("Even numbers: "+even);
        System.out.println("Odd numbers: "+odd);
    }
}