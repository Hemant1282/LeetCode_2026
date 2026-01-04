public class diagonal_sum {

    public static void diag_sum(int[][] matrix){
        int sum = 0;
        for(int i = 0;i<matrix.length;i++){
            sum += matrix[i][i];
            if(i != matrix.length-1-i){
                sum += matrix[matrix.length - 1 - i][i];
            }
        }
        System.out.println("The sum is : "+sum);
    }
    public static void main(String[] args) {
        int[][] matrix = {{1,2,3},{4,5,6},{7,8,9}};
        diag_sum(matrix);
    }
}
