//SUM of elements in a Matrix
//Given a non null integer matrix Grid of dimensions NxM.Calculate the sum of its elements.
import java.util.*;
public class SumMatrix
{
	
	public static void matrixsum(int N,int M,int[][] mat)
	{
		int sum=0;
		for(int i=0;i<N;i++)
		{
			for(int j=0;j<M;j++)
			{
				sum+=mat[i][j];
			}
		}
		System.out.println("Sum of elements in matrix"+" "+sum);
	}
	
	public static void main(String [] args)
	{
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt(); //row
		int M = sc.nextInt(); //column
		int mat[][] = new int[N][M];
		for(int i=0;i<N;i++)
		{
			for(int j=0;j<M;j++)
			{
				mat[i][j] = sc.nextInt();
			}
			sc.nextLine();
		}
		matrixsum(N,M,mat);
	}
}