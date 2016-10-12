import java.util.*;
public class Lab_05B
{
	public static void main(String[]args)
	{
		Lab_05B methods = new Lab_05B();
		Lab_05B format = new Lab_05B();
		
		Scanner SItem1 = new Scanner(System.in);
		Scanner SItem1P = new Scanner(System.in);
		Scanner SItem2 = new Scanner(System.in);
		Scanner SItem2P = new Scanner(System.in);
		Scanner SItem3 = new Scanner(System.in);
		Scanner SItem3P = new Scanner(System.in);
		Scanner SItem4 = new Scanner(System.in);
		Scanner SItem4P = new Scanner(System.in);
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
		
		
		System.out.println("Please enter item 4 ID:");
		String ID4 = SItem4.nextLine();
		System.out.println("Please enter "+ID4+"'s Price:");
		double ID4P = SItem4P.nextDouble();
		methods.Delay1Second();
		System.out.println("Item 4 Recorded: "+ID4+" -- $"+ID4P);
		System.out.println("");
		methods.Delay1Second();
		
		
		System.out.println("Item 1: "+ID1+" -- $"+ID1P);
		System.out.println("Item 2: "+ID2+" -- $"+ID2P);
		System.out.println("Item 3: "+ID3+" -- $"+ID3P);
		System.out.println("Item 4: "+ID4+" -- $"+ID4P);
		System.out.println("Confirmed? (Y/N)");
		String Confirm = SConfirm.next();
		
		if (Confirm.equals("Y"))
		{
			System.out.println("Printing Receipt...");
			methods.Delay1Second();
			methods.Delay1Second();
			System.out.println("");
			System.out.println("");
			
			System.out.println(">>>>>>>>>>>>>>> Receipt <<<<<<<<<<<<<<<");
			methods.Formatting(ID1,ID1P);
			methods.Formatting(ID2,ID2P);
			methods.Formatting(ID3,ID3P);
			methods.Formatting(ID4,ID4P);
			
			double SubTotal = ID1P + ID2P + ID3P;
			double Discount = 0;
			if (SubTotal>=2000)
				Discount = SubTotal*0.15;
			double Tax = SubTotal*0.07;
			double Total = SubTotal+Tax-Discount;
			
			System.out.println("");
			methods.TotFormatting("Sub-Total",SubTotal);
			methods.TotFormatting("Tax",Tax);
			methods.TotFormatting("Discount",Discount);
			methods.TotFormatting("Total",Total);
			
			
			
			System.out.println("\n---------------------------------------");
			System.out.println("*Thanks for your support*");
		}
		
		if (!Confirm.equals("Y"))
		{
			System.out.println("");
			System.out.println("Error: Not Confirmed");
			System.out.println("Please Re-Run the program");
		}
		
		
	}
	
	public void Delay1Second()
	{
		try {

			Thread.sleep(100);
		}
		
		catch (InterruptedException e) 
		{
			e.printStackTrace();
		}
	}
	
	public void Formatting(String Item, double ItemPrice)
	{
		System.out.printf("%15s \t.....\t %7f\n", Item, ItemPrice);
	}
	
	public void TotFormatting(String Item, double ItemPrice)
	{
		System.out.printf("%13s\t %5s\t %7f\n",Item,".....",ItemPrice);
	}
}