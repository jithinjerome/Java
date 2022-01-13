package b1;
import java.util.Scanner;
class area
{
float length,breadth,area;
 void setDim(float l,float b) 
 {
	 length = l;
	 breadth = b;
 }	
 float getArea()
 {
	// area= length*breadth;
	//return area;
	 return length*breadth;
 }
}
public class a11 {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		area ob = new area();
		System.out.println("Enter the length:");
		float l=sc.nextFloat();
		System.out.println("Enter the breadth:");
		float b=sc.nextFloat();
		ob.setDim(l,b);
		System.out.println("Area");
		float ar=ob.getArea();
        System.out.println(ar);
        sc.close();
		
	}
	}
