import java.util.*;
public class Lab_08B
{
	public static void main(String[]args)
	{
		Scanner Input = new Scanner(System.in);
		
		System.out.println("Type in a word:");
		String UserInput1 = Input.next();
		System.out.println("Type in a word:");
		String UserInput2 = Input.next();
		System.out.println("Type in a word:");
		String UserInput3 = Input.next();
		center(UserInput1);
		center(UserInput2);
		center(UserInput3);
	}
	
	public static void center(String UserInput)
	{
		if(UserInput.length()>20)
		{
			System.out.println(UserInput);
			return;
		}
		else
		{
			UserInput = " "+UserInput+" ";
			center(UserInput);
		}
	}
}