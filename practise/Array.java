import java.util.Arrays;
class Array {
    public static void main(String[] args){
        int[] marks = new int[3];
        marks[0]=97;
        marks[1]=98;
        marks[2]=95;
        System.out.println(marks[2]);
        //length
        System.out.println(marks.length);
        //sorting 
        System.out.println("Sorting an array");
        Arrays.sort(marks);
        // 2D arrays
        int[][] finalmarks={{95,88,38}, {98,99,89}};
        System.out.println(finalmarks[1][1]);
    }
}
