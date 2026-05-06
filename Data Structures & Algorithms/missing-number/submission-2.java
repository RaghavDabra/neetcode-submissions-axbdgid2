class Solution {
    public int missingNumber(int[] nums) {
     // using bitwise xor;

     int n = nums.length;

     int xor = n;
     for(int i =0; i<n; i++)
     {
        xor ^= i^nums[i]; //xor with 0 = 0;
        // xor with number itself returns 0;
        // xor with the 
     }   
     return xor;
    }
}

//o(n) - > time complexityabstract/

// o(1) -> space complexity