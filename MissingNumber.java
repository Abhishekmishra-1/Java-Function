import java.util.Scanner;
class MissingNumber {
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
		int missingValue=0;
		System.out.println("The missing value is: ");
		for(int value=1;value<=size;value++)
		{
			boolean isFound=false;
			for(int i=0;i<size;i++)
			{
				if(arr[i]==value)
				{
					isFound=true;
					break;
				}
			}
			if(isFound==false) {
				missingValue=value;
				break;
			}
		}
		System.out.println(missingValue);
	}
}
