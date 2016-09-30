import java.util.Scanner;
public class Lab_04_2
{
	static float Perimeter = 0;
	static float UniLength = 0;
	static float UniWidth = 0;
	public static void main(String[]args)
	{
		Scanner SLength = new Scanner(System.in);
		Scanner SWidth = new Scanner(System.in);
		
		System.out.println("Enter the lengh of the #Rekt:");
		UniLength = SLength.nextFloat();
		System.out.println("Enter the width of the #Rekt:");
		UniWidth = SWidth.nextFloat();
		
		Peri(UniLength,UniWidth);
		
		Print();
		
	}
	
	public static float Peri(float Length, float width)
	{
		Perimeter = UniLength+UniLength+UniWidth+UniWidth;
		return Perimeter;
	}
	
	public static void Print()
	{
		System.out.println("Your #Rekt's perimeter is: "+Perimeter);
	}
}