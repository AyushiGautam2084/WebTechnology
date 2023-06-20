import java.io.*;
class Main{
	public static void main(String arr[]) throws IOException{
		DataInputStream ds = new DataInputStream(System.in);
		System.out.print("Enter Marks:");
		int Marks = Integer.parseInt(ds.readLine());
		if (Marks >= 90)
		{
			System.out.print("Grade: O");
		}
		else if(Marks > 80 && Marks< 90)
		{
			System.out.print("Grade: E");
		}
		else if(Marks > 70 && Marks< 80)
		{
			System.out.print("Grade: A");
		}
		else if(Marks > 50 && Marks< 60)
		{
			System.out.print("Grade: B");
		}
		else if(Marks > 40 && Marks< 50)
		{
			System.out.print("Grade: C");
		}
		else if(Marks > 30 && Marks< 40)
		{
			System.out.print("Grade: D");
		}
		else
		{
			System.out.print("Grade: F");
		}
	}
}