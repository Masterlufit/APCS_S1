import java.util.Scanner;
public class Lab_04_2
{
	static float Perimeter = 0;
	static float UniLength = 0;
	static float UniWidth = 0;
	public static void main(String[]args)
	{
		Lab_04_2 Method = new Lab_04_2();	
		Scanner SLength = new Scanner(System.in);
		Scanner SWidth = new Scanner(System.in);
		
		System.out.println("Enter the lengh of the Rectangle:");
		UniLength = SLength.nextFloat();
		System.out.println("Enter the width of the Rectangle:");
		UniWidth = SWidth.nextFloat();
		
		Method.Peri(UniLength,UniWidth);
		
		Method.Print();
		
	}
	
	public void Peri(float Length, float width)
	{
		Perimeter = UniLength+UniLength+UniWidth+UniWidth;
	}
	
	public void Print()
	{
		System.out.println("Your Rectangle's perimeter is: "+Perimeter);
	}
}