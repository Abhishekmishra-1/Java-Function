import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int n = in.nextInt();
		System.out.println("Divided by 2, 3 and 5 : ");
		for(int i=1;i<=n;i++)
		{
			if(i % 2 == 0 && i % 3 == 0 && i % 5 == 0)
			{
				System.out.println(i+" ");
			}
		}

	}

}
