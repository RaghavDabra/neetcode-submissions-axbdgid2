class Solution {
    public int findDuplicate(int[] nums) {
// o(n) is using the hassets , but if i treat the
// array like the list list and use the slow and fast
// pointers I can do it

        int slow =0;
        int fast = 0;
        while(true) {
        slow = nums[slow];
        fast = nums[nums[fast]];

      
        
        if(slow == fast){
        
            break;
        }
        }

        // second pointer to return the value which is found

        int slow2 = 0;
        while(true){
        slow2 = nums[slow2];
        slow = nums[slow];
        if(slow == slow2)
        {
            return slow;
        
    }
}
}
}
