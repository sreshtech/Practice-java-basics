import java.util.ArrayList;
public class removeDuplicates {
	public static int removeDuplicates(ArrayList<Integer> arr,int n){
		int i=0;
		for(int j=1;j<n;j++){
			if(!arr.get(i).equals(arr.get(j))){
				i++;
				arr.set(i,arr.get(j));
			}
		}
		return i+1;	
	}
}