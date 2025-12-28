import java.util.*;

public class Subarray_sum_leet5 {

    //Brute force
    public static int max_subarray_sum(int arr[]){
        int curr_sum = 0;
        int max_sum = Integer.MIN_VALUE;
        for(int i = 0;i<arr.length;i++){
            for(int j = i;j<arr.length;j++){
                for(int k = i;k<=j;k++){
                    curr_sum += arr[k];
                }
                if(curr_sum > max_sum){
                    max_sum = curr_sum;
                    curr_sum = 0;
                }
                else{
                    curr_sum = 0;
                }
            }
        }
        return max_sum;
    }

    //Max subarray sum using prefix array
    public static int max_subarray_sum2(int arr[]){
        int max_sum = Integer.MIN_VALUE;
        int curr_sum = 0;
        int prefix_arr[] = new int[arr.length];
        prefix_arr[0] = arr[0];
        for(int i = 1;i<arr.length;i++){
            prefix_arr[i] = prefix_arr[i-1] + arr[i];
        }

        for(int i = 0;i<arr.length;i++){
            for(int j = i;j<arr.length;j++){
                curr_sum = i == 0? prefix_arr[j] : prefix_arr[j] - prefix_arr[i-1]; 
            }
            if(curr_sum > max_sum){
                max_sum = curr_sum;
            }
        }
        return max_sum;
    }

    //Kadanes algorithm
    public static int max_subarray_sum3(int arr[]){
        int curr_sum = 0;
        int max_sum = Integer.MIN_VALUE;
        for(int i = 0;i<arr.length;i++){
            curr_sum += arr[i];
            if(curr_sum < 0){
                curr_sum = 0;
            }
            max_sum = Math.max(curr_sum,max_sum);
        }
        return curr_sum;
    }
    
    public static void main(String args[]){
        int arr[] = {1,2,3,4,5,6};
        int sum = max_subarray_sum2(arr);
        System.out.println(sum);
    }
}
