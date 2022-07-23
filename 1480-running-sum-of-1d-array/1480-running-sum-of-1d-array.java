// class Solution {
//     public int[] runningSum(int[] nums) {
//         int runningSum[]=new int[nums.length];
//         runningSum[0]=nums[0];
//         for(int i=1;i<nums.length;i++){
//             runningSum[i]=runningSum[i-1]+nums[i];
//         }
//         return runningSum;
//     }
// }

class Solution{
    public int[] runningSum(int[] nums){
        int sum[]=new int[nums.length];
        sum[0]=nums[0];
        for(int i=1;i<nums.length;i++){
            sum[i]=sum[i-1]+nums[i];
        }
        return sum;
    }
}