import java.util.Scanner;

class occurrence{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the list: ");
        int size = sc.nextInt();
        int arr[] = new int[size];
        System.out.println("Enter the elements of the list: ");
        for(int i=0; i<size; i++){
            arr[i] = sc.nextInt();
        }
        for(int i=0; i<size; i++){
            int count=0;
            for(int j=0; j<size; j++){
                if(arr[i]==arr[j])
                    count++;
            }
            System.out.println("Occurrence of "+arr[i]+": "+count);
        }
    }
}