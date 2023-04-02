import java.util.*;
 
public class Practical_19
{
    public static void main(String args[])
    {
        String st = "avjhd2387egj8u2e8";
        char str[] = new char[20];

        st.getChars(0,6,str,0);
        System.out.println(str);

        // for(int i = 0;i <= st.length()-1;i++)
        // {
        //     str[i] = st.getChars(str);
        // }

    }
}