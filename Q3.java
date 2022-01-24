/*******************************************************************************
CREATOR : JITHIN JEROME
TITLE -FIBONACCI NUMBERS.
DATE - JANUARY , 2022
*******************************************************************************/



package Tutorial;
import java.util.Scanner;
public class Q3 {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter ther number: ");
		int n = sc.nextInt();
		int a=0;
		int b=1;
		int count,temp;
		for(count=2;count<=n;count++)
		{
			temp = b;
			b = b +a;
			a = temp;
		}
		System.out.println("The fibonacci number is "+b);

	}

}
