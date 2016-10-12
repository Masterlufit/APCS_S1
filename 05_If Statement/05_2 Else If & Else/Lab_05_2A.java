import java.util.*;
public class Lab_05_2A
{
	//static String WholeGrade = "";
	public static void main(String[]args)
	{
		Scanner SGrade = new Scanner(System.in);
		
		System.out.println("GPA Calculator");
		System.out.println("Please enter your 7 subject's letter grades:");
		
		String Grade1 = SGrade.next();
		String Grade2 = SGrade.next();
		String Grade3 = SGrade.next();
		String Grade4 = SGrade.next();
		String Grade5 = SGrade.next();
		String Grade6 = SGrade.next();
		String Grade7 = SGrade.next();
		
		float G1 = Convert(Grade1);
		float G2 = Convert(Grade2);
		float G3 = Convert(Grade3);
		float G4 = Convert(Grade4);
		float G5 = Convert(Grade5);
		float G6 = Convert(Grade6);
		float G7 = Convert(Grade7);
		
		float GPA = CalcGrade(G1,G2,G3,G4,G5,G6,G7);
		if(GPA>4.0f)
			System.out.println("Invalid Grades");
		else
			System.out.println("Your GPA is: "+GPA);
	}
	
	public static float Convert(String a)
	{
		if(a.equals("A"))
			return 4.0f;
		
		if(a.equals("B"))
			return 3.0f;
		
		if(a.equals("C"))
			return 2.0f;
		
		if(a.equals("D"))
			return 1.0f;
		
		if(a.equals("F"))
			return 0.0f;
		
		if(a.equals("a"))
			return 4.0f;
		
		if(a.equals("b"))
			return 3.0f;
		
		if(a.equals("c"))
			return 2.0f;
		
		if(a.equals("d"))
			return 1.0f;
		
		if(a.equals("f"))
			return 0.0f;
		
		else
			return 100.0f;
	}
	
	public static float CalcGrade(float a, float b, float c, float d, float e, float f, float g)
	{
		float GradeSum = a+b+c+d+e+f+g;
		float GPA = GradeSum/7.0f;
		if(GPA>4.0f)
			return 100.0f;
		else
			return GPA;
	}
	
}