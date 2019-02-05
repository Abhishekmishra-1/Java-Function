import java.util.Scanner;
class EncryptTheCharacter {
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		System.out.println("Enter a character: ");
		char ch = in.next().charAt(0);
		System.out.println("Enter the key value: ");
		int key = in.nextInt();
		if(ch>='a' && ch<='z')
		{
			int offset = ch-'a';
			offset = (offset+key)%26;
			ch = (char)(offset+'a');
		}
		else if(ch>='A' && ch<='Z')
		{
			int offset = ch-'A';
			offset = (offset+key)%26;
			ch = (char)(offset+'A');
		}
	 System.out.println("After Encrypt the character "+ch);
	}
}
