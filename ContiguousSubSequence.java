import java.util.Scanner;
class ContiguousSubSequence {
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		System.out.println("Enter size of an array: ");
		int size = in.nextInt();
		System.out.println("Enter elements in an array: ");
		int arr[] = new int[size];
		for(int i=0;i<size;i++)
		{
			arr[i]=in.nextInt();
		}
		int seq[] = new int[2*size];
		int seqIndex=0;
		int startIndex=0;
		for(int i=0;i<size-1;i++)
		{
			if(arr[i]>arr[i+1])
			{
			   seq[seqIndex]=startIndex;
               seqIndex++;
               seq[seqIndex]=i;
               seqIndex++;
               startIndex=i+1;			   
			}
		}
		if(startIndex!=size-1)
		{
			seq[seqIndex]=startIndex;
			seqIndex++;
			seq[seqIndex]=size-1;
			seqIndex++;
		}
		if(startIndex==size-1)
		{
			seq[seqIndex]=startIndex;
			seqIndex++;
			seq[seqIndex]=size-1;
			seqIndex++;
		}
		System.out.println("The increasing contiguous sub sequence is: ");
		for(int i=0;i<=(seqIndex-1);i=i+2)
		{
			startIndex=seq[i];
			int endIndex=seq[i+1];
			for(int j=startIndex;j<=endIndex;j++)
			{
				System.out.print(arr[j]+" ");
			}
			System.out.println();
		}
	}
}
