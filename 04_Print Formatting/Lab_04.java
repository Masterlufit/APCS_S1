import java.util.Date;
import java.util.Scanner;
public class Lab_04
{
	public static void main(String[]args)
	{
		Lab_04 methods = new Lab_04();
		Lab_04 format = new Lab_04();
		
		Scanner SItem1 = new Scanner(System.in);
		Scanner SItem1P = new Scanner(System.in);
		Scanner SItem2 = new Scanner(System.in);
		Scanner SItem2P = new Scanner(System.in);
		Scanner SItem3 = new Scanner(System.in);
		Scanner SItem3P = new Scanner(System.in);
		Scanner SConfirm = new Scanner(System.in);
		
		
		System.out.println("Welcome to the Mas shopping center");
		System.out.println("Proceeding to SELF CHECKOUT...");
		methods.Delay1Second();
		System.out.println("Self Checkout Ready");
		
		System.out.println("Please enter item 1 ID:");
		String ID1 = SItem1.nextLine();
		System.out.println("Please enter "+ID1+"'s Price:");
		double ID1P = SItem1P.nextDouble();
		methods.Delay1Second();
		System.out.println("Item 1 Recorded: "+ID1+" -- $"+ID1P);
		System.out.println("");
		
		
		System.out.println("Please enter item 2 ID:");
		String ID2 = SItem2.nextLine();
		System.out.println("Please enter "+ID2+"'s Price:");
		double ID2P = SItem2P.nextDouble();
		methods.Delay1Second();
		System.out.println("Item 2 Recorded: "+ID2+" -- $"+ID2P);
		System.out.println("");
		
		
		System.out.println("Please enter item 3 ID:");
		String ID3 = SItem3.nextLine();
		System.out.println("Please enter "+ID3+"'s Price:");
		double ID3P = SItem3P.nextDouble();
		methods.Delay1Second();
		System.out.println("Item 3 Recorded: "+ID3+" -- $"+ID3P);
		System.out.println("");
		methods.Delay1Second();
		
		System.out.println("Item 1: "+ID1+" -- $"+ID1P);
		System.out.println("Item 2: "+ID2+" -- $"+ID2P);
		System.out.println("Item 3: "+ID3+" -- $"+ID3P);
		System.out.println("Confirmed? (Yes-1 No-2)");
		int Confirm = SConfirm.nextInt();
		
		if (Confirm == 1)
		{
			System.out.println("Printing Receipt...");
			methods.Delay1Second();
			methods.Delay1Second();
			System.out.println("");
			System.out.println("");
			methods.Formatting(ID1,ID1P,ID2,ID2P,ID3,ID3P);
		}
		
		if (Confirm != 1)
		{
			System.out.println("");
			System.out.println("Error: Not Confirmed");
			System.out.println("Please Re-Run the program");
		}
		
		
	}
	
	public void Delay1Second()
	{
		try {

			Thread.sleep(1000);
		}
		
		catch (InterruptedException e) 
		{
			e.printStackTrace();
		}
	}
	
	public void Formatting(String I1, double I1P, String I2,double I2P, String I3, double I3P)
	{
		System.out.println(">>>>>>>>>>>>>>> Receipt <<<<<<<<<<<<<<<");
		System.out.printf("%10s ............\t %2f", I1, I1P);
		System.out.printf("\n%10s ............\t %2f", I2, I2P);
		System.out.printf("\n%10s ............\t %2f", I3, I3P);
		double SubTotal = I1P + I2P + I3P;
		double Tax = SubTotal*0.07;
		double Total = SubTotal+Tax;
		System.out.printf("\n\n%10s ............\t %2f", "Subtotal", SubTotal);
		System.out.printf("\n%10s ............\t %2f", "Tax", Tax);
		System.out.printf("\n%10s ............\t %2f", "Total", Total);
		System.out.println("\n---------------------------------------");
		System.out.println("*Thanks for your support*");
	}
}