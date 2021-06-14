import java.util.*;
class ImmediateLarge
{
	public static void main(String[] args)
	{
		System.out.println("Greater number for each element in array");
		
		Scanner s = new Scanner(System.in);
		int size,i,j,max,temp1,temp2;
		System.out.print("Enter size : ");
		size = s.nextInt();
		System.out.print("Enter Array : ");
		int[] array = new int[size];
		for(i=0;i<size;i++)
		{
			array[i]=s.nextInt();
		}
		//to find max
		max = array[0];
		for(i=1;i<size;i++)
		{
			if(max<array[i])
			{
				max=array[i];
			}
		}
		//Hashing
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
			temp1 = array[i];
			System.out.print(temp1+"<");
			for(j=temp1+1;j<max;j++)
			{
				temp2 = hash[j];
				if(temp2 != 0)
				{
					System.out.print(j);
					break;
				}
			}
			System.out.print(",");
		}
	}
}