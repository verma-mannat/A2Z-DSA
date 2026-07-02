class Solution {
    public void moveZeroes(int[] nums) {
        int n=nums.length;
        int[] nums2 = new int[n];
        int start=0;
        int last=n-1;
        for(int i=0;i<n;i++){
            if(nums[i]==0){
                nums2[last--]=nums[i];
            }
            else{
                nums2[start++]=nums[i];
            }
        }
        for(int i=0;i<n;i++){
            nums[i]=nums2[i];
        }
    }
}