import java.util.Scanner;
public class Lab_04_1
{
	public static void main(String[]args)
	{
		//Register Scanners
		Scanner kb = new Scanner(System.in);
		
		//Code Starts
		System.out.println("Welcome to the Bank!");
		System.out.println("Enter the amount of USD you want to loan:");
		double Loan = kb.nextDouble();
		System.out.println("Years?");
		double Year = kb.nextDouble();
		double TotalCost = Calc(Loan,0.03,12D,Year);
		System.out.println("Monthly Cost: "+TotalCost);
	}
	
	static double Calc(double P,double r, double n,double t)
	{
		return (Math.pow( 1+ r/n, n*t)*P)/(t*12);
	}
}






