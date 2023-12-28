public class Solution {
    public static int longestSubarrayWithSumK(int []a, long k) {
       int maxLength = 0;
        int currentSum = 0;
        int left = 0;

        for (int right = 0; right < a.length; right++) {
            currentSum += a[right];

            while (currentSum > k) {
                currentSum -= a[left];
                left++;
            }

            if (currentSum == k) {
                maxLength = Math.max(maxLength, right - left + 1);
            }
        }

        return maxLength;
    }
}
