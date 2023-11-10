import java.util.* ;
import java.io.*; 


class RightRotateByOnePlace {

    public static int[] rotateArray(int[] arr, int n) {
        int temp=arr[0];//first position
        for(int i=1;i<n;i++){//loop to traverse the el from second position to last of array 
            arr[i-1]=arr[i];
            
        }
        arr[n-1]=temp; //last position of array is assigned to first position
        return arr;

    }
}