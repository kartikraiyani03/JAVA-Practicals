import java.util.*;

class Complex
{
    public static int addTo(int a, int b)
    {
        return a+b;
    }
    public static void compareTo(int x, int y)
    {
        if(x == y)
        {
            System.out.println("Numbers are Same");
        }
        else if(x > y)
        {
            System.out.println(x+" is Greater than "+y);
        }
        else
        {
            System.out.println(x+" is Less than "+y);

        }
    }
}
 
public class Practical_25
{
    public static void main(String args[])
    {
        Complex c = new Complex();
        c.compareTo(12,12);

    }
}