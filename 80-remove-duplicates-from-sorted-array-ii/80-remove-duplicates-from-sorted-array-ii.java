class Solution {
    public int removeDuplicates(int[] nums) {
        if (nums.length <= 2) return nums.length;
        int ind=1;
        int i=1;
        int count=1;
        while(i<nums.length){
            if(nums[i]==nums[i-1]){
                if(count<2){
                    count++;
                    nums[ind]=nums[i];
                    ind++;
                }
            }
            else{
                count=1;
                nums[ind]=nums[i];
                ind++;
            }
            i++;
        }
        return ind;
    }
}