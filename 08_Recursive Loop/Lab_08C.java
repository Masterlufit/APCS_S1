import java.util.*;
public class Lab_08C
{
	static int count = 0;
	public static void main(String[]thisIsStillNotArgs)
	{
		Scanner Input = new Scanner(System.in);
		
		System.out.println("Type in a Number:");
		int UserInput = Input.nextInt();
		luck(UserInput);
		System.out.println(count);
	}
	
	
	public static void luck(int digit)
	{
		if(digit>0)
		{
			if(digit%10 == 7)
			{
				count++;
				digit = (digit - 7)/10;
				luck(digit);
			}
			else
			{
				digit = (digit - (digit%10))/10;
				luck(digit);
			}
		}
		else
			return;
	}
}