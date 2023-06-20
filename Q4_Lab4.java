import java.io.*;

class Main
{
	public static void main(String arr[])throws IOException
	{
		DataInputStream ds = new DataInputStream(System.in);
		System.out.print("Enter number:");
		int a = Integer.parseInt(ds.readLine());
		int temp, num;
		int sum=0;
		temp = a;
		while(a>0)
		{
			num=a%10;
			sum=(sum*10)+num;
			a=a/10;
		}
		if(temp==sum)
		{
			System.out.print("\nIts a palindrome\n");
		}
		else
		{
			System.out.print("\nIt is not a palindrome\n");
		}
	}
}