class Solution {
    public int missingNumber(int[] nums) {

        // this is bruteforce solution -> sort and then find whats missing
        Arrays.sort(nums);

        for(int i =0; i<nums.length; i++)
        {
            if(nums[i] != i)
            return i;
     }  
     return nums.length;
      }
}
