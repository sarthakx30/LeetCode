class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        if (nums.length < 3) {
            return Collections.emptyList();
        }
        List<List<Integer>> list=new ArrayList<>();
        Arrays.sort(nums);
        for(int i=0; i<nums.length-2;i++){
            if (i == 0 || (i > 0 && nums[i] != nums[i-1])){
                int j = i+1;
                int k = nums.length-1;
                int sum=0;
                while(j<k){
                    sum = nums[i]+nums[j]+nums[k];
                    if(sum==0){
                        list.add(Arrays.asList(nums[i],nums[j],nums[k]));
                        while(j<k && nums[j]==nums[j+1]) j++;
                        while(j<k && nums[k]==nums[k-1]) k--;
                        j++;
                        k--;
                    }   
                    else if (sum >0) k--;
                    else j++;
                }
            }
        }
        return list;
    }
}