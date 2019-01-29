import java.util.Scanner;
class Segregate {
	public static void Segregate(int size,int arr[])
	{
		int count=0;
		for(int i=0;i<size;i++)
		{
			if(arr[i]==0) {
				count++;
			}
		}
		for(int i=0;i<size;i++)
		{
			if(i<count)
				arr[i]=0;
			else
				arr[i]=1;
		}
	}
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		System.out.println("Enter size");
		int size=in.nextInt();
		int arr[]=new int[size];
		System.out.println("Enter elements in an array");
		for(int i=0;i<size;i++)
		{
			arr[i]=in.nextInt();
		}
		Segregate(size,arr);
		System.out.println("Elements after Segregating the elements is ");
		for(int i=0;i<size;i++)
		{
			System.out.println(arr[i]+" ");
		}
	}
}
