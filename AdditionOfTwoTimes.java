import java.util.Scanner;
class AdditionOfTwoTimes {
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		System.out.println("Enter hour1: ");
		int h1 = in.nextInt();
		System.out.println("Enter minute1: ");
		int m1 = in.nextInt();
		System.out.println("Enter second1: ");
		int s1 = in.nextInt();
		System.out.println("Enter hour2: ");
		int h2 = in.nextInt();
		System.out.println("Enter minute2: ");
		int m2 = in.nextInt();
		System.out.println("Enter second2: ");
		int s2 = in.nextInt();
		int t1 = (h1*3600)+(m1*60)+s1;
		int t2 = (h2*3600)+(m2*60)+s2;
		int tt = t1+t2;
		int h = (tt/3600);
		int m = (tt/60)%60;
		int s = (tt%60);
		System.out.println("Addition of two times is: "+h+" "+m+" "+s);
	}
}
