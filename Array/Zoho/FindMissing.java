import java.util.*;
class FindMissing
{
	public static void main(String [] args)
	{
		System.out.println("Find Missing elements in an array");
		Scanner s = new Scanner(System.in);
		int i,j,temp,key=0,diff=0,missing=0;
		System.out.print("Enter size : ");
		int n = s.nextInt();
		int[] array = new int[n];
		System.out.print("Enter array elements : ");
		for(i=0;i<n;i++)
		{
			array[i]=s.nextInt();
		}
		for(i=0;i<n;i++)
		{
			for(j=i+1;j<n;j++)
			{
				if(array[i]>array[j])
				{
					temp = array[i];
					array[i] = array[j];
					array[j] = temp;
				}
			}
		}
		key = array[0]-0;
		for(i=0;i<n;i++)
		{
			diff = (array[i] - i);
			if(diff != key)
			{
				missing = key+i;
				System.out.print("Missing elements are : "+missing+" "); 
				key++;
			}
		}
	}

}