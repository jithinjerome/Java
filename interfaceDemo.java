/*******************************************************************************
CREATOR : JITHIN JEROME
TITLE - INTERFACE DEMO.
DATE - JANUARY , 2022
*******************************************************************************/
package lab21;
abstract class animal{

	protected int legs;
	protected animal(int legs)
	{
		this.legs=legs;
	}
  	public void walk()
  	{
  	  System.out.println("This animal walk by "+legs+" legs");	
  	}
  	abstract void eat();
  	}
interface pet
{
 public String getname();
 public void setName(String name);
 public void play();
}
class spider extends animal
{
	public spider()
	{
		super(8);
	}
	void eat()
	{
		System.out.println("Spider eat insects");
	}
}
class cat extends animal implements pet
{
	private String catname;
	public cat()
	{
		this("");
	}
	
	public cat(String name) 
	{
		super(4);
		catname = name;
	}
	public String getname()
	{
		return catname;
	}
	public void setName(String name)
	{
		catname = name;
	}
	void eat()
	{
		System.out.println("Cat eat fishes");
	}
	public void play()
	{
		System.out.println("Cat plays with ball");
	}
	
}
class fish extends animal implements pet
{
 	private String fishname;
	public fish(String name)
 	{
 		super(0);
 		fishname = name;
 	}
	public String getname()
	{
		return fishname;
	}
	public void setName(String name)
	{
		fishname = name;
	}
	void eat()
	{
		System.out.println("fish eat plants");
	}
	public void play()
	{
		System.out.println("Fish plays with bubbles");
	}
 	public void walk()
 	{
 		System.out.println("The fish can't walk & don't have legs");
 	}
}


public class interfaceDemo {

	public static void main(String[] args) 
	{
        fish d = new fish("Miami");
        cat c = new cat("Fluffy");
        //animal a = new fish();
        spider e = new spider();
        
        System.out.println("\nFish");
        System.out.println("The fish name is "+d.getname());
        d.eat();
        d.play();
        d.walk();
        System.out.println("\nCat");
        System.out.println("The cat name is "+c.getname());
        c.eat();
        c.play();
        c.walk();
        System.out.println("\nSpider");
        e.eat();
        e.walk();

	}

}
