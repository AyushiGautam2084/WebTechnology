class PrimeOrNotPrime
{
	int a,b,c,d,e;
	void prime(int x)
	{
		a=x;
		b=a%2;
		c=a%3;
		d=a%5;
		e=a%7;
		if(a==1)
		{
			System.out.print("It is not a prime");
		}
		else if(b==0 || c==0 || d==0 || e==0)
		{
			if(a==2 || a==3 || a==5 || a==7)
			{
				System.out.print("It is a prime");
			}
			else
			{
				System.out.print("It is not a prime");
			}
		}
		else
		{
			System.out.print("It is a prime");
		}
}
		
			 