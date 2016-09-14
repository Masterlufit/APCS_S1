import java.util.Date;
import java.util.Scanner;
public class Lab_03
{
	public static void main(String[]args)
	{
		//AI
		Scanner SName = new Scanner(System.in);
		Scanner SAge = new Scanner(System.in);
		Scanner SHobbies = new Scanner(System.in);
		Scanner SMusic = new Scanner(System.in);
		Scanner SSiblings = new Scanner(System.in);
		Scanner SGrowUp = new Scanner(System.in);
		//BMI
		Scanner SHeight = new Scanner(System.in);
		Scanner SWeight = new Scanner(System.in);
		//Custom
		Scanner SX = new Scanner(System.in);
		Scanner SY = new Scanner(System.in);
		
		System.out.println("--------------------------------Rude AI is Activated--------------------------------");
		System.out.println("Detecting system version...");
		try {

			Thread.sleep(2000);
		}
		
		catch (InterruptedException e) 
		{
			e.printStackTrace();
		}
		System.out.println("System Version: 0.1.4 [Alpha]");
		System.out.println("");
		try {

			Thread.sleep(500);
		}
		
		catch (InterruptedException e) 
		{
			e.printStackTrace();
		}
		System.out.println("Loading System Files...");
		System.out.println("");
		try {
			Thread.sleep(1000);
		}
		
		catch (InterruptedException e) 
		{
			e.printStackTrace();
		}
		System.out.println("Entering Rude Mode...");
		System.out.println("");
		try {

			Thread.sleep(1000);
		}
		
		catch (InterruptedException e) 
		{
			e.printStackTrace();
		}
		System.out.println("Hi, my name is Rude AI.");
		System.out.println("I'd like to ask you a few questions.");
		System.out.println("What is your name?");
		String Name = SName.nextLine();
		System.out.println(Name+"?!!! Why would anyone name a baby that?");
		System.out.println("How old are you, "+Name+"?");
		int Age = SAge.nextInt();
		System.out.println("Oooooo!!! "+Age+" is getting up there.");
		System.out.println("What do you do for fun, "+Name+"?");
		String Hobbies = SHobbies.nextLine();
		System.out.println("I thought only nerds like to "+Hobbies+"?");
		System.out.println("What kind of music to you like?");
		String Music = SMusic.nextLine();
		System.out.println("Boooo!!! I wouldn't wish the sound of "+Music+" on my worst enemy.");
		System.out.println("How many siblings do you have?");
		int Siblings = SSiblings.nextInt();
		System.out.println(Siblings+"? Wow, I hope the rest of your family is better looking.");
		System.out.println("What do you want to be when you grow up?");
		String GrowUp = SGrowUp.nextLine();
		System.out.println("I think you'd have to be smarter to be a "+GrowUp+"...");
		System.out.println("So "+Name+", you are "+Age+", you like to "+Hobbies+" and listen to "+Music+", and good luck becoming a "+GrowUp);
		System.out.println("Just kidding, "+Name);
		System.out.println("");
		System.out.println("Activating BMI Calculation...");
		try {

			Thread.sleep(2000);
		}
		
		catch (InterruptedException e) 
		{
			e.printStackTrace();
		}
		System.out.println("BMI Calculation Activated!");
		System.out.println("");
		System.out.println("How tall are you, "+Name+"?");
		int Height = SHeight.nextInt();
		System.out.println("How much do you weigh?");
		int Weight = SWeight.nextInt();
		int BMI = 703*Weight/Height/Height;
		System.out.println("Your BMI is: "+BMI+".");
		System.out.println("");
		System.out.println("Activating Custom Calculation...");
		try {

			Thread.sleep(2000);
		}
		
		catch (InterruptedException e) 
		{
			e.printStackTrace();
		}
		System.out.println("Custom Calculation Activated!");
		System.out.println("");
		
		System.out.println("Please enter int X and Y.");
		System.out.println("Define X(any number):");
		int X = SX.nextInt();
		System.out.println("Define Y(any number):");
		int Y = SY.nextInt();
		int XYSum = X+Y;
		int XYDifference = Math.abs(X-Y);
		int XYMulti = X*Y;
		System.out.println("");
		System.out.println("");
		try {

			Thread.sleep(500);
		}
		
		catch (InterruptedException e) 
		{
			e.printStackTrace();
		}
		System.out.println("X + Y = "+XYSum);
		try {

			Thread.sleep(500);
		}
		
		catch (InterruptedException e) 
		{
			e.printStackTrace();
		}
		System.out.println("|X - Y| = "+XYDifference);
		try {

			Thread.sleep(500);
		}
		
		catch (InterruptedException e) 
		{
			e.printStackTrace();
		}
		System.out.println("X * Y = "+XYMulti);
		System.out.println("--------------------------------Rude AI is Deactivated--------------------------------");
	}
}