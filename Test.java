class Permutation {
	void PrintArr(int arr[],int end)
	{
		int i;
		for(i=0;i<=end;i++)
		{
			System.out.print(arr[i]);
		}
		System.out.println("");
	}
	void SwapArr(int arr[],int a,int b)
	{
		int temp;
		temp=arr[a];
		arr[a]=arr[b];
		arr[b]=temp;
	}
	void getPermutation(int arr[],int start,int end)
	{
		if(start==end)
		{
		   PrintArr(arr,end);
		   return;
		}
		else
		{
			int i;
			for(i=start;i<=end;i++)
			{
				SwapArr(arr,i,start);
				getPermutation(arr,start+1,end);
				SwapArr(arr,i,start);
			}
			
		}
	}
}
class Test {

		public static void main(String[] args) {
			
			
			int arrayLength = args.length;
			int array[] = new int [ arrayLength ];
			// create array
			int i;
			
			for(i=0;i<args.length;i++)
			{
				array[i]=Integer.parseInt(args[i]);

			}
			System.out.println("");
			Permutation p=new Permutation();
			
			int end=arrayLength-1;
			p.getPermutation(array, 0, end);
			
		}
}