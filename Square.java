import java.util.Scanner;
class Square {
	public static int Square(int n)
	{
		int square = n*n;
		return square;
	}
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		System.out.println("Enter a number:");
		int n = in.nextInt();
		int square1 = Square(n);
		System.out.println("Square of a given number is:"+square1);
	}
}
