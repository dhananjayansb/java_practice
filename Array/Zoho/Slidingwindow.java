import java.util.*;
class Slidingwindow
{
	public static void main(String [] args)
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Frequency of elements");
		int size,i,j,k,window,max;
		System.out.print("Enter Size : ");
		size = s.nextInt();
		int[] array = new int[size];
		int[] freq = new int[size];
		System.out.print("Enter array : ");
		for(i=0;i<size;i++)
		{
			array[i]=s.nextInt();
		}
		System.out.print("Enter window size : ");
		window = s.nextInt();
		
		System.out.print("numbers under the sliding window : ");
		for(i=0,j=window-1;j<size;i++,j++)
		{
			max=array[i];
			for(k=i+1;k<=j;k++)
			{
				if(max<array[k])
				{
					max=array[k];
				}
			}
			System.out.print(max+" ");
		}
	}
}	