import java.util.Scanner;
class MoveZerosToTheEnd {
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		System.out.println("Enter size: ");
		int size=in.nextInt();
		int arr[] = new int[size];
		System.out.println("Enter elements in an array: ");
		for(int i=0;i<size;i++)
		{
			arr[i]=in.nextInt();
		}
		ZerosAtTheEnd(size,arr);
		System.out.println("Array after move of zeros to the end is ");
		for(int i=0;i<size;i++)
		{
			System.out.println(arr[i]+" ");
		}
	}
	public static void ZerosAtTheEnd(int size,int arr[])
	{
		int count=0;
		for(int i=0;i<size;i++)
		{
			if(arr[i]!=0)
			{
				int temp=arr[i];
				arr[i]=arr[count];
				arr[count]=temp;
				count++;
			}
		}
	}
}
