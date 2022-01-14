/*******************************************************************************
CREATOR : JITHIN JEROME
TITLE - Calculator using switch case.
DATE - JANUARY , 2022
*******************************************************************************/

package lab;
import java.util.*;
public class SwitchCalculator {

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int x=0;
		do
		{
		System.out.println("Enter the first number;");
		double output=0;
		double num1 = sc.nextDouble();
		System.out.println("Enter the second number:");
		double num2 = sc.nextDouble();
		System.out.println("Enter the operator (*,+,-,/,%)");
		char op = sc.next().charAt(0);
		switch(op)
		{
		case '+':
			output = num1+num2;
			break;
		case '-':
			output = num1-num2;
			break;
		case '*':
			output = num1*num2;
			break;
		case '/':
			output = num1/num2;
			break;
		case '%':
			output = num1%num2;
			break;
			default:
				System.out.println("Invalid input");
		}
         System.out.println("The output is:"+output);
         System.out.println("Do oyu want to continue(y/n)?");
         char selector =sc.next().charAt(0);
         if(selector=='y'||selector=='Y')
         {
        	 x++;
         }
		}while(x!=0);
		sc.close();

	}

}
