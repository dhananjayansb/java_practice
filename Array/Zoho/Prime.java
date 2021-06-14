import java.util.*;
class Prime
{
	//seperate prime and non prime numbers
	
	public static  boolean prime(int n)
	{
		int count=0;
		for(int i=2;i<n;i++)
		{
			if(n%i==0)
			{
				count++;
				break;
			}
		}
		if(count==1)
			return false;
		else
			return true;
	}
	public static void main(String [] args)
	{
		System.out.println("Seperate prime and non prime numbers");
		Scanner s = new Scanner(System.in);
		System.out.print("Enter Size : ");
		int n = s.nextInt();
		int arr[] = new int[n];
		System.out.print("Enter array elements : ");
		for(int i =0;i<n;i++)
		{
			arr[i]=s.nextInt();
		}
		System.out.print("Sorted Array : ");
		for(int i=0;i<n;i++)
		{
			int k = arr[i];
			boolean b=prime(k);
			if(b==true)
				System.out.print(" "+arr[i]+" ");	
		}
		for(int i=0;i<n;i++)
		{ 
			int k = arr[i];
			boolean b=prime(k);
			if(b==false)
				System.out.print(" "+arr[i]+" ");	
		}
	}
}