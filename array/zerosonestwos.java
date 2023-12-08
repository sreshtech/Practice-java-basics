//COMPLEXITY WILL BE O(N)
import java.util.* ;
import java.io.*; 
public class Solution {
    public static void sortArray(ArrayList<Integer> arr, int n) {
        int cnt1=0, cnt2=0, cnt3=0;
        for(int i=0;i<n;i++){
            if(arr.get(i)==0){
                cnt1++;
            }
            else if(arr.get(i)==1){
                cnt2++;
            }
            else{
                cnt3++;
            }
        }
        for(int i=0;i<cnt1;i++){
            arr.set(i,0);
        }
        for(int i=cnt1;i<cnt1+cnt2;i++){
            arr.set(i,1);
        }
        for(int i=cnt1+cnt2;i<n;i++){
            arr.set(i,2);
        }
    }
}

//COMPLEXITY O(1) 
class Solution {
    public void sortColors(int[] nums) {
        int low = 0, mid = 0, high = nums.length - 1; 
        while (mid <= high) {
            if (nums[mid] == 0) { 
                swap(nums,low, mid);
                low++;
                mid++;
            }
            else if (nums[mid] == 1) {
                mid++;
            }
            else {
                swap(nums,mid,high);
                high--;
            }
        }
    }
    static void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
  
    
}
