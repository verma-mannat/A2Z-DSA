package array.easy;
/*Given an integer array nums, rotate the array to the left by one.
Note: There is no need to return anything, just modify the given array. */
class Solution {
    public void rotateArrayByOne(int[] nums) {
        int n=nums.length;
        int first=nums[0];
        for(int i=0;i<n-1;i++){
            nums[i]=nums[i+1];
        }
        nums[n-1]=first;
    }
}