package practise;
import java.util.Scanner;
public class scanner {
    public static void main(String[] args){
        // how to take input?
        Scanner sc = new Scanner(System.in);
        System.out.println("Give number input");
        int name = sc.nextInt();
        System.out.println("Give decimal number in input");
        float name1 = sc.nextFloat();
        System.out.println("Give input in a sentence");
        String name2 = sc.nextLine();
        System.out.println(name);
        System.out.println(name1);
        System.out.println(name2);

    }
    }
