import java.io.*;

class Main{
	public static void main(String arr[])throws IOException{
		DataInputStream ds= new DataInputStream(System.in);
		System.out.print("\nEnter a year to check:");
		int year=Integer.parseInt(ds.readLine());
		LeapYear lep = new LeapYear();
		lep(year);
	}
}

		