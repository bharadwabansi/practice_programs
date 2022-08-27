import java.util.*;
class GetSort
{
		
	void bubble_sort(int arr[])
	{
		int i,j,temp;
		for(i=0;i<arr.length;i++)
		{
			for(j=0;j<arr.length-i-1;j++)
			{	
				if(arr[j]>arr[j+1])
				{
					temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
	}
}

class BubbleSort
{



	
	public static void main(String args[])
	{
		if ( args.length != 6 )
 			System.out.println(
 			"Error: Please re-enter the entire command" );
 		else
 		{
 			int arrayLength = args.length;
			int array[] = new int [ arrayLength ]; 
			// create array
			int i;
		
		for(i=0;i<args.length;i++)
		{
			array[i]=Integer.parseInt(args[i]);
			System.out.print(args[i]+" ");	
		}
		
		GetSort list=new GetSort();

		list.bubble_sort(array);
		System.out.println("");
		System.out.println("After sorting");

		for(i=0;i<array.length;i++)
		{	
			System.out.print(array[i]+" ");
		}
		
	
		}
	}
}