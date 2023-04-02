import java.util.*;
 
public class Practical_13
{
    public static void main(String args[])
    {
        int arr[] = {1,2,3,4,5,6};
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Number Which you Want to Find");
        int element = sc.nextInt();

        for(int i : arr)
        {
            if(arr[i] == element)
            {
                System.out.println("Element Found");
            }
        }

    }
}