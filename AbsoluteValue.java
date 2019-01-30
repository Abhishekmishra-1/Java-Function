import java.util.Scanner;
class AbsoluteValue {
	public static int abs(int x)
   {
    return (x + (x >> 31)) ^ (x >> 31);
   }
   public static void main(String[] args)
   {
	   Scanner in = new Scanner(System.in);
	   System.out.println("Enter a number:");
	   int n = in.nextInt();
	   int result = abs(n);
	   System.out.println("The absolute value of given number is "+ result);
   }
}
