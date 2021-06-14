/*
append
charAt
delete
deleteCharAt
length
reverse
setCharAt
*/
import java.util.Scanner;
import java.lang.String;
public class Sbuffer
{
	public static void main(String [] args)
	{
		StringBuffer sb = new StringBuffer("Forevadj");
		System.out.println(sb);
		//Reverse
		StringBuffer rev = sb.reverse();
		System.out.println(rev);
		//Delete
		sb.delete(0,5);
		System.out.println(sb);;
		System.out.println(sb);
		//SetCharAt
		sb.setCharAt(0,'F').deleteCharAt(2);
		System.out.println(sb);
		//Scanner
		Scanner s = new Scanner(System.in);
		int a = s.nextInt();
		int b = s.nextInt();
		System.out.println(a);
		System.out.println(b);
	}
}

