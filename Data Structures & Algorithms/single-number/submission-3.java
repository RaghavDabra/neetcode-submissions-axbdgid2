class Solution {
    public int singleNumber(int[] nums) {
    Arrays.sort(nums); ///forgot to do this step;
     int i = 0;

    while (i<nums.length-1 ) // not a statement -> also faced oob
    {
        if(nums[i] == nums[i+1])
    {
        i++;
        i++;
        }
        else{
        return nums[i];
         //iterate twice
     }
     
         }     return nums[i];

    }
}
