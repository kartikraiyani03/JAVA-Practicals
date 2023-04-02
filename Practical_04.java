import java.util.*;
 
public class Practical_04
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number");
        int n = sc.nextInt();
        int c=0;

        for(int i = 1;i <= n;i++)
        {
            if(n % i == 0)
            {
                c++;
            }
        }

        if(c == 2)
        {
            System.out.println("Number is Prime");
        }
        else
        {
            System.out.println("Number is Non-Prime");
        }

    }
}