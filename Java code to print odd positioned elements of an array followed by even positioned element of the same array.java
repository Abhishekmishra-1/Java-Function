import java.util.Scanner;
class PrintOddPositioned {
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the size of an array:");
		int size=in.nextInt();
		System.out.println("Enter the elements of an array:");
		int arr[] = new int[size];
		for(int i=0;i<size;i++)
		{
			arr[i]=in.nextInt();
		}
		printElement(arr,size);
	}
	public static void printElement(int arr[],int size)
	{
		System.out.println("The elements in an array are:");
		for(int i=0;i<size;i=i+2) {
			System.out.println(arr[i]);
		}
		for(int i=1;i<size;i=i+2) {
			System.out.println(arr[i]);
		}
	}
}
