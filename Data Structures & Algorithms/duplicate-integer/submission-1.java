class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashSet<Integer> memory = new HashSet<Integer>();

        for(int num : nums)
        {

        if(memory.contains(num))
        {
            return true;
        }
        memory.add(num);
        }
        return false;
    }
}