import java.util.*;

class Bond
{
    public void display()
    {
        System.out.println("Bond ");
    }
}

class ConvertibleBond extends Bond
{
    public void display()
    {
        System.out.println("Covertile Bond ");
    }
}
 
public class Practical_30
{
    public static void main(String args[])
    {
        System.out.println("\n");
        System.out.println("NAME : KARTIK RAIYANI   ENROLLMENT NO. : 210210116019   \n");
        System.out.println("\n");
        
        Bond[] arr = new Bond[6];         

        arr[0] = new Bond();
        arr[1] = new ConvertibleBond();
        arr[2] = new Bond();
        arr[3] = new ConvertibleBond();
        arr[4] = new Bond();
        arr[5] = new ConvertibleBond();

        for (Bond element : arr)
        {
           element.display();
        }

    }
}