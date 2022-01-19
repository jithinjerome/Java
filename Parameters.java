/*******************************************************************************
CREATOR : JITHIN JEROME
TITLE - Passing Strings as Parameters.
DATE - JANUARY , 2022
*******************************************************************************/

package Tutorial;
import java.util.Scanner;
public class Parameters {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your name: ");
		String name =sc.nextLine();
		String s = myGreet(name);
		System.out.println(s);
		sc.close();

	}
	static String myGreet(String name)
	{
		String message = "Hello "+name+" !";
		return message;
	}

}
