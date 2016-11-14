import java.util.*;
public class Lab_07D
{
	public static void main(String[]notArgsCauseWhyNot)
	{
		Scanner Input = new Scanner(System.in);
		
		System.out.println("Type in a sentence:");
		String UserInput = Input.nextLine();
		replace(UserInput);
	}
	
	public static String add(String a, String b) 
	{
		a += b;
		return a;
	}
	
	public static void replace(String UserInput)
	{
		int search = 0;
		String A = "";
		String a = "";
		while(search<UserInput.length())
		{
			A = UserInput.substring(search,search+1);
			//System.out.println("> "+A);
			if(A.equals("a"))
			{
				A = "@";
			}
			a = add(a,A);
			
			//System.out.println(">> "+A);
			//System.out.println(">>> "+newS+"\n");
			search++;
		}
		System.out.println("The new sentence is:\n"+a);
	}
}