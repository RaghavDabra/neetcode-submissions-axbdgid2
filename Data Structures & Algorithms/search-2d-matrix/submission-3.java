class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
       int row = matrix.length;
       int column = matrix[0].length;
       int left = 0;
       int right = row * column  - 1;

       while(left <= right)
       {
        int middle = left + (right - left)/2;
        int real_row = middle/column;
        int real_column =  middle % column;
        if(target < matrix[real_row][real_column])
        {
            right = middle -1;

        }
        else if(target > matrix[real_row][real_column])
        {
            left = middle +1;
        }
        else{
            return true;
        }
        }
return false;
       }
    }

