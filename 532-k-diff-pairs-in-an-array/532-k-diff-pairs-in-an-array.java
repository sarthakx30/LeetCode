class Solution {
    public int findPairs(int[] nums, int k) {
        if(nums.length==1){
            return 0;
        }
        int ans=0;
        Map<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(map.containsKey(nums[i])){
                if(k==0 && map.get(nums[i])==1){
                    ans++;
                }
                map.put(nums[i],map.get(nums[i])+1);
            }
            else{
                if(map.containsKey(nums[i]-k)){
                    ans++;
                }
                if(map.containsKey(nums[i]+k)){
                    ans++;
                }
                map.put(nums[i],1);
            }
        }
        return ans;
    }
}