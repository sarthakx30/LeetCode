class Solution {
    public int removeDuplicates(int[] nums) {
        int index=0;
        for(int i=0;i<nums.length;i++){
            if(index<1 || nums[i]>nums[index-1]){
                nums[index++]=nums[i];
            }
        }
        return index;
    }
}