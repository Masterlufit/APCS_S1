import java.util.*;
public class Lab_09B
{
	public static void main(String[]args)
	{
		Scanner Input = new Scanner(System.in);
		System.out.println("Please Enter 5 Words:");
		String[] words = new String[5];
		for (int a=0;a<words.length;a++)
			words[a] = Input.next();
		first(words);
		
	}
	public static void first(String[] firstLetter)
	{
		for(String word:firstLetter)
		{
			String first = word.substring(0,1);
			System.out.println(first);
		}
	}
}