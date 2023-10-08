import java.util.*;
public class recursionnn {
//all basics of recursion

     public static int stackxn(int x, int n){
        if(x==0){
            return 0;
        }
        if(n==0){
            return 1;
        }// two base conditions
        if(n%2==0){
            return stackxn(x, n/2)*stackxn(x, n/2) ;
        }
        else{
            return stackxn(x, n/2)*stackxn(x, n/2)*x;
        }
    }
    public static void main(String[] args) {
        int x=8;
        int n=5;
        int s=stackxn(x, n);
        System.out.println(s);
    }



    /* 
    public static int stackxn(int x, int n){
        if(x==0){
            return 0;
        }
        if(n==0){
            return 1;
        }// two base conditions
        int stack= stackxn(x, n-1);//kaam hai
        int cutcut=x*stack;
        return cutcut;

    }
    public static void main(String[] args) {
        int x=8;
        int n=2;
        int s=stackxn(x, n);
        System.out.println(s);
    }


    /* 
    public static void funcn5(int a,int b,int n){
        if(n==0){
            return;
        }
        int c=a+b;
        System.out.println(c);
        funcn5(b, c, n-1);
    }
    public static void main(String[] args) {
        int a=0,b=1;
        System.out.println(a);
        System.out.println(b);
        int n=8;
        funcn5(a, b, n-2);

    }





    /* 
   public static void function4(int n ){

        if(n==8){
            return ; 
        }
        System.out.println(n);
        function4(n+1);
    }

    public static void main(String[] args) {
        
        int n=1;
        int x=5;
        
        function4(n);
        
    }


    /* 
    public static void function4(int n){
        if(n==0){
            return ; 
        }
        System.out.println(n);
        function4(n-1);
    }

    public static void main(String[] args) {
        int n=5;
        function4(n);
        
    }*/
}