/*******************************************************************************
CREATOR : JITHIN JEROME
TITLE - PRIME NUMBER.
DATE - FEBRUARY, 2022
*******************************************************************************/
package Tutorial;
import java.util.Scanner;
public class Prime {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number to check whether it is prime or not:");
		int a = sc.nextInt();
		boolean ans = isprime(a);
		System.out.println(ans);

	}
	static boolean isprime(int a)
	{
		if(a<= 1)
		{
			return false;
		}
		int c =2;
		while(c * c<=a)
		{
			if(a%c==0)
			{
				return false;
			}
			c++;
		}
		return c * c>a;
	}

}
