/*******************************************************************************
CREATOR : JITHIN JEROME
TITLE - Enhanced Switch Case.
DATE - JANUARY , 2022
*******************************************************************************/

package Tutorial;
import java.util.Scanner;
public class Enhancedswitch {

	public static void main(String[] args) 
	{
	 Scanner sc = new Scanner(System.in);
	 System.out.println("Enter a fruit(Mango,Apple,Orange,Grapes):\n ");
	 String fruit = (sc.next()).toLowerCase();
	 
	 switch(fruit)
	 {
	 case "mango"-> System.out.println("King of fruits!");
	 case "apple"->System.out.println("A sweet red fruit");
	 case"orange"->System.out.println("Round fruit");
	 case "grapes"->System.out.println("A small fruit");
	 default->System.out.println("Please enter a valid fruit!!");
		 
	 }

	}

}
