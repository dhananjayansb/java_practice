import java.util.*;
class Threshold
{
	public static void main(String [] args)
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Array and threshold gicen find output");
		int size,i,temp1,threshold,temp2,temp3,count=0;
		
		System.out.print("Enter Size : ");
		size = s.nextInt();
		System.out.print("Enter array : ");
		int[] array = new int[size];
		for(i=0;i<size;i++)
		{
			array[i]=s.nextInt();
		}
		System.out.print("Enter Threshold value : ");
		threshold=s.nextInt();
		
		for(i=0;i<size;i++)
		{
			temp1=array[i];
			temp2 = temp1/threshold; //to find quotient
			temp3 = temp1%threshold; //to find reminder
			if(temp3 != 0)
			{
				count++;
			}
			count += temp2;
		}
		System.out.println("Threshold value is : "+count);
	}
}