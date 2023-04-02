import java.util.*;
 
public class Practical_15
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the First String");
        String s1 = sc.nextLine();
        System.out.println("Enter the Second String");
        String s2 = sc.nextLine();

        System.out.println("Comparison Result od The String is : "+s1.equals(s2));
        System.out.println("Concatation of Two String is : "+s1.concat(s2));


    }
}