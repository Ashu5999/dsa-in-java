import java.util.*;

public class inputOutput {
    public static void main(String args[]){
    int marks[] = new int[100];

    Scanner sc = new Scanner(System.in);
    // taking input in array
    marks[0] = sc.nextInt();
    marks[1] = sc.nextInt();
    marks[2] = sc.nextInt();
 // printing output
   System.out.println("phy = "+ marks[0] );
   System.out.println("che = "+ marks[1] );
   System.out.println("maths = "+ marks[2])  ; 


   // to update
   marks[2]= marks[2] + 1;
   System.out.println("updated maths marks = "+ marks[2]);

   // to finding percentage
   int percentage =  (marks[0]+ marks[1]+ marks[2])/3;
   System.out.println("percentage  = " + percentage +"%");
}
}