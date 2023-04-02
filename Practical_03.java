import java.util.*;
 
public class Practical_03
{
    public static int pow(int x ,int n)
    {
        if(x == 0)
        {
            return 0;
        }
        if(n == 0)
        {
            return 1;
        }

        int a = pow(x, n-1);
        return x*a;
    }

    public static void main(String args[])
    {
        int x = 2;
        int n = 12;

        System.out.println(pow(x,n));
       
    }
}