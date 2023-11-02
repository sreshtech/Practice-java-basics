public class slargestSsmallest {
    public static int[] getSecondOrderElements(int n, int []a) {
        int[] result = new int[2]; 
        result[0] = slargest(n, a);
        result[1] = ssmallest(n, a);

        return result;

    }    

public static int slargest(int n, int[]a){ 
    int largest=a[0];
    int slargest=-1;
    for (int i = 1; i <n; i++) {
        if(a[i]> largest){
            slargest=largest;
            largest=a[i];
        }
        else if(a[i]<largest && slargest<a[i]){
            slargest=a[i];
        }
                  
    }
    return slargest;
}
        
        //for second smallest
public static int ssmallest(int n, int[]a){


    int smallest=a[0];
    int ssmallest= Integer.MAX_VALUE;
    for(int i=1;i<n;i++){
        if(a[i]<smallest){
            ssmallest=smallest;
            smallest=a[i];
                
        }
        else if(a[i]>smallest && a[i]<ssmallest){
            ssmallest=a[i];
        }
    }
    return ssmallest;
}
}
        
    
