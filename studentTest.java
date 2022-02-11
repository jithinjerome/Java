/*******************************************************************************
CREATOR : JITHIN JEROME
TITLE - STUDENT PROGRAM USING PARAMETERISED CONSTRUCTOR.
DATE - FEBRUARY, 2022
*******************************************************************************/
package basicPrograms;

class student
{
String name;
int rollno;
student(String n, int rn)
{
  name = n;
  rollno =rn;
}
void display()
{
  System.out.println("Name: "+name+"\nRoll no: "+rollno);	
}
}
public class studentTest {

	public static void main(String[] args) 
	{
		student s1 = new student("John",2);
		s1.display();

	}

}
