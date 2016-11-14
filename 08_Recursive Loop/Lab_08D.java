import java.util.*;
public class Lab_08D
{
	static int search = 0;
	static int stop = 0;
	
	public static void main(String[]args)
	{
		Scanner Input = new Scanner(System.in);
		
		System.out.println("Type in a word:");
		String UserInput = Input.next();
		tree(UserInput);
	}
	
	public static void tree(String UserInput)
	{
		search++;
		String A = "";
		if(search<=UserInput.length()+1)
		{
			A = UserInput.substring(0,search-1);
			System.out.printf("%10s\n",A);
			tree(UserInput);
		}
	}
}