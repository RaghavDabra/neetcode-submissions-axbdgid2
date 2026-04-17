class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int rows = matrix.length;
        int columns = matrix[0].length;

        int left = 0;
        int right = (rows * columns) - 1;

        while(left<=right)
        {
            int m = left+ (right-left)/2;

            int real_rows = m / columns; 
            int real_columns = m % columns;

            if(target < matrix[real_rows][real_columns])
            {
                right = m-1;
            }
            else if(target > matrix[real_rows][real_columns]){
                    left = m+1;
            }
            else{
                return true;
            }
        }
        return false;
    }
}
