
public class linearSearch{
    public static int linear(int num[], int key){
         for(int i=0;i<num.length; i++){
            if (num[i]==16){
                return i;
            }
    }
     return -1; // no key in array
    }
public static void main(String agrs[]){
    
    int num[] = { 2,4,6,8,10,12,14,16,18,20};
    int key =16;

    int index = linear(num,key);
    if(index == -1){
        System.out.println("no key found");
    }
    else{
        System.out.println("key at index = " + index );
    }

  
   
}

    
}

    

