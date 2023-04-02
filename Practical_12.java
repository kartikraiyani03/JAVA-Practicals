import java.util.*;
 
public class Practical_12
{
    public static void main(String args[])
    {

        byte arr[] = {1,92,3,4,5,6,7,8,9,10};

        int sum =0;

        for(byte i : arr)
        {
            sum = sum +i;
        }

        System.out.println(sum/arr.length);

    }
}