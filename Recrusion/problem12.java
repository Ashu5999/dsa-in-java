public class problem12 {
    public static void  removeDupli(String str , int idx , StringBuilder newStr , boolean map[]){
          // base case
        if(idx == str.length()){
         System.out.println(newStr);
         return ;
        }
        // kaam
        char currchar = str.charAt(idx);
        if(map[currchar - 'a'] == true){
            // duplicate
            removeDupli(str,idx+1,newStr,map);
        }
        else{
            map[ currchar-'a'] = true;
            removeDupli(str,idx+1,newStr.append(currchar), map);
 
        }

    }
    public static void main(String args[]){
        String str = "appnnacollege";
        removeDupli(str,0, new StringBuilder(""),   new boolean[26]);
    }
}
