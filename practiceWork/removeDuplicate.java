package practiceWork;
import java.util.*;
public class removeDuplicate {
    public static void main(String args[]){
    // Scanner sc = new Scanner(System.in);
    // String s = sc.nextLine();
    //  HashSet<Character> set = new HashSet<>();
    //    StringBuilder sb = new StringBuilder();
    //     for(int i = 0; i<s.length();i++){
    //         char ch = s.charAt(i);
    //         if(!set.contains(ch)){
    //            set.add(ch);
    //            sb.append(ch);
    //         }
    //     }
    //     System.out.println(sb.toString());
    // }

/* this above method alswaya gives a unique char in string in a without changing the order of char in the string.
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


// now a second approach but this will also give in a alphabet order 

 Scanner sc = new Scanner(System.in);
String s = sc.nextLine();
char arr[] = s.toCharArray();
Arrays.sort(arr);
int i = 0;
int j = 1;
while(j<arr.length){
    if(arr[i] == arr[j]){
        j++;
    }
    else{
        i = i+1;
        arr[i] = arr[j];
        j++;
    }
 }
 for(int k = 0 ; k<=i ; k++){
    System.out.print(arr[k]);
}
}
}
Remove Duplicate Characters Using Sorting + Two Pointers

/*Logic:
1. Convert string into char array.
2. Sort the array so duplicate characters become adjacent.
3. Take two pointers:
   i → stores position of unique characters
   j → traverses array
4. If arr[i] == arr[j]:
   - duplicate found
   - move j forward
5. Else:
   - move i forward
   - store new unique character at arr[i]
6. Print array from index 0 to i. */


