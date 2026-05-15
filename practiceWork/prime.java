package practiceWork;

import java.util.Scanner;

// most optimal approach to find prime number.  // can we donr by using count and boolean but  i am using here count 
public class prime {
    public static void main (String args[]){
     Scanner sc = new Scanner (System.in);
     int n = sc.nextInt();

     if(n<=1){
        System.out.println("it is not a prime number");
     }

     int count = 0;
     for(int i = 2 ; i*i<n ; i++){  // we can also do i<=Math.sqrt(n) but here i*i is less than n then only it will run and it is more optimal than sqrt function
        if(n%i==0){
            count++;
            break;
        }
     }
        if(count == 0){
            System.out.println("it is a prime number");
        }
        else{
            System.out.println("it is not a prime number");
        }
     

    }
}
