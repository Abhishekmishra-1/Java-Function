import java.util.Scanner;
class deleteSpaces {
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		System.out.println("Enter a string: ");
		String str = in.nextLine();
		int length = str.length();
		StringBuilder sb = new StringBuilder(str);
		StringBuilder temp = new StringBuilder(" ");
		for(int i=0;i<length;i++)
		{
			if(str.charAt(i)!=' ')
			{
				temp.append(str.charAt(i));
			}
		}
		sb.setLength(0);
		for(int i=0;i<temp.length();i++)
		{
			sb.append(temp.charAt(i));
		}
		System.out.println("After deleting the spaces of the given string: "+sb);
	}
}
