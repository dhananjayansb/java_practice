import java.lang.String;
public class StringAPI
{
	public static void main(String [] args)
	{
		String s = "Foreva";//s is object
		String s1 = "DJ";
		//--------------charAt----------------
		char y = s.charAt(4); //charAt - method 
		System.out.println(y);
		//---------------length----------------
		int l = s.length(); //length - method
		System.out.println(l);
		char a[] = new char[l];//char array declaration in java
		for(int i=0;i<l;i++)
		{
			char c = s.charAt(i);
			a[i] = c;
		}
		System.out.println(a);
		//--------Concat---------------------
		String s2 = s.concat(s1);
		System.out.println(s2);
		String s3 = s + s1;
		System.out.println(s3);
		System.out.println(s+s1);
		//--------------Equals---------------
		boolean b = s2.equals(s1);
		System.out.println(b);
		//------------------Replace----------
		String s4 = "Dhananjayan";
		String r = s4.replace('a','b');
		System.out.println(r);
		//---------------------Split---------
		String s5 = "I Am IRONMAN";
		String[] sp = s5.split(" ");
		int len = sp.length;
		for(int i=0;i<len;i++)
		{
			System.out.println(sp[i]);
		}
		//---------toLowerCase---------------
		String s6 = "INEVITABLE";
		String low = s6.toLowerCase();
		System.out.println(low);
		//---------toUpperCase---------------
		String up = low.toUpperCase();
		System.out.println(up);
		//---------toCharArray----------------
		String s7 = "CharArray";
		int lent = s7.length();
		char ar[] = s7.toCharArray();
		for(int i=0;i<lent;i++)
		{
			System.out.println(ar[i]);
		}
		//-----------valueOf-Static method-----------------
		//anything to string
		char vo[]= new char[4];
		vo[0]='H';
		vo[1]='e';
		vo[2]='l';
		vo[3]='o';
		System.out.println(vo);
		String s8 = String.valueOf(vo);
		System.out.println(s8);
		int z=19,u=98;
		int sum=z+u;
		System.out.println(sum);
		String int1 = String.valueOf(z);
		String int2 = String.valueOf(u);
		String ccat = int1+int2;
		System.out.println(ccat);
		//----------Substring-------------------------------
		String s9 = "ForevaDJrog";
		String sub = s9.substring(6,8);
		System.out.println(sub);
	}
}