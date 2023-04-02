import java.util.*;
 
public class Practical_22
{
    public static void revstring(String str, int index)
    {
        if(index == 0)
        {
            System.out.print(str.charAt(index));
            return;
        }
        System.out.print(str.charAt(index));
        revstring(str,index-1);

    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The String");
        String str = sc.nextLine();

        revstring(str,str.length()-1);
    }
}