import java.util.Scanner;
class Palindrome
{
	public static void main(String [] args)
	{
		Scanner s = new Scanner(System.in);
		String s1 = s.next();
		StringBuffer sb = new StringBuffer(s1);
		sb.reverse();
		String rev = new String(sb);
		boolean b = s1.equals(rev);
		if(b)
		{
			System.out.println("Palindrome");
		}
		else
		{
			System.out.println("Not Palindrome");
		}	
		System.out.println(s1==rev);
	}
}