class Solution {
    public int maxArea(int[] heights) {
        int max_area = 0;
        int left = 0;
        int right = heights.length-1;


        while(left<right)
        {
            int area = Math.min(heights[right], heights[left]) * (right- left);

            max_area = Math.max(max_area, area);

            if(heights[left] < heights[right])
            {
                left++;
            }
            else{
                right--;
            }
            
        }
        return max_area;
    }
}
