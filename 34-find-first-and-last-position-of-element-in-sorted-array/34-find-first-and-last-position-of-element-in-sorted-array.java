class Solution {
    public int[] searchRange(int[] nums, int target) {
        int ans[]={-1,-1};
        if(nums.length==1){
            if(nums[0]==target){
                return new int[]{0,0};
                // ans=[0,0];
            }
            // ans[]={-1,-1};
            return new int[]{-1,-1};

        }
        else{
            for(int i=0;i<nums.length;i++){
                if(nums[i]==target){
                    if(ans[0]==-1){
                        ans[0]=i;
                    }
                    else{
                        ans[1]=i;
                    }
                }
            }
            if(ans[1]==-1){
                ans[1]=ans[0];
            }
        }
        return ans;
    }
}