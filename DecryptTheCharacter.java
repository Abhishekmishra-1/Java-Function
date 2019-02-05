import java.util.Scanner;
class DecryptTheCharacter {
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		System.out.println("Enter a character: ");
		char ch = in.next().charAt(0);
		System.out.println("Enter the key value: ");
		int key = in.nextInt();
		if(ch>='a' && ch<='z')
		{
			ch = (char)(ch-key);
			if(ch<key) {
				ch = (char)(ch+26);
			}
		}
		if(ch>='A' && ch<='Z')
		{
			ch = (char)(ch-key);
			if(ch<key) {
				ch = (char)(ch+26);
			}
		}
		System.out.println("After decrypt "+ch);
	}
}
