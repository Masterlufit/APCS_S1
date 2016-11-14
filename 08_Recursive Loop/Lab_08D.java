import java.util.*;
public class Lab_08A
{
	static int search = 0;
	static String newSentence = "";
	
	public static void main(String[]args)
	{
		Scanner Input = new Scanner(System.in);
		
		System.out.println("Type in a sentence:");
		String UserInput = Input.nextLine();
		replace(UserInput);
	}
	
	public static void replace(String UserInput)
	{
		search++;
		String A = "";
		if(search<=UserInput.length())
		{
			A = UserInput.substring(search-1,search);
			if(A.equals(" "))
			{
				A = "_";
			}
			newSentence += A;
			replace(UserInput);
		}
		else
			System.out.println("The new sentence is:\n"+newSentence);
	}
}