package practiceWork;
import java.util.*;
public class CountWords {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String Words[] = str.split(" ");
        System.out.println("the number of words in the string is " + Words.length);
    }
    
}

// String Important Methods

// 1. str.length()
//    → Returns the number of characters in a string.

//    Example:
//    String str = "Java";
//    str.length() = 4

// ------------------------------------------------

// 2. str.split(" ")
//    → Splits a sentence into words.

//    Example:
//    String str = "I love Java";

//    words[0] = I
//    words[1] = love
//    words[2] = Java

//    words.length = 3

// ------------------------------------------------

// 3. str.split("")
//    → Splits a string into characters.

//    Example:
//    String str = "Java";

//    arr[0] = J
//    arr[1] = a
//    arr[2] = v
//    arr[3] = a

//    arr.length = 4

// ------------------------------------------------

// Remember:

// str.length()  → Count characters
// split(" ")    → Count words
// split("")     → Convert string into characters

// This is short enough for revision and easy to remember before TCS NQT. 👍
