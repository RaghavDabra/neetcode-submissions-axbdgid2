class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i=0; i<nums.length; i++)
        { //The complement is the number which is present in the array 
        //and when we subtract the target - num[i] - 
            int complement = target - nums[i];

            if(map.containsKey(complement))
            {
                return new int[]{map.get(complement) , i };
                //we are getting the complement from the stored memory 
            }
            map.put(nums[i], i);

        }
        return new int[] {};
    }
}
