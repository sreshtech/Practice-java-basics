class Solution {
    public int missingNumber(int[] nums) {
        int XOR1=0;
        int XOR2=0;
        //int n=N-1;

        for(int i=0;i<nums.length;i++){         
            XOR2=XOR2 ^ nums[i];
            XOR1=XOR1 ^ (i+1);
        }
        XOR1=XOR1^(nums.length+1);
        return XOR1^XOR2;
    }
}