package practise;

public class Strings {
    public static void main(String[] args){
        //Strings
        // concatenate
        String name1= "Aman";
        String name2= "Akku";
        String name3 = name1 + name2;
        String name4 = name1 + " and " + name2;
        System.out.println("concatanate:");
        System.out.println(name3);
        System.out.println(name4);
        // charat   
        System.out.println(name1.charAt(1));
        System.out.println(name1.length());
        //replace
        String nameR = name1.replace('a', 'b');
        System.out.println("Replace name1:");
        System.out.println(nameR);
        System.out.println(name1);
        //Substring
        System.out.println("The substring of name4:");
        System.out.println(name4.substring(0,4));
        

    }
}
