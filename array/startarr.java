import java.util.*;
/**
 * startarr
 */
//basic to take array input and print it
public class startarr {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        int numbers[]=new int[size];
        //input
        for(int i=0;i<size;i++){
            numbers[i]=sc.nextInt();
        }

        //output
        for(int i=0;i<size;i++){
            System.out.println(numbers[i]);
        }
    }


    /** 
    public static void main(String[] args) {
    
        int[] marks = new int[3];
        marks[0]=34;
        marks[1]=54;
        marks[2]=6548;
        for(int i=0;i<3;i++){
            System.out.println(marks[i]);
        }
        System.out.println(marks[1]);
    }
*/

}