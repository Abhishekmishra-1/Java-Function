import java.util.Scanner;
class URLEncoding {
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		System.out.println("Enter a string: ");
		String str = in.nextLine();
		StringBuffer sb = new StringBuffer(str);
		StringBuffer temp = new StringBuffer(" ");
		int length = sb.length();
		for(int i=0;i<length;i++)
		{
			if(sb.charAt(i)!= ' ')
			{
				char ch = sb.charAt(i);
				temp.append(ch);
			}
			else {
				temp.append('%');
			    temp.append('2');
				temp.append('0');
			}
		}
		System.out.println("After encoding the string "+temp);
	}
}
