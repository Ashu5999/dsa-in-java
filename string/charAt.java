
// to print all the letters of a string
public class charAt {
    public static void printletters(String name){
        for(int i=0; i<name.length();i++){
            System.out.print(name.charAt(i) + " ");
        }
    }
    
    public static void main(String args[]){
        String name ="ashu";
        printletters(name);
    }
}
