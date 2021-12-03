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

class Solution {
    public void rotate(int[] nums, int k) {
        /* Function to left rotate arr[] of size n by d*/
        void leftRotate(int arr[], int d, int n) {
            for (int i = 0; i < d; i++){
                leftRotatebyOne(arr, n);
            }
        }

        void leftRotatebyOne(int arr[], int n){
            int i, temp;
            temp = arr[0];
            for (i = 0; i < n - 1; i++) {
                arr[i] = arr[i + 1];
                arr[n-1] = temp;
            }
        }

        /* Utility function to print an array */
        void printArray(int arr[], int n) {
            for (int i = 0; i < n; i++){
                System.out.print(arr[i] + " ");
            }
        }
    }
}