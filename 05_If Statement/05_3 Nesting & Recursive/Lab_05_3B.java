import java.util.*;
public class Lab_05_3B
{
	static String Usernames = "";
	static String Passwords = "";
	public static void main(String[]args)
	{
		System.out.println("[Password Gateway]");
		CheckPass();
	}
	
	public static void CheckPass()
	{
		Scanner Input = new Scanner(System.in);
		System.out.println("Enter your USERNAME:");
		Usernames = Input.next();
		System.out.println("Enter your PASSWORD:");
		Passwords = Input.next();
		PassCheck(Usernames,Passwords);
	}
	
	public static void PassCheck(String User,String Pass)
	{
		if(User.equals("incorrect")&&Pass.equals("incorrect"))
		{
			System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
			System.out.println("Access Granted");
		}
		else if(User.equals("incorrect")&&!Pass.equals("incorrect"))
		{
			System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
			System.out.println("Your PASSWORD is incorrect");
			CheckPass();
		}
		else if(!User.equals("incorrect")&&Pass.equals("incorrect"))
		{
			System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
			System.out.println("Your USERNAME is incorrect");
			CheckPass();
		}
		else
		{
			System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
			System.out.println("Your USERNAME and PASSWORD is both incorrect");
			CheckPass();
		}
	}
}