import java.util.Scanner;
class ArraySort {
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		System.out.println("Enter size: ");
		int size = in.nextInt();
		int arr[] = new int[size];
		System.out.println("Enter elements in an array: ");
		for(int i=0;i<size;i++)
		{
			arr[i]=in.nextInt();
		}
		SelectionSort(size,arr);
		System.out.println("The sorted elements are: ");
		for(int i=0;i<size;i++)
		{
			System.out.println(arr[i]);
		}
	}
	public static void SelectionSort(int size,int arr[])
	{
		for(int i=0;i<size-1;i++)
		{
			int iMin = i;
			for(int j=i+1;j<size;j++)
			{
				if(arr[j]<arr[iMin])
					iMin=j;
			}
			int temp=arr[i];
			arr[i]=arr[iMin];
			arr[iMin]=temp;
		}
	}
}
