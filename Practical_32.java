import java.util.*;
 
public class Practical_32
{
    public static void main(String args[])
    {
        System.out.println("\n");
        System.out.println("NAME : KARTIK RAIYANI   ENROLLMENT NO. : 210210116019   \n");
        System.out.println("\n");
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the First Number ");
        int a = sc.nextInt();
        System.out.println("Enter the Second Number ");
        int b = sc.nextInt();

        
        try
        {
            int result = a/b;
            System.out.println(a+" / "+b+" = "+result);
        }
        catch(ArithmeticException e)
        {
            System.out.println("Error Ocuured : Can't Divisible by zero");
        }

        
    }
}