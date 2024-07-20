import java.util.*;

class static_modifier{
    static int count=0;
    static_modifier(){
        count++;
    }
    public static void main(String args[]){
        static_modifier obj1 = new static_modifier();
        static_modifier obj2 = new static_modifier();
        static_modifier obj3 = new static_modifier();
        static_modifier obj1 = new static_modifier();
        System.out.println("No. of objects created: "+count);
    }
}