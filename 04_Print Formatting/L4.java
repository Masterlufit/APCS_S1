import java.util.Date;
import java.util.Scanner;
public class L4
{
	public static void main(String[]args)
	{
		L4 bah = new L4();
		System.out.printf("%6s","TestA");
		String word1 = "BAHHH";
		double number1 = 2333;
		bah.Format(word1,number1);
		
	}
	public void Format(String word, double number)
	{
		System.out.printf("\n%6s %8f", word, number);
	}
	
}