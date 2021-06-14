//Addition of two large numbers
import java.util.*;
class Largeadd
{
	public static void main(String [] args)
	{
		System.out.println("Adding two large numbers");
		Scanner s = new Scanner(System.in);
		System.out.print("Enter two number1 : ");
		String num1 = s.nextLine();
		System.out.print("Enter two number1 : ");
		String num2 = s.nextLine();
		
		int n1 = num1.length();
		int n2 = num2.length();
		int diff=n2-n1,i,flag=0,iteration=n2-1;
		
		if(diff!=0)
		{
			if(diff<0)
			{
				diff*=-1;
				flag=1;
				iteration = n1-1;
			}
			
			int ar[]= new int[diff];
			for(i=0;i<diff;i++)  
			{
				ar[i]=0;
			}
			String test = Arrays.toString(ar);
			String appender = test.replaceAll("[\\[\\]\\,\\' ']","");

			if(flag == 0)
			{
				num1=appender+num1;
			}
			else
			{
				
				num2=appender+num2;
			}
		}

		int[] result = new int[iteration+1];
		int carry=0,sum=0;
		for(i=iteration;i>=0;i--)
		{
			sum = carry+(num1.charAt(i)-'0')+(num2.charAt(i)-'0');
			result[i]=(sum%10);
			carry=sum/10;	
		}
		
		String temp = Arrays.toString(result);
		String answer= temp.replaceAll("[\\[\\]\\,\\' ']","");
		
		if (carry == 1) 
			answer = "1"+answer;
		
		System.out.println("Sum = "+answer);
		
	}

}