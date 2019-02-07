import java.util.Scanner;
class StringPalindrome {
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		System.out.println("Enter a string: ");
		String str = in.nextLine();
		int length = str.length();
		int end = length-1;
		int front = 0;
		boolean isPalindrome = true;
		while(front<end)
		{
			if(str.charAt(front)!=str.charAt(end))
			{
				isPalindrome=false;
				break;
			}
			front++;
			end--;
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
