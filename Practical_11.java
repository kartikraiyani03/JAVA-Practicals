import java.util.*;
 
public class Practical_11
{
    public static void main(String args[])
    {
        float arr[] = {1,2,3,4,5};
        
        int length = 0;

        // arr[0] = 1;
        // arr[1] = 2;
        // arr[2] = 3;
        // arr[3] = 4;
        // arr[4] = 5;
    
        for(float i : arr)
        {
            length++;
        }
    
        System.out.println("Length of the Array is : "+length);

    }
}