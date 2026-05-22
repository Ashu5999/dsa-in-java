package practiceWork;
import java.util.*;
public class removeDuplicate {
    public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    String s = sc.nextLine();
     HashSet<Character> set = new HashSet<>();
       StringBuilder sb = new StringBuilder();
        for(int i = 0; i<s.length();i++){
            char ch = s.charAt(i);
            if(!set.contains(ch)){
               set.add(ch);
               sb.append(ch);
            }
        }
        System.out.println(sb.toString());
    }

/* this above method alswaya gives a unique char in string in a alphabet order 
    its logic is 
1. Traverse the string character by character using charAt().
2. Use HashSet<Character> to track already visited characters.
3. If character is not present in set:
   - add it into HashSet
   - append it into StringBuilder
4. If character already exists:
   - skip it
5. Convert StringBuilder into string using toString().
 */


// now a second approach but 
}

