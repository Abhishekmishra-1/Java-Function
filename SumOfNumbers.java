import java.util.Scanner;
class SumOfNumbers {
	public static int Sum(int num)
	{
		int sum=0;
		for(int i=1;i<=num;i++)
		{
			sum = sum + i;
		}
		return sum;
	}
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter a number:");
		int n = in.nextInt();
		System.out.println(Sum(n));
	}
}
