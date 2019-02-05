import java.util.Scanner;
class StringMatching {
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		System.out.println("Enter a string: ");
		String str = in.nextLine();
		String str1 = "DHONI";
		if(str.equals(str1)==true) {
			System.out.println("Matching");
		}
		else {
			System.out.println("Not Matching");
		}
	}
}
