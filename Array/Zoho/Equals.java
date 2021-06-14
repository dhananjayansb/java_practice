import java.util.*;
class Equals
{
	public static void main(String [] args)
	{
		Scanner s = new Scanner(System.in);
		long number,sum1=0,sum2=0;
		int size,i,mid;
		number = s.nextLong();
		
		size = Long.toString(number).length();
		//System.out.print(size);
		long[] array = new long[size];
		for(i=0;i<size;i++)
		{
			array[i] = number % 10 ;
			number /= 10 ;
		}
		mid = (size/2);
		//System.out.print(mid);
		if(size%2 != 0)
		{
			for(i=0;i<mid;i++)
			{
				sum1 = sum1+array[i];
				//System.out.print(array[i]);
			}
			for(i=mid+1;i<size;i++)
			{
				sum2 = sum2+array[i];
				//System.out.print(array[i]);
			}
			if(sum1 == sum2)
				System.out.print("YES");
			else	
				System.out.print("NO");
		}
		else
		{
			for(i=0;i<mid;i++)
			{
				sum1 = sum1+array[i];
			}
			for(i=mid;i<size;i++)
			{
				sum2 = sum2+array[i];
			}
			System.out.print(sum1);
			System.out.print(sum2);
			if(sum1 == sum2)
				System.out.print("YES");
			else	
				System.out.print("NO");
		}
	}
}