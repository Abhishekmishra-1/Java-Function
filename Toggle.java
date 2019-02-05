import java.util.Scanner;
class Toggle {
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		System.out.println("Enter a character: ");
		char ch = in.next().charAt(0);
		if(ch>='a' && ch<='z')
		{
			int offset = ch-'a';
			ch = (char)('A'+offset);
		}
		else if(ch>='A' && ch<='Z')
		{
			int offset = ch-'A';
			ch = (char)('a'+offset);
		}
		System.out.println("After toggling: "+ch);
	}
}
