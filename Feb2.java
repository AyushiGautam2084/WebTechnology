import java.io.*;
class main{
	public static void main(String arr[]) throws IOException
	{
		DataInputStream ds= new Data(System.in);
		PrimeOrNotPrime p1 = new PrimeOrNotPrime();
		System.out.print("Enter a value:");
		int a =Integer.parseInt(ds.readline());
		p1.prime(a);
	}
}