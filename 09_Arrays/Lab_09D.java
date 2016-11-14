import java.util.*;
public class Lab_09D
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("");
		System.out.println("Enter the size");
		int size = kb.nextInt();
		System.out.println("Enter the starting number:");
		int start = kb.nextInt();
		int[] seq = new int[size];
		if(size==0||size==1) {
			System.out.println(start);
		} else {
			seq[0] = 0;
			System.out.println("0");
			seq[1] = start;
			System.out.println(start);
			for(int a = 2; a<seq.length;a++){
				seq[a] = seq[a-1]+seq[a-2];
				System.out.println(seq[a]);
			}
		}
	}
}