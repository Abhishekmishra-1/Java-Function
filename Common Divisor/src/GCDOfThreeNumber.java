import java.util.Scanner;
public class GCDOfThreeNumber {
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		System.out.println("Enter three numbers: ");
		int n1 = in.nextInt();
		int n2 = in.nextInt();
		int n3 = in.nextInt();
		int result = GCD(n1,n2);
		int answer = GCD(result,n3);
		System.out.println("GCD of three numbers is: "+answer);
	}
	public static int GCD(int num1,int num2)
	{
		int min = 0;
		if(num1>num2) {
			min = num2;
		}
		else {
			min = num1;
		}
		while(min>=1)
		{
			if((num1%min==0) && (num2%min==0))
			{
				return min;
			}
			min--;
		}
		return 0;
	}
}
