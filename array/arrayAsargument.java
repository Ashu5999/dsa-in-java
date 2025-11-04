

public class arrayAsargument {
public static void update(int marks[], int nonchangeable){
    int  nonchangable =10;
    for(int i =0;i<marks.length ; i++){
        marks[i]= marks[i] +1;
    }
}

public static void main(String agrs[]){
    int marks[] = {94,95,96};
    int nonchangable = 5;
    update(marks, nonchangable);
   System.out.println(nonchangable);

    // print marks
    for(int i=0;i<marks.length; i++){
    System.out.println( " marks are = " + marks[i]);
    }
}

    
}
