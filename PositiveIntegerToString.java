import java.util.Scanner;
class PositiveIntegerToString
{
  public static void main(String args[])
  {
    Scanner in = new Scanner(System.in);
    System.out.println("Enter a integer: ");
    int n = in.nextInt();
    int temp = n;
    int count = 0;
    while(n > 0)
    {
        count++;
        n = n/10;
    }
    char str[] = new char[count];
    count = count - 1;
    while(temp > 0)
    {
      char ch = (char)((temp % 10) + '0');
      str[count] = ch;
      temp /= 10;
      --count;   
    }
    System.out.print(str);
  }
}
