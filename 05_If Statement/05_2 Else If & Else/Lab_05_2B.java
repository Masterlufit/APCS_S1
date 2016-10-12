import java.util.*;
public class Lab_05_2B
{
	public static void main(String[]args)
	{
		//BMI
		Scanner SHeight = new Scanner(System.in);
		Scanner SWeight = new Scanner(System.in);
		
		System.out.println("System Version: 1.7.10 [Beta]");
		System.out.println("BMI Calculation Activated!");
		System.out.println("How tall are you?");
		float Height = SHeight.nextFloat();
		System.out.println("How much do you weigh?");
		float Weight = SWeight.nextFloat();
		float BMI = 703*Weight/Height/Height;
		System.out.println("Your BMI is: "+BMI+".");
		System.out.println("Your Condition is: "+Calc(BMI)+".");

	}
	
	public static String Calc(float a)
	{
		if(a<18.5f)
			return "Underweight";
		else if(a<24.9f && a>18.5f)
			return "Normal";
		else if(a>24.9f && a<29.9f)
			return "Overweight";
		else if(a>24.9f && a<29.9f)
			return "Overweight";
		else if(a>29.9f && a<34.9f)
			return "Obese";
		else if(a>35.9f && a<39.9f)
			return "Very Obese";
		else if(a>39.9f)
			return "Morbidly Obese";
		else
			return "Um... Really?";
	}
}