import java.util.Scanner;
class indexOfSecondLastOccurence {
	public static int secondLastOccurences(int size,int arr[],int search)
	{
		int count=0;
		for(int i=size-1;i>=0;i--)
		{
			if(arr[i]==search) {
				count++;
			}
			if(count==2) {
				return i;
			}
		}
		return -1;
	}
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		System.out.println("Enter size of an array: ");
		int size = in.nextInt();
		int arr[] = new int[size];
		System.out.println("Enter elements in an array: ");
		for(int i=0;i<size;i++)
		{
			arr[i]=in.nextInt();
		}
		System.out.println("Enter elements which you want to see the second last occurences: ");
		int search=in.nextInt();
		int index = secondLastOccurences(size,arr,search);
		System.out.println("The index of second last occurence of given element is "+index);
	}
}
