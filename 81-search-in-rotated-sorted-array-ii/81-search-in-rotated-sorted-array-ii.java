class Solution {
    public boolean search(int[] nums, int target) {
        int low=0;
        int high=nums.length-1;
        while(low<=high){
            int mid=(low+high)/2;
            if(nums[mid]==target){
                return true;
            }
            //Checks If Left Part Is Sorted Or Right Part is UnSorted
            if(nums[low]<nums[mid]  || nums[mid] > nums[high]){
                //If target even exists in the left Part
                if(target>=nums[low] && target<nums[mid]){
                    high=mid-1;
                }
                //Exists In Right Part
                else{
                    low=mid+1;
                }
            }
            //If Right Part is Sorted Or Left Part is UnSorted
            else if(nums[high]>nums[mid] || nums[low]>nums[mid]){
                //Checks is Target Exists In Right Part
                if(target>nums[mid] && target<=nums[high]){
                    low=mid+1;
                }
                //Exists In Left Part
                else{
                    high=mid-1;
                }
            }
            else{
                high--;
            }
        }
        return false;
    }
}