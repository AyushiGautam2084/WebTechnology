import java.io.*;

class Main
{
    public static void main(String arr[]) throws IOException
    {
        int i,c1=0,c2=0;
        for(i=0;i<arr.length;i++)
        {
            int x = Integer.parseInt(arr[i]);
        
            if(x%2==0)
            {
                c1++;
            }
            else
            {
                c2++;
            }
        }
        System.out.println("Total even:"+c1);
        System.out.println("Total odd:"+c2);
    }
}