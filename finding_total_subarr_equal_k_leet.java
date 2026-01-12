public class finding_total_subarr_equal_k_leet {
        public static int subarraySum(int[] nums, int k) {

            int count = 0;
            int currsum = 0;

            // prefix array
            int prefix_arr[] = new int[nums.length];
            prefix_arr[0] = nums[0];

            for (int i = 1; i < nums.length; i++) {
                prefix_arr[i] = prefix_arr[i - 1] + nums[i];
            }

            for (int i = 0; i < nums.length; i++) {
                for (int j = i; j < nums.length; j++) {
                    currsum = i == 0 ? prefix_arr[j] : prefix_arr[j] - prefix_arr[i - 1];
                    if (currsum == k) {
                        count++;
                    }
                }
            }
            return count;
        }
}
