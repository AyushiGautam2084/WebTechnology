import java.util.Scanner;
class Main
{
    public static void main(String[] args) 
    {
        int n, x, count = 0, i = 0;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter no. of elements you want in array:");
        n = s.nextInt();
        int a[] = new int[n];
        System.out.println("Enter all the elements:");
        for(i = 0; i < n; i++)
        {
            a[i] = s.nextInt();
        }
        System.out.print("Enter the element of which you want to count number of occurrences:");
        x = s.nextInt();
        for(i = 0; i < n; i++)
        {
            if(a[i] == x)
            {
                count++;
            }
        }
        System.out.println("Number of Occurrence of the Element:"+count);
    }
}





























/* 
import java.io.*;

class Main
{
    public static void main(String args[]) throws IOException
    {
        int arr[] = new int[15];
        DataInputStream ds = new DataInputStream(System.in);
        int i,j,count=0;
        for(i=0;i<10;i++)
        {
            arr[i] = Integer.parseInt(ds.readLine());
        }
        for(i=0;i<10;i++)
        {
            for(j=0;j<10;j++)
            {
                if(arr[i]==arr[j])
                {
                    count++;
                }
            }
            System.out.println("The element "+arr[i]+" occured "+count+" times");
        }
        
    }
}
*/
