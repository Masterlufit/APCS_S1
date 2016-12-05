import java.util.Scanner;
public class Lab_04_2D
{
	static float UniRad = 0;
	static float UniArea = 0;
	
	public static void main(String[]args)
	{
		Lab_04_2D Method = new Lab_04_2D();
		Scanner SRad = new Scanner(System.in);
		
		System.out.println("Enter the Rad of the circle:");
		UniRad = SRad.nextFloat();
		
		Method.Avg(UniRad);
		
		Method.Print();
		
	}
	
	public void Avg(float a)
	{
		float Square = UniRad*UniRad;
		UniArea = Square*3.14f;
		//return UniArea;
	}
	
	public void Print()
	{
		System.out.println("Area of a circle with a radius of "+UniRad+" is: "+UniArea);
	}
}