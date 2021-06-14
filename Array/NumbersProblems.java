import java.util.*;
class NumbersProblems
{
	public static void prime()
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter Number to find prime");
		int n = s.nextInt();
		int count = 0;
		for(int i=2;i<n;i++)
		{
			if((n%i)==0)
			{
				count++;
				break;
			}
		}			
		if(count==1)
			System.out.println(n+" - is not a Prime Number");
		else
			System.out.println(n+" - is  a Prime Number");
		s.close();	
	}
	
	public static void fibonacci()
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter Number to find fibonacci");
		int n = s.nextInt();
		int n1=0,n2=1,n3,i;
		System.out.print(n1+" "+n2);
		for(i=2;i<n;i++)
		{
			n3=n1+n2;
			System.out.print(" "+n3);
			n1=n2;
			n2=n3;
		}
		System.out.print("  - Fibonacci of Number");
		System.out.println();
		s.close();	
	}
	
	public static void factorial()
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter Number to find factorial");
		int n = s.nextInt();
		int fact=1,i;
		for(i=1;i<n;i++)
		{
			fact*=i;
		}
		System.out.print(fact+"  - Factorial of Number");
		System.out.println();
		s.close();	
	}
	
	public static void Armstrong()
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter Number to find armstrong");
		int n = s.nextInt();
		int arm=0,temp,r;
		temp=n;
		while(n>0)
		{
			r = n%10;
			n = n/10;
			arm += (r*r*r);
		}
		if(temp==arm)
			System.out.println(temp+" - is a Armstrong Number");
		else
			System.out.println(temp+" - is not a Armstrong Number");
		s.close();	
	}
	
	public static void ascii()
	{
		Scanner s = new Scanner(System.in);
		char ch =s.next().charAt(0);
		int n = (int)ch;
		System.out.println("ASCII value of "+ch+" is : "+n);
		s.close();	
	}
	
	public static void gcd()
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter Number to find GCD");
		int num1  = s.nextInt();
		int num2  = s.nextInt();
		int temp,gcd=0;
		while(num2!=0)
		{
			temp=num2;
			num2=num1%num2;
			num1=temp;
		}
		gcd=num1;
		System.out.println("GCD of two numbers is : "+gcd);	
		s.close();	
	}
	
	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
        System.out.println("----------------------------------");
		System.out.println("1.Find Number is Prime/not");
		System.out.println("2.Find fibonacci series of Number");
		System.out.println("3.Find factorial of  Number");
		System.out.println("4.Find Number is Armstrong/not");
		System.out.println("5.Find ASCII value of  character");
		System.out.println("6.GCD");
		System.out.println("----------------------------------");
		int i = s.nextInt();
		if(i==1)prime();
		if(i==2)fibonacci();
		if(i==3)factorial();
		if(i==4)Armstrong();
		if(i==5)ascii();
		if(i==6)gcd();
	}
}
