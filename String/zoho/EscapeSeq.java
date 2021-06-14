import java.util.*;
class EscapeSeq
{
	public static void main(String[] args)
	{
		System.out.println("Escapesequence detection and printing length of string");
		Scanner s = new Scanner(System.in);
		System.out.print("Enter the String : ");
		String str1 = s.nextLine();
		int i,count=0,length,result,dollar;
		length = str1.length();
		for(i=0;i<length;i++)
		{
			if((str1.charAt(i))=='$')
			{
				count++;
			}
		}
		//System.out.print(count);
		dollar = count -1;
		result = length-dollar;
		System.out.print(result);
	}
}