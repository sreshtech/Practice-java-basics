import java.util.Scanner;

public class practiceyt{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int n=sc.nextInt();
        
        for(int i=0;i<n;i=i+2){
            System.out.println(i);
        }
        
    }
}


//CALCULATOR WITH SWITCH STATEMENT;
/* 
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a");
        int a=sc.nextInt();
        System.out.println("enter b");
        int b=sc.nextInt();
        char oper=sc.next().charAt(0);
        switch (oper) {
            case '+':
            int result=a+b;
            System.out.println(result);
               
               break;
            case '*':
            int result2=a*b;
            System.out.println(result2);
                break;

            case '/':
            int result3=a/b;
            if(b!=0){
                System.out.println(result3);
            }
            else{
                System.out.println("not posssible");
            }
                break; 
        
            default:
            System.out.println("invalid");

                break;
        }

    }*/

