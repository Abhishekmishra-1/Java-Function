import java.util.Scanner; 
class SortCharacter
{ 
 public static void main (String[] args)
 {
    Scanner in = new Scanner(System.in);
    System.out.println("Enter a string: ");
    String str = in.nextLine();
    StringBuilder string = new StringBuilder(str);
    int str_len = string.length();
    for (int index = 0; index < str_len; index++)
    {
        if((string.charAt(index) >= 'A') && (string.charAt(index) <= 'Z'))
        {
            char ch =(char)(string.charAt(index) + 32);
            string.setCharAt(index, ch);
        }
    }
    for(int index1 = 0; index1 < str_len; index1++)
    {
        for(int index2 = 0; index2 < index1; index2++)
        {
            if(string.charAt(index2) >= string.charAt(index1))
            {
                char temp = string.charAt(index2);
                string.setCharAt(index2, string.charAt(index1));
                string.setCharAt(index1, temp);
            }
        }
    }
    System.out.println(string);
 }
}
+ 
