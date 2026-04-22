class Solution {
    public int trap(int[] height) {
        //  i can use two pointer in this approach 

        int left = 0;
        int right = height.length-1;
        int result = 0;
        int leftmax = height[left];
        int rightmax = height[right];

         if(height == null || height.length == 0)
          {
            return 0;
          }
        while(left <right)
        { 
         
          if(leftmax<rightmax)
          {left++;
          leftmax = Math.max(leftmax, height[left]);
          result += leftmax - height[left];
        }
        else{
          right--;
           rightmax = Math.max(rightmax ,height[right]);
          result += rightmax - height[right];
        }
        }
        return result;
        

    }
}
