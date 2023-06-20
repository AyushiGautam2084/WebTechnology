import java.util.Scanner;
class plate
{
	int length;
	int width;
	plate()
    {
		Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter value of the length in meters = ");
		length = scanner.nextInt();
		System.out.print("Please enter value of the width in meters = ");
		width = scanner.nextInt();
	}
}
class box extends plate
{
	int height;
	box()
    {
        Scanner scanner = new Scanner(System.in);
		System.out.print("Please enter value of the height in meters = ");
		height = scanner.nextInt();
	}
}
class woodbox extends box
{
	int thick;
	int volume;
	woodbox()
    {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Please enter value of the thickness in meters = ");
		thick = scanner.nextInt();
		volume = length*width*height*thick;
		System.out.print("The volume is = " + volume);
	}
}
class Main
{
	public static void main(String args[])
    {
		woodbox wood = new woodbox();
	}
	
}
