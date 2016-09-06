public class Lab_02
{
	public static void main(String[]args)
	{
		System.out.println("Multiplication");
		double a = 0.5;
		int b = 10;
		System.out.println("0.5 multiplied by 10 is "+a*b);
		System.out.println("");
		System.out.println("Concatenation");
		int Number = 3710;
		String Road = "Del Mar Hights Rd, ";
		String City = "San Diego, ";
		String State = "CA";
		int Zip = 92130;
		System.out.println("TPHS Address: "+Number+" "+Road+City+State+" "+Zip);
		System.out.println("");
		System.out.println("Complex Calculation");
		int Length = 8;
		int Width = 6;
		int Height = 5;
		int Volume = Length*Width*Height;
		int SurfaceArea = Length*Width*2 + Width*Height*2 + Length*Height*2;
		System.out.println("The serface area of the cuboid is: "+SurfaceArea);
	}
}