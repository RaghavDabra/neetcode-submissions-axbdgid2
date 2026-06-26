class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i =0; i<nums.length; i++)
        {
            int number_i_need = target - nums[i];
            if(map.containsKey(number_i_need))
            {
                return new int[] {map.get(number_i_need) , i };
            }
            map.put(nums[i], i);
        }
        return new int[] {};
    }
}
