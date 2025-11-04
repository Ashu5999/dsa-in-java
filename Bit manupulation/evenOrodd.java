

public class evenOrodd {
public static void oddOreven(int n){
    int bitMask = 1;
    if ((n & bitMask) == 0){
        System.out.println("even number");
    }
    else{
        System.out.println("odd number");
    }
}
public static void main(String args[]){
    oddOreven(12);
     oddOreven(1);
      oddOreven(4);  // You (the programmer) see 3 in decimal, but the computer stores it in binary form:
       oddOreven(3);
    
}
    
}
