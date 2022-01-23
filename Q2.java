/*******************************************************************************
CREATOR : JITHIN JEROME
TITLE - CASE CHECKING
DATE - JANUARY , 2022
*******************************************************************************/
package Tutorial;
import java.util.Scanner;
public class Q2 {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the character to be checked: ");
		char c = sc.next().trim().charAt(0);
		if (c>= 'a' && c<= 'z')
		{
			System.out.println(c+" is Lowercase");
		}
		else
		{
			System.out.println(c+" is uppercase");
		}
		sc.close();

	}

}
