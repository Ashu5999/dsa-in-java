package practiceWork;
  import java.util.*;
public class Anagram {
    public static void main(String args[]){
        Scanner sc = new Scanner (System.in);
        String s1 = sc.nextLine();
        String s2 = sc.nextLine();

        char arr1[] = s1.toCharArray();
        char arr2[] = s2.toCharArray();

        Arrays.sort(arr1);
        Arrays.sort(arr2);
         if(Arrays.equals(arr1 , arr2)){
            System.out.println("the strings are anagrams");
         }
         else{
            System.out.println("the strings are not anagrams");
         }
        
    }
}


/*  logic ; 1. first of all tahe a input of the two string 
2. then convert them to the array of charchacters
3. then sort by using the sort function of the array class
4. then compare the two arrays by using the equals function of the array classs */