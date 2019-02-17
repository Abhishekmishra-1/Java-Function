import java.util.Scanner;
class FirstRepeatedCharacter
{
   public static void main (String[] args)
   {
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter a string: ");
      String str = sc.nextLine();
      
      int str_len = str.length();
      int repeat_count[] = new int[str_len];
      for(int index = 0; index < str_len; index++)
      {
        repeat_count[index] = -1;
      }
      for(int index1 = 0; index1 < str_len; index1++)
      {
        for(int index2 = index1 + 1; index2 < str_len; index2++)
        {
            if(str.charAt(index1) == str.charAt(index2))
            {
                repeat_count[index1] = index2;
                break;
            }
        }
      }
      int min_idx = 0;
      for(int index = 0; index < str_len; index++)
      {
        if(((repeat_count[min_idx] > repeat_count[index]) && (repeat_count[index] != -1)) || (repeat_count[min_idx] == -1))
        {
            min_idx = index;
        }
      }
      if(repeat_count[min_idx] != -1)
      {
         System.out.print(str.charAt(min_idx));
      }
      else
      {
         System.out.print("No character is repeated");
      }
   }
}
