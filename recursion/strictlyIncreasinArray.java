public class strictlyIncreasinArray {
    public static boolean firstlast(int idx,int arr[]){
        if(idx==arr.length-1){
            System.out.println(true);
        }
        if(arr[idx]<arr[idx+1]){
            return firstlast(idx+1, arr);
        }
        else{
            return false;
        }

    }
    public static void main(String[] args) {
        int arr[]={1,5,2,7,3,4};
        System.out.println(firstlast(0, arr));

    }
    
    
}
