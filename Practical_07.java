import java.util.*;

import javax.xml.transform.Source;
 
public class Practical_07
{
    public static void main(String args[])
    {
        int meter;
        double feet;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Parameter in Meter");
        meter = sc.nextInt();

        System.out.println("");
        
        System.out.println("Parameter in Feet is : "+meter*3.23);
        System.out.println("");
        
    }
}