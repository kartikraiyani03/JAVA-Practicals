import java.util.*;

class CirCle 
{
    double radius;

    CirCle(double r)
    {
        this.radius = r;
    }

    public void area(double r)
    {
        System.out.println("Circle : "+3.14*r*r);
    }          
}

class Cylinder
{
    double radius;
    double height;

    Cylinder(double r,double h)
    {
        this.radius = r;
        this.height = h;
    }
    public void area(double r,double h)
    {
        System.out.println("Cylinder : "+3.14*r*r*h);
    }
}
public class Practical_29
{
    public static void main(String args[])
    {
        CirCle c = new CirCle(4);
        Cylinder cy = new Cylinder(4,5);

        c.area(4);
        cy.area(4,5);
    }
}
