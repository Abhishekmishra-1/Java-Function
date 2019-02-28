package searching;
import java.util.Scanner;
class Search1
{
  public static void main(String args[])
  {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int list[] = new int[n];
    for(int index = 0;index < n; index++)
    {
      list[index] = sc.nextInt();  
    }
    int key = sc.nextInt();
    int index = searching_element(n, list, key);
    System.out.print(index);
  }
  public static int searching_element(int n, int list[], int val)
  {
    int front = 0; 
	int end = n-1;
    int middle = (front + end) / 2;
    int index = -1;
    while( front <= end )
    {
      if(list[middle] < val)
      {
        front = middle + 1;
      }
      else if(list[middle] == val)
      {
        return middle;
      }
      else 
      {
        end = middle - 1;
      }
      middle = (front + end) / 2;
    }
    return index;
  }
}
