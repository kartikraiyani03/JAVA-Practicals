import java.util.*;

class Sphere
{
    protected double radius;
    protected double x;
    protected double y;

    // Sphere(double radius,double x,double y)
    // {
    //     this.radius  = radius;
    //     this.x = x;
    //     this.y = y;
    // }

    public void SetRaduis(double r)
    {
        radius = r;
    }
    public void SetX(double xco)
    {
        x = xco;
    } 
    public void SetY(double yco)
    {
        y = yco;
    } 

    public double GetRaduis()
    {
        return radius;
    }
    public double GetX()
    {
        return x;
    } 
    public double GetY()
    {
        return y;
    } 
}
 
public class Practical_26
{
    public static void main(String args[])
    {

     Sphere s = new Sphere();
     s.SetRaduis(12);
     s.SetX(8);
     s.SetY(8);

       System.out.println("Radius is : "+s.GetRaduis());
       System.out.println("X Cordinate is : "+s.GetX());
       System.out.println("Y Cordinate is : "+s.GetY());
    }
}