import java.util.*;
class Alternatesort
{
	public static void main(String [] args)
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Frequency of elements");
		int size,i,j,temp;
		System.out.print("Enter Size : ");
		size = s.nextInt();
		int[] array = new int[size];
		int[] freq = new int[size];
		System.out.print("Enter array : ");
		for(i=0;i<size;i++)
		{
			array[i]=s.nextInt();
		}
		
		for(i=0;i<size;i++)
		{
			for(j=i+1;j<size;j++)
			{
				if(array[i]>array[j])
				{
					temp = array[i];
					array[i]=array[j];
					array[j]=temp;
				}
			}				
		}
		
		i=0;j=size-1;
		while(i<j)
		{
			System.out.print(" "+array[j--]);
			System.out.print(" "+array[i++]);
		}
		
		if(size%2 != 0)
		{
			System.out.print(" "+array[i]);
		}
	}
}