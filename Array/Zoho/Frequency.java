import java.util.*;
class Frequency
{
	public static void main(String [] args)
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Frequency of elements");
		int size,i,j,count,visited=-1;
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
			count = 1;
			for(j=i+1;j<size;j++)
			{
				if(array[i]==array[j])
				{
					count++;
					freq[j]=visited;
				}
			}
			if(freq[i] != visited)
				freq[i]=count;
		}
		System.out.println(" Element | Frequency");  
		for(i=0;i<freq.length;i++)
		{
			if(freq[i] != visited)
				System.out.println("    " + array[i]+"    |    "+ freq[i]); 
		}
	}
}
