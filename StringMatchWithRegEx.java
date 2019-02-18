import java.util.Scanner; 
class StringMatchWithRegEx
{ 
 public static void main (String[] args)
 {
    Scanner in = new Scanner(System.in);
    String str = in.nextLine();
    String pattern = in.nextLine();
    int str_len = str.length();
    int pattern_len = pattern.length();
    int pattern_idx = 0;
    boolean is_match = true; 
    for(int str_idx = 0; str_idx <= str_len - 1; str_idx++)
    {
        if(pattern_idx == pattern_len)
        {
            is_match = false;
            break;
        }
        char curr_str_char = str.charAt(str_idx);
        if(pattern.charAt(pattern_idx) != '+')
        {
            if(pattern.charAt(pattern_idx) == curr_str_char)
            {
                pattern_idx++;
            }
            else
            {
                is_match = false;
                break;
            }
        }
        else if((pattern.charAt(pattern_idx) == '+') && ((pattern_idx + 1) != pattern_len))
        {
            char prev_pattern_char = pattern.charAt(pattern_idx - 1);
            char next_pattern_char = pattern.charAt(pattern_idx + 1);
            if(curr_str_char == prev_pattern_char)
            {
                
            }
            else if(curr_str_char == next_pattern_char)
            {
                pattern_idx = pattern_idx + 2;
            }
            else if(pattern_idx == pattern_len)
            {
                is_match = false;
                break;
            }
            else{
                is_match = false;
                break;
            }
        }
        else if((pattern.charAt(pattern_idx) == '+') && (pattern_idx + 1) == pattern_len)
        {
            char prev_pattern_char = pattern.charAt(pattern_idx - 1);
            if(curr_str_char == prev_pattern_char)
            {
                
            }
            else{
                is_match = false;
                break;
            }
        }
    }
       while(pattern_idx < pattern_len)
       {
          if(pattern.charAt(pattern_idx) != '+')
          {
            break;
          }
          pattern_idx++;
       
       }
        
   if((is_match == true) && (pattern_idx == pattern_len)){
        System.out.print("Matched");
    }
    else{
        System.out.print("Not Matched");
    }
 }
}
