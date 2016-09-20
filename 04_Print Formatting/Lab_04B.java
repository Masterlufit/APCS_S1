import java.util.Date;
import java.util.Scanner;
public class Lab_04B
{
	public static void main(String[]args)
	{
		Lab_04B methods = new Lab_04B();
		Lab_04B format = new Lab_04B();
		
		Scanner SFirstName = new Scanner(System.in);
		Scanner SLastName = new Scanner(System.in);
		Scanner STitle = new Scanner(System.in);
		Scanner SSchool = new Scanner(System.in);
		Scanner SYear = new Scanner(System.in);
		Scanner SSubject = new Scanner(System.in);
		Scanner SConfirm = new Scanner(System.in);
		
		System.out.println("Hello, and welcome to TPHS.net");
		System.out.println("Please enter your first name:");
		String FirstName = SFirstName.nextLine();
		System.out.println("Please enter your last name:");
		String LastName = SLastName.nextLine();
		System.out.println("Please enter your title:");
		String Title = STitle.nextLine();
		System.out.println("Please enter the school name:");
		String School = SSchool.nextLine();
		System.out.println("Please enter the school year:");
		String Year = SYear.nextLine();
		System.out.println("Please enter the subject you teach:");
		String Subject = SSubject.nextLine();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		
		System.out.println("Name: "+FirstName+" "+LastName);
		System.out.println("Title: "+Title);
		System.out.println("School: "+School+" "+Year);
		System.out.println("Subject: "+Subject);
		System.out.println("Confirm? (Yes-1/No-0)");
		int Confirm = SConfirm.nextInt();
		System.out.println();
		
		
		if (Confirm == 1)
		{
			System.out.println("Printing Name Tag...");
			methods.Delay1Second();
			methods.Delay1Second();
			System.out.println("");
			System.out.println("");
			methods.Formatting(FirstName,LastName,Title,School,Year,Subject);
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
	
	public void Formatting(String FFName, String FLName, String FTitle, String FSchool, String FYear, String FSubject)
	{
		System.out.println("******************************");
		System.out.printf("\n* %10s\t%12s *",FSchool,FYear);
		System.out.printf("\n* %10s\t%12s *",FFName,FLName);
		System.out.printf("\n* %10s\t%12s *",FTitle,FSubject);
		System.out.println("\n******************************");
	}
}


































