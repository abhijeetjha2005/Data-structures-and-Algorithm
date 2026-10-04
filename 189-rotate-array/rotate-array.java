class Solution {
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        k = k % n;

        int[] result = new int[n];

        int j = 0;

        // Put last k elements first
        for (int i = n - k; i < n; i++) {
            result[j++] = nums[i];
        }

        // Put remaining elements after them
        for (int i = 0; i < n - k; i++) {
            result[j++] = nums[i];
        }

        // Copy result back into nums
        for (int i = 0; i < n; i++) {
            nums[i] = result[i];
        }
    }
}