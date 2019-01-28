import java.util.Scanner;
class GCD {
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		System.out.println("Enter first number:");
		int n1 = in.nextInt();
		System.out.println("Enter second number:");
		int n2 = in.nextInt();
		System.out.println("Enter third number:");
		int n3 = in.nextInt();
		int result = GCD(n1,n2);
		System.out.println("GCD of the given numbers is "+ GCD(result,n3));
	}
	public static int GCD(int num1,int num2)
	{
		int min=0;
		if(num1>num2) {
			min = num2;
		}
		else {
			min = num1;
		}
		while(min>=1)
		{
			if(num1%min==0 && num2%min==0)
			{
				return min;
			}
			min--;
		}
		return 0;
	}
}
