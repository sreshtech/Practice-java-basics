class Solution {
    public int maxProduct(int[] nums) {
        if(nums == null || nums.length < 2) {
            return -1; // There should be at least two elements in the array
        }

        int maxProduct = Integer.MIN_VALUE;

        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                int currentProduct = (nums[i] - 1) * (nums[j] - 1);
                maxProduct = Math.max(maxProduct, currentProduct);
            }
        }

        return maxProduct;
    }
}
