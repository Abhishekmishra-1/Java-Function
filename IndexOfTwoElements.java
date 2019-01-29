import java.util.Scanner;
class IndexOfTwoElements {
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		System.out.println("Enter size:");
		int size=in.nextInt();
		System.out.println("Enter elements of an array:");
		int arr[] = new int[size];
		for(int i=0;i<size;i++)
		{
			arr[i]=in.nextInt();
		}
		System.out.println("Enter the search element 1:");
		int search1=in.nextInt();
		System.out.println("Enter the search element 2:");
		int search2=in.nextInt();
		int element1=-1;
		int element2=-1;
		for(int i=0;i<size;i++)
		{
			if(search1==arr[i])
			{
				element1=i;
			}
			if(search2==arr[i])
			{
				element2=i;
			}
		}
		System.out.println("The index of first element is "+element1);
		System.out.println("The index of second element is "+element2);
	}
}
