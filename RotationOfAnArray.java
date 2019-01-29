import java.util.Scanner;
class RotationOfAnArray {
	public static void rotation(int size,int arr[],int noOfRotations)
	{
		for(int rotation=1;rotation<=noOfRotations;rotation++)
		{
			int temp=arr[0];
			for(int i=1;i<size;i++)
			{
				arr[i-1]=arr[i];
			}
			arr[size-1]=temp;
		}
	}
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		System.out.println("Enter size of array:");
		int size=in.nextInt();
		int arr[]=new int[size];
		System.out.println("Enter elements in an array:");
		for(int i=0;i<size;i++)
		{
			arr[i]=in.nextInt();
		}
		System.out.println("Enter no of Rotations you want to do ");
		int noOfRotations=in.nextInt();
		rotation(size,arr,noOfRotations);
		System.out.println("The elements after rotations is");
		for(int i=0;i<size;i++) {
			System.out.println(arr[i]+" ");
		}
	}
}
