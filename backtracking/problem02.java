public class problem02 {
    
    public static void  permutation( String str , String ans){
       // base case
        if(str.length() == 0){
            System.out.println(ans);
            return;
        }

        // recrusion
        for(int i = 0; i < str.length() ; i++){
        char curr = str.charAt(i);
        // "abcde" = "ab" + "de" = "abde"
        String newstr =  str.substring(0,i) +  str.substring(i+1);
        permutation(newstr, ans + curr);
        }

    
    }
    public static void main(String args[]){
            String str = "abcd";
            permutation(str, "");
        }
}
