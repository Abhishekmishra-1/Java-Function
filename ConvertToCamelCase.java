import java.util.Scanner;
class ConvertToCamelCase
{
   public static void main(String args[])
   {
       Scanner scan = new Scanner(System.in);
       System.out.println("Enter a string: ");
       String str = scan.nextLine();
       StringBuilder sb = new StringBuilder(str);
       StringBuilder result = new StringBuilder("");
       int sb_len = sb.length();
       for(int index = 0; index <= sb_len - 1; index++)
       {
           if(sb.charAt(index) != ' ')
           {
               result.append(sb.charAt(index));
           }
        else if(sb.charAt(index) == ' ')
        {
               char ch = sb.charAt(index + 1);
               ch = (char)(ch - 32);
               result.append(ch);
               index++;
           }
       }
       System.out.print(result);
   }
}
