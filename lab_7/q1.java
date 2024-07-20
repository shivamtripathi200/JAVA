package lab_7;
import java.util.*;

class plate
{
    int l, w;
    plate(int x, int y)
    {
        l = x;
        w = y;
        System.out.println("Plate constructor called");
    }
}

class box extends plate
{
    int h;
    box(int x, int y, int z)
    {
        super(x, y);
        h = z;
        System.out.println("Box constructor called");
    }
}

class woodbox extends box
{
    int t;
    woodbox(int x, int y, int z, int a)
    {
        super(x, y, z);
        t = a;
        System.out.println("Woodbox constructor called");
    }
    void display(){
        System.out.println("Length: " + l);
        System.out.println("Width: " + w);
        System.out.println("Height: " + h);
        System.out.println("Thickness: " + t);
    }
}

class q1_multilevel
{
    public static void main(String args[])
    {
        woodbox w = new woodbox(10, 20, 30, 40);
        w.display();
    }
}