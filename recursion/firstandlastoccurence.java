import java.util.*;
public class firstandlastoccurence {
    public static int first=-1;
    public static int last =-1;

    public static void firstandlastoccurence(String str,int idx,char element){
        if(idx==str.length()){
            System.out.println(first);
            System.out.println(last);
            return ;
        }

        char currchar=str.charAt(idx);
        //. If first is still set to -1, it sets first to the current idx. 
        //If first is already set (i.e., not -1), it updates last to the current idx.
        if(first==-1){
            first=idx;
        } 
        else{
            last=idx;
        }
        firstandlastoccurence(str, idx+1, element);
    

    } 
    public static void main(String[] args) {
        String a="aljdnjcuucabndi";
        firstandlastoccurence(a,0,'a');

    }

}