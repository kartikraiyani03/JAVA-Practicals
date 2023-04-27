import java.util.*;
 
class sphere
{
    double radius;
    double x;
    double y;
    double z;

    sphere()
    {
      radius = 1;
    }
    sphere(double radius)
    {
        this.radius = radius;
    }
    sphere(double xco,double yco,double zco,double radius)
    {
        this.radius = radius;
        this.x = xco;
        this.y = yco;
        this.z = zco;
    }

    public void info1()
    {   
        System.out.println(radius);
    }
    public void info2()
    {   
        System.out.println(radius);
    }
    public void info3()
    {   
        System.out.println(radius);
        System.out.println(x);
        System.out.println(y);
        System.out.println(z);
    }

}

public class Practical_28
{
    public static void main(String args[])
    {
       sphere s1 = new sphere();
       sphere s2 = new sphere(4);
       sphere s3 = new sphere(2,2,2,4);

       s1.info1();
       System.out.println("");
       s2.info2();
       System.out.println("");
       s3.info3();
    
    }
}