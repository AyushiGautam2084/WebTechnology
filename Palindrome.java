import java.io.*;

class Palindrome{

	void palindrome(int num)
	{
		int i,temp;
		int sum=0;
		temp = num;
		while(num>0)
		{
			i=num%10;
			sum=(sum*10)+i;
			num=num/10;
		}
		if(temp==sum)
		{
			System.out.print("\nIts a palindrome\n");
			int a,b,c,d=0;
			while(num>0)
		      {
				a=num%10;
				b=(b*10)+a;
				num=num/10;
			}
			
		}
		else
		{
			System.out.print("\nIt is not a palindrome\n");
		}
	}
}