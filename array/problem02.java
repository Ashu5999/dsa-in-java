/* Given an integer array nums, return all the triplets [nums[i], nums[j],   
nums[k]] such that i != j, i != k, and j != k, and nums[i] + nums[j] + nums[k] == 0. 
Notice that the solution set must not contain duplicate triplets  */


public class problem02 {
    
    public static void triplets(int num[]) {
        for(int i = 0; i < num.length; i++) {
            for(int j = i + 1; j < num.length; j++) {
                for(int k = j + 1; k < num.length; k++) {

                    if(num[i] + num[j] + num[k] == 0) {
                        System.out.println(num[i] + " " + num[j] + " " + num[k]);
                        return; // stop after first triplet found
                    }
                }
            }
        }
        System.out.println("No triplet found");
    }

    public static void main(String args[]) {
        int num[] = {-1, 0, 1, 2, -1, -4};
        triplets(num);
    }
}
