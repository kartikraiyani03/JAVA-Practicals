import java.util.*;
 
public class Practical_34
{
    public static void main(String args[])
    {
        System.out.println("\n");
        System.out.println("NAME : KARTIK RAIYANI   ENROLLMENT NO. : 210210116019   \n");
        System.out.println("\n");
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Number");
        try 
        {
            int n = Integer.parseInt(sc.next());
            System.out.println(n);
        }
        catch(NumberFormatException e)
        {
            System.out.println("Error Ocuured : Invalid Number");
        }
    }
}
