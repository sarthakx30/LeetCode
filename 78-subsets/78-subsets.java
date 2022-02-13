class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> list=new ArrayList<>();
        list.add(new ArrayList<Integer>());
        for(int num : nums){
            List<List<Integer>> subList=new ArrayList<>();
            for (List<Integer> curr : list) {
                subList.add(new ArrayList<Integer>(curr){
                    {
                        add(num);
                    }
                });
            }
            for (List<Integer> curr : subList) {
                list.add(curr);
            }
        }
        return list;
    }
}