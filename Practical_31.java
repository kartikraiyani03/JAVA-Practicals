import java.util.*;

class I2
{
    public void getDescription()
    {
        System.out.println("I2");
    }
}
class J2 extends I2
{
    public void getDescription()
    {
        super.getDescription();
        System.out.println("J2");
    }
}
class K2 extends J2
{
    public void getDescription()
    {
        super.getDescription();
        System.out.println("K2");
    }
}

 
public class Practical_31
{
    public static void main(String args[])
    {
        System.out.println("\n");
        System.out.println("NAME : KARTIK RAIYANI   ENROLLMENT NO. : 210210116019   \n");
        System.out.println("\n");
        
        I2 i = new I2();
        i.getDescription();
        System.out.println();
        
        J2 j = new J2();
        j.getDescription();
        System.out.println();
        
        K2 k = new K2();
        k.getDescription();

    }
}