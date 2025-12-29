public class singlenum_leet12 {
    public static int singleNumber(int[] nums) {
        int ans = 0;
        for(int i = 0;i<nums.length;i++){
            ans = ans ^ nums[i];
        }
        return ans;
    }

    public static void main(String args[]){
        int nums[] = {1,1,2,2,3};
        int ans = singleNumber(nums);
    }
}
