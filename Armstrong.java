/*******************************************************************************
CREATOR : JITHIN JEROME
TITLE - ARMSTRON NUMBERS.
DATE - MARCH , 2022
*******************************************************************************/
package Tutorial;
import java.util.Scanner;
public class Armstrong {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Ener a three digit number to check whether it is armstrong or not: ");
		int n = sc.nextInt();
		System.out.println(isArmstrong(n));

	}
	static  boolean isArmstrong(int n)
	{
		int original =n;
		int sum = 0;
		while(n>0)
		{
			int rem = n%10;
			n= n/10;
			sum = sum + rem*rem*rem;
			
		}
		return(sum==original);
	}

}
