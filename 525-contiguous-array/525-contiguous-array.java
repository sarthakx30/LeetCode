class Solution {
    public int findMaxLength(int[] nums) {
        int max=0;
        Map<Integer,Integer> map=new HashMap<>();
        map.put(0,-1);
        int count=0;
        for(int i=0;i<nums.length;i++){
            count=nums[i]==0?count-1:count+1;
            if(map.containsKey(count)){
                max=Math.max(max,i-map.get(count));
                continue;
            }
            map.put(count,i);
        }
        return max;
    }
}