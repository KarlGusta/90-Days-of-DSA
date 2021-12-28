import java.util.HashMap;
import java.util.Scanner;
import java.util.Map;


class Solution {
    public int[] twoSum(int[] nums, int target) {
        // Starting from index 0, as we increase
        for(int i=0; i<nums.length; i++){
            // we increase j by one index, so that the two can be added
            // and compared
            for(int j= i+1; j<nums.length; j++){
                if(nums[i] + nums[j] == target){
                    return new int[] {i,j};
                }
            }
        }        
        return new int[] {};
    }
}