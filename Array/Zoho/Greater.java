import java.util.*;
class Greater
{
	//print element greater than its previous element
	public static void main(String[] args)
	{
		System.out.println("To find elements greater than its previous element");
		
		Scanner s = new Scanner(System.in);
		int size,i,j,temp1,temp2,count;
		System.out.print("Enter size : ");
		size = s.nextInt();
		int[] array = new int[size];
		System.out.print("Enter array elements : ");
		for(i=0;i<size;i++)
		{
			array[i]=s.nextInt();
		}
		
		System.out.print("Result array : ");
		System.out.print(array[0]);
		for(i=1;i<size;i++)
		{
			count = 0;
			temp1 = array[i];
			for(j=0;j<i;j++)
			{
				temp2 = array[j];
				if(temp1<temp2)
				{
					count++;
					break;
				}	
			}
			if(count==0)
				System.out.print(" "+temp1);
		}
	}
}