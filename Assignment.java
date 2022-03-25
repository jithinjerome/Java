/*******************************************************************************
CREATOR : JITHIN JEROME
TITLE - ROUSHDAT RESTAURANT ORDERS.
DATE - MARCH, 2022
*******************************************************************************/
package lab;
import java.util.*;
interface food
{
	void setType(String f);
	double calculatePrice();
}
class pizza implements food
{
	String pizzasize,pizzatype;
	double price;

	void setsize(String s)
	{
		pizzasize = s;
	}

	public void setType(String pizzatype) 
	{
		this.pizzatype = pizzatype;
	}

	public double calculatePrice() 
	{
		if(pizzasize == "small"&& pizzatype=="veg")
		{
			price = 80;
		}
		else if(pizzasize == "small"&& pizzatype=="non_veg")
		{
			price = 125;
		}
		else if(pizzasize == "medium"&& pizzatype=="veg")
		{
			price = 175;
		}
		else if(pizzasize == "medium"&& pizzatype=="non_veg")
		{
			price = 225;
		}
		else if(pizzasize == "large"&& pizzatype=="veg")
		{
			price = 250;
		}
		else 
		{
			price = 275;
		}

		return price;
	}
}
class lasange implements food
{
	String lasangetype;
	double price;

	public void setType(String type) 
	{
		lasangetype =type;
	}


	public double calculatePrice() 
	{
		if(lasangetype=="veg")
		{
			price=200;
		}
		else 
		{
			price=300;
		}
		return price;
	}


}
public class Assignment {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		lasange l = new lasange();
		pizza p = new pizza();
		System.out.println("     Roushdat Resto Specials     ");
		System.out.println("Enter your order\n1.Pizza\n2.Lasagne");
		System.out.print("Enter your choice: ");
		int ch = sc.nextInt();

		if (ch==1)
		{
			System.out.println("Select the Pizza type\n1.vegeterian\n2.Non-Vegeterian ");
			System.out.print("Enter your choice: ");
			int pt = sc.nextInt();
			if(pt==1)
			{
				p.setType("veg");
			}
			else if(pt==2)
			{
				p.setType("non_veg");
			}
			else
			{
				System.out.println("Enter a valid valid choice!!");
			}
			System.out.println("Select the size you need \n1.Small\n2.Medium\n3.Large");
			System.out.print("Enter your choice: ");
			int ps =sc.nextInt();
			if(ps==1)
			{
				p.setsize("small");
			}
			else if(ps==2)
			{
				p.setsize("medium");
			}
			else if(ps==3)
			{
				p.setsize("large");
			}
			else
			{
				System.out.println("Enter a valid Pizza Size");
			}
			System.out.println("Price of your Pizza is: "+p.calculatePrice());
		}
		else if(ch==2)
		{
			System.out.println("Select the Lasagne type\n1.Vegeterian\2.Non-Vegeterian");
			System.out.print("Enter your choice:");
			int ls = sc.nextInt();
			if(ls==1)
			{
				l.setType("veg");
			}
			else if(ls==2)
			{
				l.setType("non_veg");
			}
			else
			{
				System.out.println("Enter a valid type");
			}
			System.out.println("Price of your Lasagne is: "+l.calculatePrice());

		}
		else
		{
			System.out.println("Enter a valid choice!!");
		}
		System.out.println("   Thank you !!\n   Visit Again");

	}

}
