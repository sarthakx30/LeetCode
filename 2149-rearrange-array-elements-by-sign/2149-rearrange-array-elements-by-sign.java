class Solution {
    public int[] rearrangeArray(int[] nums) {
        int ans[]=new int[nums.length];
        int lastPositiveIndex=0;
        int lastNegativeIndex=1;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>0){
                ans[lastPositiveIndex]=nums[i];
                lastPositiveIndex+=2;
            }
            else{
                ans[lastNegativeIndex]=nums[i];
                lastNegativeIndex+=2;
            }
        }
        return ans;
    }
}