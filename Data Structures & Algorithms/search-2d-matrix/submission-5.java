class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        // this array is sorted from all the points -> rows and columns if its being merged

        int left = 0;
        int rows = matrix.length;
        int columns = matrix[0].length;
        int right = (rows*columns)-1;

        while(left<=right){
            int middle = left + (right-left)/2;
            int real_rows = middle / columns;
            int real_columns = middle % columns;

            if(target < matrix[real_rows][real_columns])
            {
               right = middle - 1;
            }
            else if (target > matrix[real_rows][real_columns]){
             left = middle +1;
            }
            else{
                return true;
            }

        }
        return false;
    }
}
