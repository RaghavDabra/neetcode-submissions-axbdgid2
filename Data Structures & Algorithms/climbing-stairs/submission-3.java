class Solution {
    public int climbStairs(int n) {
        int one = 1;
        int two = 1;

        // the one is the current step;
        // the two is the previous step;

        for(int i =0; i < n-1; i++)
        {
            int temp = one;
            one = one+two;
            two = temp;
                    }
        return one;
    }
}
