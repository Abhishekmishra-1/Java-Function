import java.util.Scanner;
class perfectCouple {
		public static void main(String[] args)
		{
			Scanner in = new Scanner(System.in);
			System.out.println("Enter size: ");
			int size = in.nextInt();
			int arr[]=new int[size];
			System.out.println("Enter elements in an array: ");
			for(int i=0;i<size;i++)
			{
				arr[i]=in.nextInt();
			}
			System.out.println("Enter value: ");
			int value=in.nextInt();
			perfectCouple(size,arr,value);
		}
		public static void perfectCouple(int size,int arr[],int value)
		{
			for(int i=0;i<size;i++)
			{
				for(int j=i+1;j<size;j++)
				{
					int sum=arr[i]+arr[j];
					if(sum==value) {
						System.out.println("The perfect couple is: "+arr[i]+","+arr[j]);
					}
				}
			}
		}
}
