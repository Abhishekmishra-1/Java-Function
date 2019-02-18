import java.util.Scanner;
class NonContiguously
{
   public static void main (String[] args) 
   {
       Scanner in = new Scanner(System.in);
       System.out.println("Enter a sentence: ");
       String sentence = in.nextLine();
       System.out.println("Enter a word: ");
       String word = in.nextLine();
       int sentence_len = sentence.length();
       int word_len = word.length();
       boolean is_word_found = true;
       int index2 = 0;
       for(int index1 = 0; index1 < word_len; index1++)
       {
           boolean is_curr_char_found = false;
           while(index2 < sentence_len)
           {
               if(sentence.charAt(index2) == word.charAt(index1))
               {
                   is_curr_char_found = true;
                   index2++;
                   break;
               }
               index2++;
           }
           if(is_curr_char_found == false)
           {
               is_word_found = false;
               break;
           }
       }
       if(is_word_found == true)
       {
           System.out.print("Found");
       }
       else
       {
           System.out.print("Not Found");
       }
   }
}
