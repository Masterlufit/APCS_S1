import java.util.Scanner;
public class Lab_04_2C
{
	static float UniSide = 0;
	static float UniSurfArea = 0;
	
	public static void main(String[]args)
	{
		Scanner SSide = new Scanner(System.in);
		
		System.out.println("Enter the side of the Cube:");
		UniSide = SSide.nextFloat();
		
		Avg(UniSide);
		
		Print();
		
	}
	
	public static float Avg(float a)
	{
		float Square = UniSide*UniSide;
		UniSurfArea = Square*6;
		return UniSurfArea;
	}
	
	public static void Print()
	{
		System.out.println("Surfact Area is: "+UniSurfArea);
	}
}