import java.util.*;
 
public class Practical_14
{
    public static void main(String args[])
    {
        int a[][] = new int[2][2];
        int b[][] = new int[2][2];
        int c[][] = new int[2][2];

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Elements in First 2D array");
        for(int i =0;i < 2;i++)
        {
            for(int j = 0;j < 2;j++)
            {
                a[i][j] = sc.nextInt();
            }
        }
        
        System.out.println("Enter the Elements in Second 2D array");

        for(int i =0;i < 2;i++)
        {
            for(int j = 0;j < 2;j++)
            {
                b[i][j] = sc.nextInt();
            }
        }
        
        System.out.println("Sum of 2 Array is....");
        
        for(int i =0;i < 2;i++)
        {
            for(int j = 0;j < 2;j++)
            {
                c[i][j] = a[i][j]+ b[i][j];
            }
        }
        
        for(int i =0;i < 2;i++)
        {
            for(int j = 0;j < 2;j++)
            {
                System.out.print("["+c[i][j]+"] ");
            }
            System.out.println(" ");
        }
    }
}
