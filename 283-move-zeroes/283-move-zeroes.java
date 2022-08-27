class Solution {
    public void moveZeroes(int[] nums) {
        if(nums.length==1) return;
        int pos=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=0){
                if(pos!=i){
                    int temp=nums[pos];
                    nums[pos]=nums[i];
                    nums[i]=temp;
                }
                pos++;
            }
        }
    }
}


//'pos' keeps track of the first 0 present in the current form of the array
//we traverse the array and find the first non-zero element and replace it with the first zero element at 'pos'
//we do not do anything if the current element during traversal is a zero, we move to next iteration
