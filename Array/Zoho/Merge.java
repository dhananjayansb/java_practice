import java.util.*;
class Merge 
{
	public static void main(String [] args)
	{
		System.out.println("Merge two array without duplicates");
		Scanner s = new Scanner(System.in);
		int i,count=1,temp1,temp2,size,j;
		//creating array of strings
		String str1[] = new String[1];
		String str2[] = new String[1];
		System.out.print("Enter both array 1 : ");
		for(i=0;i<1;i++)
		{
			str1[i]=s.nextLine();
			
		}
		System.out.print("Enter both array 2 : ");
		for(i=0;i<1;i++)
		{
			str2[i]=s.nextLine();
			
		}
		
		//creating list to add strings
		List list = new ArrayList(Arrays.asList(str1));
		list.addAll(Arrays.asList(str2));
		
		//converting list to string
		String output = list.toString().replaceAll("[\\[\\]\\,\\' ']","");
		size = output.length();
	
		//removing duplicates
		System.out.print("Added array without duplicates: ");
		for(i=0;i<size;i++)
		{
			temp1 = (int)output.charAt(i)-'0';
			for(j=i+1;j<size;j++)
			{
				temp2 = (int)output.charAt(j)-'0';
				if(temp1 == temp2)
				{
					count++;
				}
			}	
			if(count == 1)
			{
				System.out.print(temp1);
			}
			count=1;
		}
		
		//System.out.println(count);
	}
}