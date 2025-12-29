import java.util.*;

public class Merge_leet11 {

    public static void Merge_two_sorted_arr(int[] nums1, int m,int[] nums2, int n){
        for (int j = 0, i = m; j < n; j++) {
            nums1[i] = nums2[j];
            i++;
        }
        Arrays.sort(nums1);
    };

    public static void main(String args[]){
        int nums1[] = {1,2,3,0,0,0};
        int m = 3;
        int n = 3;
        int nums2[] = {2,5,6};

        Merge_two_sorted_arr(nums1, m, nums2, n);
        for(int i = 0;i<(m+n);i++){
            System.out.print(nums1[i]+" ");
        };
    }
}
