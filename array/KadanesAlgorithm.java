//kadanes algo! will start this after 23rd dec 2023
long maxi = Long.MIN_VALUE; // maximum sum
        long sum = 0;

        for (int i = 0; i < nums.length; i++) {
            sum += nums[i]; // Adding the current number to the sum

            if (sum > maxi) {
                maxi = sum; // Update the maximum sum if the current sum is greater
            }

            // If the sum becomes negative, reset it to 0 as starting a new subarray from this point
            if (sum < 0) {
                sum = 0;
            }
        }

        // Return the maximum subarray sum found
        return (int)maxi;
//complexity O(n)
class Solution {
    public int maxSubArray(int[] nums) {     
        int maxSum = nums[0];
        int currentSum = nums[0];

        for (int i = 1; i < nums.length; i++) {
            currentSum = Math.max(nums[i], currentSum + nums[i]);
            maxSum = Math.max(maxSum, currentSum);
        }

        return maxSum;
    }
}
