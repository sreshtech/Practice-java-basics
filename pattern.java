import java.util.*;
public class pattern {
    

   
    
    
    public static void main(String[] args) {
        int numRows = 5;

        for (int i = 0; i < numRows; i++) {
            int number = 1; // Initialize the first number in each row to 1
            for (int j = 0; j < numRows - i; j++) {
                System.out.print("  "); // Add spaces for formatting
            }

            for (int j = 0; j <= i; j++) {
                System.out.print("  "); // Add spaces for formatting
                System.out.print(number);
                System.out.print("  "); // Add spaces for formatting
                number = number * (i - j) / (j + 1);
            }

            System.out.println(); // Move to the next row
        }
    }


    

    
  
 
    /* 
*         *
**       **
* *     * *
*  *   *  *
*   * *   *
*   * *   *
*  *   *  *
* *     * *
**       **
*         *
    public static void main(String[] args) {
        int n=5;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                if(j==1||i==j){
                    System.out.print("*");

                }
                else{
                    System.out.print(" ");
                }
                

            }
            int s=2*n-i;
            for(int j=i;j<=s;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                if(i==j||j==1){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
       
            System.out.println();
        }
        for(int i=n;i>=1;i--){
            for(int j=1;j<=i;j++){
                if(j==1||i==j){
                    System.out.print("*");

                }
                else{
                    System.out.print(" ");
                }

            }
            int s=2*n-i;
            for(int j=i;j<=s;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                if(i==j||j==1){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
       
            System.out.println();
        }

    }






/*  *
   ***
  *****
 *******
*********
*********
 *******
  *****
   ***
    */
    /*
    public static void main(String[] args) {
        int n=5;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");

            }
            for(int j=1;j<=2*i-1;j++){
                System.out.print("*");
            }
            System.out.println();
        
        }
        for(int i=n;i>=1;i--){
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");

            }
            for(int j=1;j<=2*i-1;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }



   
     1 
   2 1 2 
  3 2 1 2 3 
 4 3 2 1 2 3 4 
5 4 3 2 1 2 3 4 5 



    
    public static void main(String[] args) {
        int n=5;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            for(int j=i;j>=1;j--){
                System.out.print(j + " ");
            }
            for(int j=2;j<=i;j++){
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
    /* 

    public static void main(String[] args) {
        int n=5;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }



  

    public static void main(String[] args) {
        int n=5;
        
        for(int i=1;i<=n;i++){
        
            
            for(int j=1;j<=n-i;j++ ){

                System.out.print(" ");
                
            }
            for(int j=1;j<=n;j++){
                System.out.print("*");
            }
        
            System.out.println();

        }

    }
}

/* 
*         *
**       **
***     ***
****   ****
***** *****
***** *****
****   ****
***     ***
**       **
*         * 

    

    public static void main(String[] args) {
        int n=5;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print("*");

            }
            int s=2*n-i;
            for(int j=i;j<=s;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
       
            System.out.println();
        }
        for(int i=n;i>=1;i--){
            for(int j=1;j<=i;j++){
                System.out.print("*");

            }
            int s=2*n-i;
            for(int j=i;j<=s;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
       
            System.out.println();
        }

    }







     
    public static void main(String[] args) {
        int n=5;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                int sum=i+j;
                if(sum%2==0){
                    System.out.print("1 ");
                }
                else{
                    System.out.print("0 ");
                }
            }
            System.out.println();
        }
    }

    
    public static void main(String[] args) {
        int n=5;
        int number=1;
        for (int i=1;i<=n;i++){
            
            for(int j=1;j<=i;j++ ){
                System.out.print(number);
                number++;
            }
            System.out.println();
        }
    }
    
    public static void main(String[] args) {
        int n=5;
        for(int i=1;i<=n;i++){
            for(int j=n;j>=i;j--){
                System.out.print(j);

            }
            System.out.println();
        }
    }
    
    public static void main(String[] args) {
        int n=10;
        for(int i=n;i>=1;i--){
            for(int j=1;j<=i;j++){
                System.out.print(j);
            }
            System.out.println();
        }
        
    }






    
    public static void main(String[] args) {
        int n=5;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }







     
    public static void main(String[] args) {
        int n=10;
        for(int i=n;i>=1;i--){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int n=4;
        int m=5;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=m;j++){
                if(i==1 || j==1 || i==n||j==m){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        
        
    }*/

}