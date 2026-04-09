class Solution {
    public int maxArea(int[] heights) {
        int left =0; //left pointer 
        int right = heights.length -1; //right pointer
        int max_area =0; 
        while(left <right)
        {
            int area = Math.min(heights[left], heights[right]) * (right-left);

        max_area = Math.max(max_area , area);
        if(heights[left] <= heights[right]) {
            left++;
        }
        else{
            right--;
        }
        }
        return max_area;
    }
}
