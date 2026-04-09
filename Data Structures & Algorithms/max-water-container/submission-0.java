class Solution {
    public int maxArea(int[] heights) {
        int area =0;

        for(int i =0; i<heights.length; i++)
        {
            for(int j=i+1; j<heights.length; j++)
            {
                area = Math.max(area, Math.min(heights[i], heights[j]) * (j-i));
            }
        }
        return area;
    }
}
