import java.io.*;

class LeapYear
{
	void LeapYear(int year)
	{
		int a,b,c;
		a=year%4;
		b=year%400;
		c=year%100;
		if(a==0 && b==0 || c==0 )
		{
			System.out.print("\n It is a leap year\n");
			System.out.print("Name:Ayushi\n");
			System.out.print("College:KIIT DU\n");
			System.out.print("Roll number:21051528");
		}
		else
		{
			System.out.print("It is not a leap year.");
		}
	}
}