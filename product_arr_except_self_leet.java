class product_arr_except_self_leet {
    public static int[] productExceptSelf(int[] nums) {
        // left product
        int prefix[] = new int[nums.length];
        prefix[0] = 1;
        prefix[1] = nums[0];
        for (int i = 2; i < nums.length; i++) {
            prefix[i] = nums[i - 1] * prefix[i - 1];
        }

        // right product
        int suffix[] = new int[nums.length];
        int n = nums.length;
        suffix[n - 1] = 1;
        suffix[n - 2] = nums[n - 1];

        for (int i = n - 3; i >= 0; i--) {
            suffix[i] = suffix[i + 1] * nums[i + 1];
        }

        // final logic
        for (int i = 0; i < nums.length; i++) {
            nums[i] = prefix[i] * suffix[i];
        }

        return nums;
    }
}
