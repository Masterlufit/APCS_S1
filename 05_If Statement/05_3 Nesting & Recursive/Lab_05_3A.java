import java.util.*;

public class Lab_05_3A
{
	public static void main(String[]args)
	{
		Scanner UserInput = new Scanner(System.in);
		
		System.out.println("You fell in a deep cave, and you are really hungry..");
		System.out.println("You lit up a big pile of fire around you to keep warm..");
		System.out.println("You found some eggs, a bowl of flour, some sugar, milk, and some butter near you..");
		System.out.println("You decided to make something to eat..");
		System.out.println("Plan A: Use all to make a cake");
		System.out.println("Plan B: Use all but milk to make cookies");
		System.out.println("Plan C: Consume them separately");
		System.out.println("Please choose your plan: [Enter: A, B, or C]");
		String Input1 = UserInput.next();
		
		if(Input1.equals("A"))
			Cake();
		if(Input1.equals("B"))
			Cookie();
		if(Input1.equals("C"))
			Sep();
	}
	
	public static void Cake()
	{
		Scanner UserInput = new Scanner(System.in);
		System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
		System.out.println("You decided to make a cake..");
		System.out.println("You put all the ingredients together, and prepared to bake it..");
		System.out.println("You are unsure how to bake it..");
		System.out.println("Plan A: Build a stone furnance to bake the cake");
		System.out.println("Plan B: Simply bake it on some sticks");
		String Input1 = UserInput.next();
		if(Input1.equals("A"))
		{
			System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
			System.out.println("You decided to make a furnance..");
			System.out.println("Stone after stone, the furnance is built..");
			System.out.println("You put the cake in..");
			System.out.println("You wonders how long you should bake it..");
			System.out.println("Enter the baking time in [MINUTES]:");
			
			int Input2 = UserInput.nextInt();
			
			if(Input2>80)
				System.out.println("OOPS, the cake is burnt..");
			else if(Input2<30)
				System.out.println("Hmmm, the cake is not ready yet");
			else
				System.out.println("You successfully made a cake! Num Nom Num!");
			
		}
		else
		{
			System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
			System.out.println("You decided to bake the cake on sticks..");
			System.out.println("Stick by stick, you built a platform for the cake to go on..");
			System.out.println("You put the cake in..");
			
			System.out.println("You wonders how long you should bake it..");
			System.out.println("Enter the baking time in [MINUTES]:");
			
			int Input3 = UserInput.nextInt();
			
			if(Input3>90)
				System.out.println("OOPS, the cake is burnt..");
			else if(Input3<40)
				System.out.println("Hmmm, the cake is not ready yet");
			else
				System.out.println("You successfully made a cake! Num Nom Num!");
			
		}
	}
	
	public static void Cookie()
	{
		Scanner UserInput = new Scanner(System.in);
		System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
		System.out.println("You decided to make some cookies..");
		System.out.println("You put all the ingredients together, and prepared to bake them..");
		System.out.println("You are unsure how to bake them..");
		System.out.println("Plan A: Build a stone platform to bake the cookies");
		System.out.println("Plan B: Barbecue style");
		String Input1 = UserInput.next();
		if(Input1.equals("A"))
		{
			System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
			System.out.println("You decided to make a platform..");
			System.out.println("Stone after stone, the furnance is built..");
			System.out.println("You put the cookies in..");
			System.out.println("You wonders how long you should bake it..");
			System.out.println("Enter the baking time in [MINUTES]:");
			
			int Input2 = UserInput.nextInt();
			
			if(Input2>50)
				System.out.println("OOPS, the cookies is burnt..");
			else if(Input2<30)
				System.out.println("Hmmm, the cookies is not ready yet");
			else
				System.out.println("You successfully made some cookies!");
		}
		else
		{
			System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
			System.out.println("You decided to do barbecue style");
			System.out.println("You put all the doughs on sticks");
			System.out.println("And put them over the fire");
			
			System.out.println("You wonders how long you should bake it..");
			System.out.println("Enter the baking time in [MINUTES]:");
			
			int Input3 = UserInput.nextInt();
			
			if(Input3>30)
				System.out.println("OOPS, the cookies is burnt..");
			else if(Input3<15)
				System.out.println("Hmmm, the cookies is not ready yet");
			else
				System.out.println("You successfully made some cookies!");
			
		}
	}
	
	public static void Sep()
	{
		Scanner UserInput = new Scanner(System.in);
		System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
		System.out.println("You decided to eat them seperately..");
		System.out.println("You are unsure what to eat first..");
		System.out.println("Plan A: Eggs");
		System.out.println("Plan B: Milk");
		String Input1 = UserInput.next();
		if(Input1.equals("A"))
		{
			System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
			System.out.println("You decided to consume eggs first..");
			System.out.println("Num nom num..");
			System.out.println("You feel thirsty..");
			System.out.println("You wonders how you should get water..");
			System.out.println("Plan A: Walk around the cave, and try to find water");
			System.out.println("Plan B: Dig down into some wet dirt and try to find water");
			
			String Input2 = UserInput.next();
			
			if(Input2.equals("A"))
			{
				System.out.println("You walked around, and found a dirty pond..");
				System.out.println("You used your water filtering device and drank some..");
			}
			else
				System.out.println("You dug down, and found a dog..");
				System.out.println("You brought the dog back up, and drank your milk..");
		}
		else
		{
			System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
			System.out.println("You decided to consume milk first..");
			System.out.println("Glug glug glug..");
			System.out.println("You feel hungry..");
			System.out.println("You wonders how you should get food..");
			System.out.println("Plan A: Walk around the cave, and try to find berries");
			System.out.println("Plan B: Go hunt for some villages near by");
			
			String Input3 = UserInput.next();
			
			if(Input3.equals("A"))
			{
				System.out.println("You walked around, and found a blueberry bush..");
				System.out.println("You ate some, and went back..");
			}
			else
				System.out.println("You searched around, found a lonely house..");
				System.out.println("You went to the house, and shared a meal with the owner..");
		}
	}
}