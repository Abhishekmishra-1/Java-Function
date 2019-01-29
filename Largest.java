import java.util.Scanner;
class Largest {
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		System.out.println("Enter size of array:");
		int size=in.nextInt();
		System.out.println("Enter the elements of array:");
		int arr[] = new int[size];
		for(int i=0;i<size;i++)
		{
			arr[i]=in.nextInt();
		}
		int max;
		if(arr[0]>arr[1])
		{
			max=arr[0];
		}
		else {
			max=arr[1];
		}
		for(int i=2;i<size;i++)
		{
			if(arr[i]>max)
			{
				max=arr[i];
			}
		}
		System.out.println("The largest elements are "+max);
	}
}
