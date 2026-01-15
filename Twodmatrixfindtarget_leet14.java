public class Twodmatrixfindtarget_leet14 {
    public static boolean searchMatrix(int[][] matrix, int target) {
        int m = matrix.length;
        int row = 0;
        int col = matrix[0].length-1;
        while(row < m && col >= 0){
            if(matrix[row][col] == target){
                return true;
            }
            else if(matrix[row][col] < target){
                row++;
            }
            else{
                col--;
            };
        };
        return false;

    };

    public static void main(String args[]){
        
    }
}
