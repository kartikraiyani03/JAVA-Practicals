import java.util.*;

class Circle
{
    public static double area(int r)
    {
        return 3.14*r*r;
    }
}
 
public class Practical_24
{
    public static void main(String args[])
    {
        Circle c = new Circle();
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Radius of The Circle");
        int r = sc.nextInt();

        double a = c.area(r);
        
        System.out.println("The Area of the Circle is "+a);

    }
}