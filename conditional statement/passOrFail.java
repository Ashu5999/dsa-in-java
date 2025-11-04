import java.util.*;
public class passOrFail {
    public static void main(String Args[]){
        Scanner sc = new Scanner(System.in);

        int marks = sc.nextInt();
// using ternary operator intend of if else
        String status= (marks>=33)? "pass" : "fail";
        System.out.println(status) ;
    }
}
