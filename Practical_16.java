import java.util.*;

import javax.swing.plaf.synth.SynthOptionPaneUI;
 
public class Practical_16
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
       
        String str = "java123is234fun";
        System.out.println("Originial String : "+str);
        System.out.println("");
        System.out.println("String After Replace : "+str.replaceAll("[0-9]"," "));
        System.out.println("");

        String arr[] = new String[20];
        arr = str.split("[0-9]");


        System.out.println("String After Split");
        for(String i : arr)
        {
            System.out.println(i);

        }
    }
}