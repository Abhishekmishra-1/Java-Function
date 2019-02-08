import java.util.Scanner;
class DuplicateElement {
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		System.out.println("Enter size: ");
		int size = in.nextInt();
		int arr[] = new int[size];
		System.out.println("Enter elements in an array: ");
		for(int i=0;i<size;i++)
		{
			arr[i]=in.nextInt();
		}
		int isDuplicate=0;
		int isFirstRepetition=0;
		System.out.println("The duplicate elements are: ");
		for(int i=0;i<size;i++)
		{
			for(int j=0;j<size;j++)
			{
				if((arr[i]==arr[j])&&(i!=j))
				{
					isDuplicate=1;
					if(i<j) {
						isFirstRepetition=1;
					}
					break;
				}
			}
			if((isDuplicate==1)&&(isFirstRepetition==1))
			{
				System.out.println(arr[i]);
				isDuplicate=0;
				isFirstRepetition=0;
			}
		}
	}
}
