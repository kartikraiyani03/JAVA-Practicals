import java.util.*;
 
public class Practical_09
{
    public static void main(String args[])
    {
        Random rd = new Random();
        int sum =0;
        
        for(int i =1;i <= 10;i++)
        {   
            
            int a = rd.nextInt(10);
            System.out.print(a+" ");
            sum = sum + a;

            if( sum >= 20)
            {
                break;
            }

        }

        System.out.println(" ");

        // int a[] = new int;
        // for(int i : a)
        // {
        //     sum = sum + i;
            // if( sum >= 20)
            // {
            //     break;
            // }
        // }

        System.out.println(sum);

    }
}