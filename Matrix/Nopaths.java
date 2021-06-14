//Number of paths
/*The problem is to count all the possible paths from top left to bottom right of a MxN matrix 
with the constraints that from each cell you can either move to right or down.*/

import java.util.*;
class NoPaths
{
	public static int fact(int n)
	{
		// We have to calculate m+n-2 C n-1 here
        // which will be (m+n-2)! / (n-1)! ((m+n-2)-(n-1))!
		int i,fact=1;
		for(i=1;i<n;i++)
		{
			fact*=i;
		}
		return fact;
	}
	
	public static void main(String [] args)
	{
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt(); //row
		int M = sc.nextInt(); //column
		char mat[][] = new char[N][M];
		for(int i=0;i<N;i++)
		{
			for(int j=0;j<M;j++)
			{
				mat[i][j]=sc.next().charAt(0);
			}
			sc.nextLine();
		}
		int solution = ((fact(M+N-2))/((fact(N-1))*(fact(M+N-2-(N-1)))));
		System.out.println("The total number of path is "+solution);
	}
}