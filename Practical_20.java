import java.util.*;
 
public class Practical_20
{
    public static void main(String args[])
    {
        String str = "Hey, This is Root User";
        char c = str.charAt(0);
        
        if(c >= 'a' && c <= 'z')
        {
            System.out.println("ERROR");
        }
        else
        {
            System.out.println("NO ERROR");
        }

    }
}