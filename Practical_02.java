import java.util.*;
 
public class Practical_02
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number to Check Whether it is Odd or Even");
        int n = sc.nextInt();

        if(n % 2 == 0)
        {
            System.out.println("Number is Even");
        }
        else
        {
            System.out.println("Number is Odd");
        }
    }
}