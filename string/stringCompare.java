

public class stringCompare {
    public static void main(String args[]){
        String s1 = "ashu";
        String s2 = "ashu";
        String s3 = new String("ashu");

        if(s1==s2){
            System.out.println("String are equals");
        }
        else{
            System.out.println("String are not equals");
        }

        if (s1.equals(s3)){
            System.out.println("String are equals");
        }
        else{
            System.out.println("String are not equals");
        }

    }
    // on notes full explatation
}

