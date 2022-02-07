/*******************************************************************************
CREATOR : JITHIN JEROME
TITLE - REVERSE OF A NUMBER.
DATE - FEBRUARY , 2022
*******************************************************************************/
package Tutorial;
import java.util.Scanner;
public class Q5 {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number to be reversed: ");
		int num = sc.nextInt();
		int ans =0;
		while (num>0)
		{
			int rem = num%10;
			num = num/10;
			ans = ans*10+rem;
		}sc.close();
		System.out.println("Reversed number =\n"+ans);

	}

}
