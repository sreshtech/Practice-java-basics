/*Chef has 
�
X 5 rupee coins and 
�
Y 10 rupee coins. Chef goes to a shop to buy chocolates for Chefina where each chocolate costs 
�
Z rupees. Find the maximum number of chocolates that Chef can buy for Chefina.

Input Format
The first line contains a single integer 
�
T — the number of test cases. Then the test cases follow.
The first and only line of each test case contains three integers 
�
X, 
�
Y and 
�
Z — the number of 5 rupee coins, the number of 10 rupee coins and the cost of each chocolate.
Output Format
For each test case, output the maximum number of chocolates that Chef can buy for Chefina.

Constraints
1
≤
�
≤
100
1≤T≤100
1
≤
�
,
�
,
�
≤
1000
1≤X,Y,Z≤1000 */
import java.util.*;
import java.lang.*;
import java.io.*;

class Candy
{
	public static void main (String[] args){
	    Scanner sc=new Scanner(System.in);
	    int T=sc.nextInt();
	    for(int i=0;i<T;i++){
	        int X=sc.nextInt();
	        int Y=sc.nextInt();
	        int Z=sc.nextInt();
	        int choclates=((5*X)+(10*Y))/Z;
	        System.out.println(choclates);
	        
	    }
	    
	}
}