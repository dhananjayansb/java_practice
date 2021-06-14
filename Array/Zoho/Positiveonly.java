import java.util.*;
class Positiveonly
{
	public static void main(String[] args)
	{
		//Intialization
		System.out.println("To find maximum sum of positive elements in an array");
		Scanner s = new Scanner(System.in);
		System.out.print("Enter size : ");
		int n = s.nextInt();
		int[] array = new int[n];
		int[] positive = new int[n];
		int i,j=0,sum=0,max=0,temp=0;
		
		//input
		System.out.print("Enter array elements : ");
		for(i=0;i<n;i++)
		{
			array[i]=s.nextInt();
		}
	
		for(i=0;i<n;i++)
		{
			if(array[i]>=0)
			{
				positive[j]=array[i];
				j++;
			}
			
		}
		max = positive[0];
	
		for(i=0;i<n;i++)
		{
			if(max<positive[i])
			{
				temp = positive[i];
				positive[i] = positive[i-1];
				positive[i-1] = temp;
			}
		}
		
		sum = positive[0]+positive[1];
		
		System.out.println("Sum of two large positives : "+sum);
		
	}
}