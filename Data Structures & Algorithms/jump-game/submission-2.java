class Solution {
    public boolean canJump(int[] nums) {
        // greedy algorithm

        //check if the last index se first index reach kar sakte ya nahi?

        int goal = nums.length-1;

        for(int i =nums.length-2; i>=0; i--)
        {
            if(i+nums[i] >= goal)
            {
                goal = i;

            }
        }
        return goal == 0;
    }
}
