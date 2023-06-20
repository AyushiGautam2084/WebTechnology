import java.io.*;

class Main{
	public static void main(String arr[])throws IOException{
		DataInputStream ds = new DataInputStream(System.in)
		System.out.print("Enter number:);
		int a = Integer.parseInt(ds.readLine);
		Palindrome p1 = new Palindrome();
		p1.palindrome(a);
	}
}