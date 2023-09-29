/*Chef wants to become fit for which he decided to walk to the office and return home by walking. It is known that Chef's office is 
�
X km away from his home.

If his office is open on 
5
5 days in a week, find the number of kilometers Chef travels through office trips in a week.

Input Format
First line will contain 
�
T, number of test cases. Then the test cases follow.
Each test case contains of a single line consisting of single integer 
�
X.
Output Format
For each test case, output the number of kilometers Chef travels through office trips in a week.

Constraints
1
≤
�
≤
10
1≤T≤10
1
≤
�
≤
10
1≤X≤10 */
import java.util.*;
import java.lang.*;
import java.io.*;

class fitness
{
	public static void main (String[] args){
	    Scanner sc=new Scanner(System.in);
	    int T=sc.nextInt();//TEST CASES
	    for(int i=0;i<T;i++){
	        int X=sc.nextInt();//ghr se home
	        int weekdays=5;
	        int KUCHB= 2*X*weekdays;
	        System.out.println(KUCHB);
	    }
	}
	    

}

