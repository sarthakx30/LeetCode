class Solution {
    public int[] productExceptSelf(int[] nums) {
        int ans[]=new int[nums.length];
        //Map<Integer,Integer> map=new HashMap<>();
        int prodOfArray=1;
        int zeroCount=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0){
                zeroCount++;
            }
            else{
                prodOfArray*=nums[i];
            }
        }
        if(zeroCount>1){
            return ans;
        }
        for(int i=0;i<nums.length;i++){
            if(zeroCount==1 && nums[i]==0){
                ans[i]=prodOfArray;
            }
            else if(zeroCount==1 && nums[i]!=0){
                ans[i]=0;
            }
            else{
                ans[i]=prodOfArray/nums[i];
            }
        }
        return ans;
    }
}