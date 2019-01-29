import java.util.Scanner;
class PartitionOfNegativeAndPositiveNumber {
	public static void Partition(int size,int arr[])
	{
		int neg[]=new int[size];
		int negSize=0;
		int pos[]=new int[size];
		int posSize=0;
		for(int i=0;i<size;i++)
		{
			if(arr[i]>0) {
				pos[posSize]=arr[i];
				posSize++;
			}
			else {
				neg[negSize]=arr[i];
				negSize++;
			}
		}
		int index=0;
		for(int i=0;i<negSize;i++)
		{
			arr[index]=neg[i];
			index++;
		}
		for(int i=0;i<posSize;i++)
		{
			arr[index]=pos[i];
			index++;
		}
	}
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
	    System.out.println("Enter size:");
	    int size=in.nextInt();
	    int arr[]=new int[size];
	    System.out.println("Enter elements in an array: ");
	    for(int i=0;i<size;i++)
	    {
		   arr[i]=in.nextInt();
	    }
		Partition(size,arr);
		System.out.println("The elements after partition is: ");
		for(int i=0;i<size;i++)
		{
			System.out.println(arr[i]+" ");
		}
	}
}
