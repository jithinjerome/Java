/*******************************************************************************
CREATOR : JITHIN JEROME
TITLE - LARGEST AMONG 3 NUMBERS.
DATE - JANUARY , 2022
*******************************************************************************/

package Tutorial;
import java.util.Scanner;
public class Q1 {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the first number: ");
		int n1 = sc.nextInt();
		System.out.print("Enter the second number: ");
		int n2 = sc.nextInt();
		System.out.print("Enter the third number: ");
		int n3 = sc.nextInt();
		if(n1>n2 && n1>n3)
		{
			System.out.print("The largest number is "+n1);
		}
		else if(n2>n1 && n2>n3)
		{
			System.out.print("The largest number is "+n2);
		}
		else
		{
			System.out.print("The largest number is "+n3);
		}
		sc.close();

	}

}
