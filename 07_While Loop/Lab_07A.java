import java.util.*;
public class Lab_07A 
{
	public static void main(String[]notArgsCauseWhyNot)
	{
		Scanner Input = new Scanner(System.in);
		
		System.out.println("Type in a Number:");
		int UserInput = Input.nextInt();
		int PrintTot = UserInput;
		int Sum = 0;
		int Print = 0;
		Sum(Print, UserInput, PrintTot, Sum);
	}
	
	
	public static void Sum(int Print, int UserInput, int PrintTot, int Sum)
	{
		while(UserInput>0)
		{
			Print = UserInput % 10;
			Sum = Sum + Print;
			UserInput = (UserInput-Print)/10; 
		}
		System.out.println("The digit sum of "+PrintTot+" is "+Sum);
	}
}