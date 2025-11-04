

public class RevGivenNo {
    public static void main(String args[]){
        int rev = 0;
        int n = 10899;
        int lastdigit;

        while (n>0){
        lastdigit = n%10;
        rev= (rev * 10) + lastdigit;
        n = n/10;
        }
        System.out.print(rev);
    }
    
}
