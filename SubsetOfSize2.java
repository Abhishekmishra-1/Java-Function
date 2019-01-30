import java.util.Scanner;
class SubsetOfSize2 {
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		System.out.println("Enter size: ");
		int size=in.nextInt();
		int arr[]=new int[size];
		System.out.println("Enter elements in an array ");
		for(int i=0;i<size;i++)
		{
			arr[i]=in.nextInt();
		}
		System.out.println("After making subset in array: ");
		Subset(size,arr);
	}
	public static void Subset(int size,int arr[])
	{
		for(int i=0;i<size;i++) {
			for(int j=i+1;j<size;j++)
			{
				System.out.print("("+arr[i]+","+arr[j]+")"+" ");
			}
			System.out.println("\n");
		}
	}
}
