class Solution {
    public int rob(int[] nums) {
        //dividing the bigger array into two smaller sub arrays.add)


return Math.max(nums[0], Math.max(helper(Arrays.copyOfRange(nums, 1 , nums.length)) , 
   helper(Arrays.copyOfRange(nums, 0 , nums.length-1))));
    }
    private int helper(int[] nums){
        int rob1 =0;
        int rob2 =0;

        for(int num : nums)
        {
            int temp = Math.max(num + rob1 , rob2);
            rob1 = rob2;
            rob2 = temp;
        }
        return rob2;
    }
}
