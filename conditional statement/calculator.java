import java.util.*;
public class calculator {
  public static void main(String args[]){
    Scanner sc = new Scanner (System.in);
     System.out.print("enter a value of a = ");
    int a = sc.nextInt();
    System.out.print("enter a  value of b = ");
    int b = sc.nextInt();
    System.out.print("enter a operator");
    char operator = sc.next().charAt(0);

switch (operator){
    case '+': System.out.println("add a + b = " + (a+b));
             break;
    case '-' : System.out.println("subtract a - b = " + (a-b));
             break;
    case '*': System.out.println("multiply a * b = " + (a*b));
             break;
    case '/': System.out.println("divide a / b = " + (a/b));
             break;
    case '%': System.out.println("madulo a % b = " + (a%b));
             break;
    default : System.out.println( "enter a valid operator ");         
}

}

}
