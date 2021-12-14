/*
Given an array, rotate the array to the right by k steps, where k is non-negative

Example 1:

Input: nums = [1,2,3,4,5,6,7], k = 3
Output: [5,6,7,1,2,3,4]
Explanation: 
rotate 1 steps to the right: [7,1,2,3,4,5,6]
rotate 2 steps to the right: [6,7,1,2,3,4,5]
rotate 3 steps to the right: [5,6,7,1,2,3,4]

Example 2: 

Input: nums = [-1,-100, 3, 99], k = 2
Output: [3,99,-1,-100]
Explanation: 
rotate 1 steps to the right: [99,-1,-100,3]
rotate 2 steps to the right: [3,99,-1,-100]

Constraints:
1 <= nums.length <= 10^3
-2^31 <= nums[i] <= 2^31 - 1
0 <= k <= 10^5

*/

/*Borrowing from: https://www.geeksforgeeks.org/array-rotation/*/

//Using an extra array)
//We use an extra array in which we place every element of the array at its correct position 
//i.e. the number at index ii in the original array is placed at the index (i + k) { length of array}(i+k)% length of array. 
//Then, we copy the new array to the original one
class Solution {
  public void rotate(int[] nums, int k) {
    int[] a = new int[nums.length];
    for (int i = 0; i < nums.length; i++) {
      a[(i + k) % nums.length] = nums[i];
    }
    for (int i = 0; i < nums.length; i++) {
      nums[i] = a[i];
    }
  }
}