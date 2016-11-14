import java.util.*;
public class Lab_09C
{
	public static void main(String[]args)
	{
		int[] rand = new int[10];
		for (int a=0;a<rand.length;a++)
			rand[a] = (int)(Math.random()*100)+1;
		for(int print:rand)
			System.out.print(print+" ");
		avg(rand);
		
	}
	public static void avg(int[] num)
	{
		int sum=0;
		for(int plus:num)
		{
			sum += plus;
		}
		System.out.println("\n\nThe avg of the numbers above is: "+sum/10);
	}
}