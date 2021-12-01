// Given a non-empty array of integers, every element appears twice except for one.
// Find that single one

// Note:
// Your algorithm should have a linear runtime complexity. 
// Could you implement it without using extra memory?

// Example 1:
// Input: [2,2,1]
// Output: 1

// Example 2: 
// Input: [4,1,2,1,2]
// Output: 4

// *A Hashset is a collection of items where every item is unique, and it is found in the java.util package*


class Solution {
    public int singleNumber(int[] nums){
        // Put them in a hashset
        // Go through the numbers one by one
        // If we get a number in a hashset, we remove it
        // at the end we should only have one number, which we return it

        HashSet <Integer> set = new HashSet<Integer> ();

        // for every number in the nums 
        // array

        for(int i: nums) {
            // The below code will remove the num if it
            // is in the array, else, it will just add.
            if(set.contains(i)) {
                set.remove(i);                
            } else {
                set.add(i);
            }
        }

        for(int i:set){
            return i;
        }
        return -1;
    }
}