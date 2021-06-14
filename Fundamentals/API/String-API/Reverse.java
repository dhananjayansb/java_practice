class Reverse
{
	public static void main(String [] args)
	{
		String s = "malayalam";
		char r[] = s.toCharArray();
		int len = s.length();
		int  i=0,j=len-1;
		System.out.println(s);
		while(i<j)
		{
			char temp = r[i];
			r[i]=r[j];
			r[j]=temp;
			i++;j--;
		}
		System.out.println(r);
	}
}
