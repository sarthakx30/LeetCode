class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int res[]=new int[nums.length-k+1];
        Deque<Integer> deku=new ArrayDeque<>();
        int resIndex=0;
        for(int i=0;i<nums.length;i++){
            // remove numbers out of range k
			while (!deku.isEmpty() && deku.peek() < i - k + 1) {
				deku.removeFirst();
			}
            // remove smaller numbers in k range as they are useless
            while (!deku.isEmpty() && nums[deku.peekLast()] < nums[i]) {
				deku.removeLast();
			}
            // deku contains index... r contains content
            deku.addLast(i);
            if (i >= k - 1) {
				res[resIndex] = nums[deku.peek()];
                resIndex++;
			}
        }
        return res;
    }
}