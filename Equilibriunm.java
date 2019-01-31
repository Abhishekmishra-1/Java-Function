import java.util.Scanner;
class Equilibriunm {
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		System.out.println("Enter size of an array: ");
		int size=in.nextInt();
		int arr[]=new int[size];
		System.out.println("Enter elements in an array: ");
		for(int i=0;i<size;i++)
		{
			arr[i]=in.nextInt();
		}
		int result = equilibriumElement(size,arr);
		System.out.println("The equilibrium point is: "+result);
	}
	public static int equilibriumElement(int size,int arr[])
	{
		for(int i=0;i<size;i++)
		{
			int leftSum=0;
			for(int l=0;l<i;l++)
			{
				leftSum=leftSum+arr[l];
			}
			int rightSum=0;
			for(int r=i+1;r<size;r++)
			{
				rightSum=rightSum+arr[r];
			}
			if(leftSum==rightSum) {
				return arr[i];
			}
		}
		return -1;
	}
}
