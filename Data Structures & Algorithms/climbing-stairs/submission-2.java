class Solution {
    public int climbStairs(int n) {
        int one = 1, two = 1;

        //one = ways to reach the current step
        //two = ways to reach the previous step

        for(int i =0; i<n-1; i++)
        {
            int temp = one;
            one = one+two;
            two = temp;
        }
        return one;
    }
}
