import java.util.*;
public class Lab_09A
{
	public static void main(String[]AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAARRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSS)
	{
		Scanner Input = new Scanner(System.in);
		System.out.println("Please Enter 5 Words:");
		String[] words = new String[5];
		for (int a=0;a<words.length;a++)
			words[a] = Input.next();
		
		System.out.println("In Order:");
		for (int a=0;a<words.length;a++)
			System.out.println(words[a]);
		System.out.println("\nReversed:");
		for (int a=words.length-1;a>=0;a--)
			System.out.println(words[a]);
		
	}
}