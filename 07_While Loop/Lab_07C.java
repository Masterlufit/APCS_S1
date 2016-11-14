import java.util.*;
public class Lab_07C
{
	public static void main(String[]notArgsCauseWhyNot)
	{
		Scanner Input = new Scanner(System.in);
		
		System.out.println("Type in a Number:");
		int UserInput = Input.nextInt();
		Reverse(UserInput);
	}
	
	
	public static void Reverse(int UserInput)
	{
		int Number = UserInput;
		int Temp = 0;
		int rev = 0;
		while(UserInput>0)
		{
			Temp = UserInput % 10;
			UserInput = (UserInput-Temp)/10; 
			rev = rev*10+Temp;
		}
		System.out.println("The reverse of "+Number+" is "+rev);
	}
}