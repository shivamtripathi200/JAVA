// Accept 10 numbers from command line and check how many of them are even
// and how many odd.
import java.util.*;
class evenodd{
    public static void main(String[] args) {
        int odd=0;
        int even=0;
        for(int i=0;i<10;i++){
            if(Integer.parseInt(args[i])%2==0){
                even++;
            }else{
                odd++;
            }
        }
        System.out.println("Even: "+even +" odd: "+odd);
    }
}