import java.util.*;

class circle
{
    double radius;
    double x;
    double y;

    circle(double radius)
    {
        this.radius = radius;
    }
    circle(double xco, double yco, double radius)
    {
        this.radius = radius;
        this.x = xco;
        this.y =yco;
    }

    public void info()
    {
        System.out.println("Radius : "+radius);
        System.out.println("X is : "+x);
        System.out.println("Y is : "+y);
    }
    public void info_()
    {
        System.out.println("Radius : "+radius);
    }
}
 
public class Practical_27
{
    public static void main(String args[])
    {
        circle c = new circle(2,2,4);
        c.info();

    }
}