simport java.util.*;
public class ArrayProblems
{

	public static void minimum(int[] min)
	{
		int minimum = min[0];
		for(int i=1;i<min.length;i++)
		{
			int k = min[i];
			if(minimum > k)
			{
				minimum = k;
			}
		}
		System.out.println("Minimum Element in Array : "+minimum);
	}
	
	public static void maximum(int[] max)
	{
		int maximum = max[0];
		for(int i=0;i<max.length;i++)
		{
			int k = max[i];
			if(maximum < k)
			{
				maximum = k;
			}
		}
		System.out.println("Maximum Element in Array : "+maximum);
	}
		
	public static void searchunsorted(int[] unsorted)
	{
		Scanner s = new Scanner(System.in);
		System.out.print("Element to search : ");
		int element = s.nextInt();
		for(int i=0;i<unsorted.length;i++)
		{
			if(element == unsorted[i])
			{
				System.out.println("Element '"+element+"' is at index : "+i);
				break;
			}
		}
	}
	
	
	public static void reverse(int[] rev)
	{
		for(int i=0,j=(rev.length-1);i<j;i++,j--)
		{
			int t1 = rev[i];
			rev[i]=rev[j];
			rev[j]=t1;
		}
		System.out.println("Reversed Array : "+Arrays.toString(rev));	
	}
	
	public static void searchsorted(int[] sorted)
	{
		Scanner s = new Scanner(System.in);
		System.out.print("Element to search : ");
		int element = s.nextInt();
		int len = sorted.length;
		int l=0,h=len-1;
		while(l<=h)
		{
			int mid = ((l+h)/2);
			if(sorted[mid] == element)
			{
				System.out.println("Element '"+element+"' is at index : "+mid);
				break;
			}
			else if(element > mid)
			{
				l = mid+1;
			}
			else if(element < mid)
			{
				h = mid-1;
			}
		}
	}
	
	public static void deleteindex(int[] delindex)
	{
		Scanner s = new Scanner(System.in);
		System.out.print("Element to delete at Index : ");
		int element = s.nextInt();
		int len = delindex.length;
		for(int i=element;i<len-1;i++)
		{
			delindex[i]=delindex[i+1];
		}
		len--;
		System.out.print("After element at Index '"+element+"' deleted : [ ");
		for(int i=0;i<len;i++)
		{
			System.out.print(" "+delindex[i]+" ");
		}
		System.out.print("]");
		System.out.println();
	}
	
	public static void deleteelement(int[] delelement)
	{
		Scanner s = new Scanner(System.in);
		System.out.print("Element to delete : ");
		int element = s.nextInt();
		int len = delelement.length;
		int index=0;
		for(int i=0;i<len;i++)
		{
			if(element == delelement[i])
			{
				index = i;
				break;
			}
		}
		for(int i=index;i<len-1;i++)
		{
			delelement[i]=delelement[i+1];
		}
		len--;
		System.out.print("After element '"+element+"' deleted : [ ");
		for(int i=0;i<len;i++)
		{
			System.out.print(" "+delelement[i]+" ");
		}
		System.out.print("]");
		System.out.println();
	}
	
	public static void updateelement(int[] update)
	{
		Scanner s = new Scanner(System.in);
		System.out.print("Element to update at index : ");
		int element = s.nextInt();
		int index = s.nextInt();
		for(int i=0;i<update.length;i++)
		{
			if(index == i)
			{
				update[i] = element;
			}
		}
		System.out.println("Updated Array : "+Arrays.toString(update));	
	}
	
	public static void insertelement(int[] insert)
	{
		Scanner s = new Scanner(System.in);
		System.out.print("Element to insert at index : ");
		int element = s.nextInt();
		int index = s.nextInt();
		int len=insert.length;
		int j=0;
		int n = (insert.length)+1;
		int newarr[] = new int[n];
		for(int i=0;i<n;i++)
		{
			if(i == index)
			{
				newarr[i]=element;
			}
			else
			{
				newarr[i]=insert[j];
				j++;				
			}
			
		}
		newarr[index]=element;
		System.out.print("After element '"+element+"' inserted : [ ");
		for(int i=0;i<n;i++)
		{
			System.out.print(" "+newarr[i]+" ");
		}
		System.out.print("]");
		System.out.println();
	}
	
	public static void leftrotate(int[] lrotate)
	{
		Scanner s = new Scanner(System.in);
		System.out.print("No of times to be roated : ");
		int no = s.nextInt();
		int n = lrotate.length;
		for(int i=0;i<no;i++)//rotation-loop
		{
			int first = lrotate[0],j;
			for(j=0;j<n-1;j++)
			{
				lrotate[j]=lrotate[j+1];
			}
			lrotate[j] = first;
		}
		System.out.println("Array after left rotated '"+no+"' times : "+Arrays.toString(lrotate));
	}
	
	public static void rightrotate(int[] rrotate)
	{
		Scanner s = new Scanner(System.in);
		System.out.print("No of times to be roated : ");
		int no = s.nextInt();
		int n = rrotate.length;
		for(int i=0;i<no;i++)
		{
			int j,last=rrotate[(n-1)];
			for(j=(n-1);j>0;j--)
			{
				rrotate[j]=rrotate[j-1];
			}
			rrotate[0]=last;
		}
		System.out.println("Array after right rotated '"+no+"' times : "+Arrays.toString(rrotate));
	}
	
	public static void occurence(int[] array)
	{
		int  n =array.length;
		int freq[] = new int[n];
		int visited = -1;
		for(int i=0;i<n;i++)
		{
			int count = 1;
			for(int j=i+1;j<n;j++)
			{
				if(array[i]==array[j])
				{
					count++;
					freq[j] = visited;
				}
			}
			if(freq[i] != visited)
				freq[i]=count;	
		}
		System.out.println(" Element | Frequency");  
		for(int i=0;i<freq.length;i++)
		{
			if(freq[i] != visited)
				System.out.println("    " + array[i]+"    |    "+ freq[i]); 
		}			
	}
	
	public static void ascsorting(int[] sort)
	{
		int n = sort.length;
		int temp=0;
		for(int i=0;i<n-1;i++)
		{
			for(int j=i+1;j<n;j++)
			{
				if(sort[i]>sort[j])
				{
					temp=sort[i];
					sort[i]=sort[j];
					sort[j]=temp;
				}
			}
		}
		System.out.println("Array after Sorted Ascending : "+Arrays.toString(sort));
	}
	
	public static void dessorting(int[] sort)
	{
		int n = sort.length;
		int temp=0;
		for(int i=0;i<n-1;i++)
		{
			for(int j=i+1;j<n;j++)
			{
				if(sort[i]<sort[j])
				{
					temp=sort[i];
					sort[i]=sort[j];
					sort[j]=temp;
				}
			}
		}
		System.out.println("Array after Sorted Descending : "+Arrays.toString(sort));
	}
	public static void main(String [] args)
	{
		System.out.println("Enter Elements for Operation");
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();//size
		int arr[] = new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i] = s.nextInt();
		}
		System.out.println("---------------------------------------");
		System.out.println("1.Minimum Element in Array");
		System.out.println("2.Maximum Element in Array");
		System.out.println("3.Search Element in Unsorted Array");
		System.out.println("4.Search Element in Sorted Array");
		System.out.println("5.Reverse Array");
		System.out.println("6.Delete Element at index in Array");
		System.out.println("7.Delete Element in Array");
		System.out.println("8.Update Element in Array");
		System.out.println("9.Insert Element in Array");
		System.out.println("10.LeftRotate Array");
		System.out.println("11.RightRotate Array");
		System.out.println("12.Frequency of Elements in Array");
		System.out.println("13.Sort Array in Ascending Order");
		System.out.println("14.Sort Array in Descending Order");
		System.out.println("---------------------------------------");
		System.out.println();
		int i = s.nextInt();
		if(i==1) minimum(arr);
		if(i==2) maximum(arr);	
		if(i==3) searchunsorted(arr);
		if(i==4) searchsorted(arr);
		if(i==5) reverse(arr);
		if(i==6) deleteindex(arr);
		if(i==7) deleteelement(arr);
		if(i==8) updateelement(arr);
		if(i==9) insertelement(arr);
		if(i==10)leftrotate(arr);
		if(i==11) rightrotate(arr);
		if(i==12) occurence(arr);	
		if(i==13) ascsorting(arr);
		if(i==14) dessorting(arr); 
		if(i>14)System.out.println("Invalid Choice");	
	}
	
}