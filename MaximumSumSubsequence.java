import java.util.Scanner;
class MaximumSumSubsequence {
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		System.out.println("Enter size: ");
		int size = in.nextInt();
		System.out.println("Enter elements in an array: ");
		int arr[] = new int[size];
		for(int i=0;i<size;i++)
		{
			arr[i] = in.nextInt();
		}
		int result = SumSubSequence(arr,size);
		System.out.println("The maximum sum subsequence of an array is: "+result);
	}
	public static int SumSubSequence(int arr[],int size)
	{
		int runningSum = arr[0];
		int maxSumSub = arr[0];
		for(int i=1;i<size;i++)
		{
			if(arr[i]>arr[i-1])
			{
				runningSum+=arr[i];
			}
			else {
				runningSum = arr[i];
			}
			if(runningSum>maxSumSub)
			{
				maxSumSub = runningSum;
			}
		}
		return maxSumSub;
	}
}
