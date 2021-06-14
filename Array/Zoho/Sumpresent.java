import java.util.*;
class Sumpresent
{
	public static void main(String[] args)
	{
		System.out.println("To find number is addition of any two elements in array");
		Scanner s = new Scanner(System.in);
		int size,i,j,num,temp=0,count=0;
		System.out.print("Enter Size : ");
		size = s.nextInt();
		int[] array = new int[size];
		System.out.print("Enter Array : ");
		for(i=0;i<size;i++)
		{
			array[i]=s.nextInt();
		}
		System.out.print("Enter number to check : ");
		num = s.nextInt();
		
		for(i=0;i<size;i++)
		{
			temp = 	array[i];
			for(j=i+1;j<size;j++)
			{
				temp=temp+array[j];
				if(num == temp)
				{
					count++;
					System.out.println("True");
					break;
				}
				else
				{
					temp = array[i];
				}
			}
			if(count!=0)
			{
				break;
			}
		}
		if(count==0)
		{
			System.out.println("False");
		}
	}
}