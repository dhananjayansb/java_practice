import java.util.*;
class Palindrome
{
	public static void main(String [] args)
	{
		System.out.println("Number to check palindrome");
		Scanner s = new Scanner(System.in);
		int r,sum=0,temp;
		System.out.print("Enter number to check palindrome : ");
		int n = s.nextInt();
		temp=n;
		while(n>0)
		{
			r = n%10;
			sum = (sum*10)+r;
			n = n/10;
		}
		if(temp==sum)
			System.out.println("Palindrome");
		else
			System.out.println("Not Palindrome");
	}
}