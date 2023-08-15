import java.util.*;

class InvalidAge extends Exception
{
    InvalidAge(String str)
    {
        super(str);
    }
}
 
public class Practical_33
{
    public static void main(String args[])
    {
        System.out.println("\n");
        System.out.println("NAME : KARTIK RAIYANI   ENROLLMENT NO. : 210210116019   \n");
        System.out.println("\n")
        ;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your age");
        int age = sc.nextInt();

        try
        {
            if(age <= 0)
            {
                System.out.println("Error Occured : Age less than zero");
            }
            System.out.println(age);
        }
        catch(Exception e)
        {
            System.out.println(e.getMessage());
        }

    }
}