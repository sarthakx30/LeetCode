class Solution {
    public int majorityElement(int[] nums) {
        int len=nums.length;
        int majority=len/2;
        Map<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<len;i++){
            if(map.containsKey(nums[i])){
                map.put(nums[i],map.getOrDefault(nums[i],0)+1);
                if(map.get(nums[i])>majority){
                    return nums[i];
                }
            }
            else{
                map.put(nums[i],1);
            }
        }
        return nums[0];
    }
}