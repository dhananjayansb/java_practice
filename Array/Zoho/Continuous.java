import java.util.*;
class Continuous
{
	public static void main(String [] args)
	{
		System.out.println("Numbers having longest continuous range");
		Scanner s = new Scanner(System.in);
		int size,i,temp,next,max;
		System.out.print("Enter Size : ");
		size = s.nextInt();
		int[] array = new int[size];
		System.out.print("Enter array : ");
		for(i=0;i<size;i++)
		{
			array[i]=s.nextInt();
		}
		max=array[0];
		for(i=0;i<size;i++)
		{
			if(max<array[i])
			{
				max=array[i];
			}
		}
		
		//hashing
		max=max+1;
		int[] hash = new int[max];
		for(i=0;i<max;i++)
		{
			hash[i]=0;
		}
		for(i=0;i<size;i++)
		{
			hash[array[i]]++;
		}
		
		for(i=0;i<size;i++)
		{
			
		}
	}
}