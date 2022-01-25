/*******************************************************************************
CREATOR : JITHIN JEROME
TITLE - COUNT OF A NUMBER.
DATE - JANUARY , 2022
*******************************************************************************/
package Tutorial;
import java.util.Scanner;
public class Q4 {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int a =sc.nextInt();
		System.out.println("Enter the number to be counted: ");
		int b =sc.nextInt();
		int count=0;
        while(a>0)
        {
        	int rem = a % 10;
        	if(rem==b)
        	{
        		count++;
        	}a = a/10;
        }
        System.out.println("Count = "+count);

	}

}
