public class spiral_matrix {

    public static void spiral_mat(int matrix[][]){
        int row_start = 0;
        int col_start = 0;
        int row_end = matrix.length;
        int col_end = matrix[0].length;

        while(row_start < col_end){
            //Top
            for(int i = col_start; i < col_end;i++){
                System.out.print(matrix[row_start][i]+" ");
            }

            //right side
            for(int i = row_start+1;i<row_end;i++){
                System.out.print(matrix[i][col_end-1]+" ");
            }

            //bottom side
            for(int i = col_end-2;i>=col_start;i--){
                System.out.print(matrix[row_end-1][i]+" ");
            }

            //left side
            for(int i = row_end-2;i>=row_start+1;i--){
                System.out.print(matrix[i][col_start]+" ");
            }

            row_start++;
            col_start++;
            row_end--;  
            col_end--;
        }
    }
    public static void main(String args[]){
        int matrix[][] = {{1,2,3},{5,6,7},{9,10,11},{13,14,15}};
        spiral_mat(matrix);
        System.out.println("done");
    }
}
