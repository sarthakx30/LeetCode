class Solution {
    public int singleNumber(int[] nums) {
        int res=0;
        for(int i=0;i<nums.length;i++){
            res^=nums[i];
        }
        return res;
        //O(nlogn) time
        // Arrays.sort(nums);
        // if(nums.length<=1)
        // {
        //     return nums[0];
        // }
        // for(int i=0;i<nums.length;i++)
        // {
        //     if(i>=nums.length-1)
        //     {
        //         return nums[i];
        //     }
        //     if(nums[i]!=nums[i+1])
        //     {
        //         return nums[i];
        //     }
        //     else
        //     {
        //         i++;
        //     }
        // }
        // return 0;
    }
}