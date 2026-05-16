class Solution {
    public boolean canJump(int[] nums) {
        int result = nums.length-1;
        int n = nums.length;
        for(int i =n-1; i>=0; i--)
        {
           if(i+nums[i] >= result)
           {
                result = i;
           }
        }
        
        return result == 0;
    }
}

