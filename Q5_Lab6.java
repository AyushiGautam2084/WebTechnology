import java.io.*;
class Student
{
	int roll;
	String name;
	double cgpa;
	Student(int r,String n,double c)
	{
		roll=r;
		name=n;
		cgpa=c;
	}
}
class Main
{
	public static void main(String args[])throws IOException
	{
		System.out.println("Please enter number of students:");
		DataInputStream ds = new DataInputStream(System.in);
		int n = Integer.parseInt(ds.readLine());
		Student[] obj;
		obj = new Student[n];
		for (int i=0;i<n;i++)
		{	
			int roll;
			String name;
			double cgpa;
			System.out.println("Enter roll of student");
			roll = Integer.parseInt(ds.readLine());
			System.out.println("Enter name of student");
			name = ds.readLine();
			System.out.println("Enter cgpa of student");
			cgpa = Double.parseDouble(ds.readLine());
			obj[i]= new Student(roll,name,cgpa);
		}
		double lowest = obj[0].cgpa;
		String namelow = obj[0].name;
		for (int i=0;i<n;i++)
		{
			if (obj[i].cgpa<=lowest)
			{
				lowest=obj[i].cgpa;
				namelow=obj[i].name;
			}
		}
		System.out.println("Name of student with lowest cgpa = " + (namelow));
	}
}