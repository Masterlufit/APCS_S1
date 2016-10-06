import java.util.*;

public class Lab_05A
{
	//new random
	static Random ComputerDice = new Random();
	static Random PlayerDice = new Random();
	static Random DiceAnim = new Random();
		
	//new scanner
	static Scanner SRoll = new Scanner(System.in);
	
	public static void main(String[]args)
	{
		//print directions
		System.out.println("Roll the dice by typing Roll");
		boolean RollorNot = Roll();
		if (RollorNot)
		{
			System.out.println("\n\n\n\n\n\n\n\n\n\n\n\nRolling Dice...");
			RollingAnim();
			
			//player final roll
			System.out.println("\n\n\n\n\n\n\n\n\n\n\n\nYour rolled a:");
			int PlayerRoll = (int)(DiceAnim.nextInt(6)+1);
			System.out.println(PlayerRoll);
			
			//computer roll
			System.out.println("Computer rolled a:");
			int ComputerRoll = (int)(DiceAnim.nextInt(6)+1);
			System.out.println(ComputerRoll);
			
			//compare
			int Win = Compare(PlayerRoll,ComputerRoll);
			
			//who wins?
			if (Win==1)
				System.out.println("You Win!");
			if (Win==0)
				System.out.println("Computer Wins!");
			if (Win==2)
				System.out.println("It is a Tie!");	
		}
		
	}
	
	//if player typed in Roll
	public static boolean Roll()
	{
		String Roll = SRoll.next();
		
		//if typed Roll
		if (Roll.equals("Roll"))
		{
			System.out.println("a");
			return true;
		}
		
		//if typed in not "Roll"
		else
		{
			System.out.println("\n\n\n\n\n\n\n\n\n\n\n\nPlease type in \"Roll\"");
			Roll();
		}
		return true;
	}
	
	//roll the dice
	public static void Rolling()
	{
		int Rolling = (int)(DiceAnim.nextInt(6)+1);
		System.out.println("\n\n\n\n\n\n\n\n\n\n\n\nRolling Dice...\n"+Rolling);
	}
	
	//delay
	public static void Delay(int MiliSec)
	{
		try
		{
			Thread.sleep(MiliSec);
		}
		
		catch (InterruptedException e) 
		{
			e.printStackTrace();
		}
	}
	
	//animate rolling for 40 times
	public static void RollingAnim()
	{
		int Times = 0;
		for (Times = 40;Times >= 0;Times--)
		{
			Rolling();
			Delay(50);
		}
	}
	
	public static int Compare(int a, int b)
	{
		if (a>b)
			return 1;
		
		if (a<b)
			return 0;
		if (a==b)
			return 2;
		return 0;
	}
}