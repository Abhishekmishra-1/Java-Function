import java.util.Scanner;
class ArrayPalindrome {
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		System.out.println("Enter size: ");
		int size = in.nextInt();
		int arr[] = new int [size];
		System.out.println("Enter elements in an array: ");
		for(int i=0;i<size;i++)
		{
			arr[i]=in.nextInt();
		}
		int left=0;
		int right=size-1;
		boolean isPalindrome=true;
		while(left<=right)
		{
			if(arr[left]!=arr[right])
			{
				isPalindrome=false;
				break;
			}
			left++;
			right--;
		}
		if(isPalindrome==true)
		{
			System.out.println("Yes");
		}
		else {
			System.out.println("No");
		}
	}
}
