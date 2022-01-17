/*******************************************************************************
CREATOR : JITHIN JEROME
TITLE - Area of rectangle using parameterized constructor.
DATE - JANUARY , 2022
*******************************************************************************/

package basicPrograms;
class rectangle
{
  double l,b;
  rectangle(double l,double b)
  {
	  this.l=l;
	  this.b=b;
  }
  double area()
  {
	  return l*b;
  }
}
public class rectangleArea {

	public static void main(String[] args) 
	{
		rectangle ob = new rectangle(4,5);
		rectangle ob1 = new rectangle(5,8);
		System.out.println("The area of the 1st triangle is :"+ob.area());
		System.out.println("The area of the 2nd triangle is :"+ob1.area());

	}

}
