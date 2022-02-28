class Solution {
    public List<String> summaryRanges(int[] nums) {
        if(nums.length==0){
            return Collections.emptyList();
        }
        List<String> ans=new ArrayList<>();
        if(nums.length==1){
            ans.add(nums[0]+"");
            return ans;
        }
        for(int i=0;i<nums.length;i++){
            int num=nums[i];
            while(i<nums.length-1 && nums[i]+1==nums[i+1]){
                i++;
            }
            if(num!=nums[i]){
                ans.add(num+"->"+nums[i]);
            }
            else{
                ans.add(nums[i]+"");
            }
        }
        return ans;
    }
}