import java.util.*;

public class Lab_06_1D
{
	public static void main(String[]args)
	{
		sing(4,"a");
		sing(6,"b");
		sing(8,"c");
		sing(10,"d");
	}
	
	public static void sing(int a, String b)
	{
		for(int RC=0;RC<=a;RC++)
		{
			System.out.printf(b+" ");
		}
		System.out.println("");
	}
}