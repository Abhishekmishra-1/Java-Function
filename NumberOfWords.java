import java.util.Scanner;
class NumberOfWords {
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		System.out.println("Enter a string: ");
		String str = in.nextLine();
		int length = str.length();
		int count=1;
		for(int i=0;i<(length-1);i++)
		{
			if(str.charAt(i)==' ')
			{
				count++;
			}
		}
		System.out.println(count);
	}
}
