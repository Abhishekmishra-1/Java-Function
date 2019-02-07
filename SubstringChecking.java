import java.util.Scanner;
class SubstringChecking {
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		System.out.println("Enter first string: ");
		String str1 = in.nextLine();
		System.out.println("Enter second string: ");
		String str2 = in.nextLine();
		int length1 = str1.length();
		int length2 = str2.length();
		int matchingIndex = -1;
		for(int i=0;i<(length1-length2+1);i++)
		{
			boolean isMatching = true;
			for(int j=0;j<length2;j++)
			{
				if(str1.charAt(i+j)!=str2.charAt(j))
				{
					isMatching=false;
				}
			}
			if(isMatching==true) {
				matchingIndex = i;
				break;
			}
		}
		System.out.println("Matching index of second string in first string is: "+matchingIndex);
	}
}
