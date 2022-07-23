class Solution{
    public int pivotIndex(int[] nums){
        int index=-1;
        int leftSum=0;
        int rightSum=0;
        for(int i=0;i<nums.length;i++){
            rightSum+=nums[i];
        }
        for(int i=0;i<nums.length;i++){
            leftSum+=nums[i];
            if(leftSum==rightSum){
                index=i;
                break;
            }
            else{
                rightSum-=nums[i];
            }
        }
        return index;
    }
}