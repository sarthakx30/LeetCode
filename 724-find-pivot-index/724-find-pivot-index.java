class Solution {
    public int pivotIndex(int[] nums) {
        int leftSum=0;
        int rightSum=0;
        for(int i=0;i<nums.length;i++){
            rightSum+=nums[i];
        }
        int index=-1;
        for(int i=0;i<nums.length;i++){
            leftSum+=nums[i];
            //System.out.println(leftSum+" "+rightSum);
            if(leftSum==rightSum){
                index=i;
                break;
            }
            rightSum-=nums[i];
        }
        return index;
    }
}