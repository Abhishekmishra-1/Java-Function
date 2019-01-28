import java.util.Scanner;
class Strong{
	public static void main (String[] args){
	    Scanner in = new Scanner(System.in);
		System.out.println("Enter a number:");
	    int num = in.nextInt();
	    int q = num;
	    int sum = 0;
	    while(num > 0){
	        int rem = num % 10;
	        int fact = 1;
	        for(int i=1;i<=rem;i++)
	        {
	            fact = fact * i;
	        }
	        sum = sum + fact;
	        num = num / 10;
	    }
	    if(q == sum)
	    {
	        System.out.println("Yes");
	    }
	    else{
	        System.out.println("No");
	    }
	}
}