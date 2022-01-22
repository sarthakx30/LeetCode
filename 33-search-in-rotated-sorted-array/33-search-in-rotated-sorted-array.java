class Solution {
    public int search(int[] nums, int target) {
        int low=0;
        int high=nums.length-1;
        while(low<=high){
            int mid=(low+high)/2;
            if(nums[mid]==target){
                return mid;
            }
            //Checks If Left Part Is Sorted
            if(nums[low]<=nums[mid]){
                //If target even exists in the left Part
                if(target>=nums[low] && target<nums[mid]){
                    high=mid-1;
                }
                //Exists In Right Part
                else{
                    low=mid+1;
                }
            }
            //If Right Part is Sorted
            else{
                //Checks is Target Exists In Right Part
                if(target>nums[mid] && target<=nums[high]){
                    low=mid+1;
                }
                //Exists In Left Part
                else{
                    high=mid-1;
                }
            }
        }
        return -1;
    }
}