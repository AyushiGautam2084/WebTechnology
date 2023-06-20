import java.io.*;

class Main
{
	public static void main(String arr[])throws IOException
	{
		DataInputStream ds = new DataInputStream(System.in);
		System.out.print("Enter first name: ");
		String first = ds.readLine();
		System.out.print("Enter last name: ");
		String last =  ds.readLine();
		System.out.print("Printing...\n");
		System.out.print(last + " " + first);
	}
}