import java.io.*;

class Number
{
    int arr[];
    int n;
    Number() throws IOException
    {
        DataInputStream ds = new DataInputStream(System.in);
        System.out.print("How many number to enter? ");
        n = Integer.parseInt(ds.readLine());
        arr=new int[n];
    }
    void read() throws IOException
    {
        DataInputStream ds = new DataInputStream(System.in);
        int i;
        for(i=0;i<n;i++)
        {
            arr[i]= Integer.parseInt(ds.readLine());
        }
    }
    void display()
    {
        for(int i=0;i<n;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
    void swap()
    {
        int max=0;
        int min=0;
        for(int i=0;i<n;i++)
        {
            if(arr[max]<arr[i])
            {
                max=i;
            }
            else if(arr[min]>arr[i])
            {
                min=i;
            }
            
        }
        int temp = arr[max];
        arr[max]=arr[min];
        arr[min]=temp;
    }
}

class Mainn
{
    public static void main(String[] arr) throws IOException
    {
        Number num = new Number();
        num.read();
        num.display();
        num.swap();
        System.out.println("");
        num.display();
    }
}