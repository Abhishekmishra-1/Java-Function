import java.util.Scanner;
class Occurences {
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		System.out.println("Enter size:");
		int size=in.nextInt();
		System.out.println("Enter the elements of array:");
		int arr[] = new int[size];
		for(int i=0;i<size;i++)
		{
			arr[i] = in.nextInt();
		}
		System.out.println("Enter the element you want to search:");
		int searchElement=in.nextInt();
		int count=0;
		for(int i=0;i<size;i++)
		{
			if(searchElement==arr[i])
			{
				count++;
			}
		}
		System.out.println("Total number of elements in an array are "+count);
	}
}
