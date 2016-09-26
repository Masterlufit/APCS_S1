import java.util.Scanner;
public class Lab_04_2D
{
	static float UniRad = 0;
	static float UniArea = 0;
	
	public static void main(String[]args)
	{
		Scanner SRad = new Scanner(System.in);
		
		System.out.println("Enter the Rad of the circle:");
		UniRad = SRad.nextFloat();
		
		Avg(UniRad);
		
		Print();
		
	}
	
	public static float Avg(float a)
	{
		float Square = UniRad*UniRad;
		UniArea = Square*3.14159f;
		return UniArea;
	}
	
	public static void Print()
	{
		System.out.println("Area of a circle with a radius of "+UniRad+"is: "+UniArea);
	}
}