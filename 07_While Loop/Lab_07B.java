import java.util.*;
public class Lab_07B
{
	public static void main(String[]notArgsCauseWhyNot)
	{
		Scanner Input = new Scanner(System.in);
		
		System.out.println("Type in a Number:");
		int UserInput = Input.nextInt();
		int PrintTot = UserInput;
		int Avg = 0;
		int Print = 0;
		Avg(Print, UserInput, PrintTot, Avg);
	}
	
	
	public static void Avg(int Print, int UserInput, int PrintTot, int Avg)
	{
		int Count = 0;
		while(UserInput>0)
		{
			Print = UserInput % 10;
			Avg = Avg + Print;
			Count++;
			UserInput = (UserInput-Print)/10; 
		}
		Avg = Avg/Count;
		System.out.println("The digit avg of "+PrintTot+" is "+Avg);
	}
}