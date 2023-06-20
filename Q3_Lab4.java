import java.io.*;

class Main
{
	public static void main(String arr[]) throws IOException
	{
		DataInputStream ds= new DataInputStream(System.in);
		System.out.print("Enter date:");
		int date=Integer.parseInt(ds.readLine());
		switch(date%7)
		{
			case 0:
				System.out.print("Its a Tuesday");
				break;
			case 1:
				System.out.print("Its a Wednesday");
				break;
			case 2:
				System.out.print("Its a Thursday");
				break;
			case 3:
				System.out.print("Its a Friday");
				break;
			case 4:
				System.out.print("Its a Saturday");
				break;
			case 5:
				System.out.print("Its a Sunday");
				break;
			case 6:
				System.out.print("Its a Monday");
				break;
		}
	}
}

