class Solution {
    public void rotate(int[] nums, int k) {
        //O(n*k) time complexity
        //O(1) space complexity
        // while(k>0){
        //     int temp=nums[nums.length-1];
        //     for(int i=nums.length-1;i>0;i--){
        //         nums[i]=nums[i-1];
        //     }
        //     nums[0]=temp;
        //     k--;
        // }
        
        //O(n) time complexity
        //O(1) space complexity
        if(nums.length<2) return;
        k %= nums.length;
        reverse(nums, 0, nums.length - 1);
        reverse(nums, 0, k - 1);
        reverse(nums, k, nums.length - 1);
    }
    public void reverse(int[] nums, int start, int end) {
        while (start < end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }
}