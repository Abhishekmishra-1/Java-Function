import java.util.Scanner;
class GCD2 {
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		System.out.println("Enter first number");
		int n1 = in.nextInt();
		System.out.println("Enter second number");
		int n2 = in.nextInt();
		System.out.println("GCD of two number is:"+GCDOfTwoNumber(n1,n2));
	}
	public static int GCDOfTwoNumber(int n1,int n2)
	{
		int min,gcd=0;
		if(n1<n2) {
			min = n1;
		}
		else {
			min=n2;
		}
		while(min>=1)
		{
			if(n1%min==0 && n2%min==0)
			{
				gcd = min;
				break;
			}
			min--;
		}
		return gcd;
	}
}
