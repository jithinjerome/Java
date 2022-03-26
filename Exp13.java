/*******************************************************************************
CREATOR : JITHIN JEROME
TITLE - MULTITHREADING.
DATE - MARCH, 2022
*******************************************************************************/
package lab;
import java.util.Random;

class EvenThread extends Thread
{
	public void run(int n)
	{
		int square = n*n;
		System.out.println("Square of "+n+" = "+square);
	}
}

class OddThread extends Thread
{
	public void run(int n)
	{
		int cube = n*n*n;
		System.out.println("Cube of "+n+" = "+cube);
	}
}

class RandomnumberThread extends Thread
{
	public void run()
	{
		Random random = new Random();
		for(int i = 0;i<10;i++)
		{
			int randomNumber = random.nextInt(100);
			System.out.println("Random number =  "+randomNumber);
			try 
			{
				Thread.sleep(900);
			}
			catch(Exception e)
			{
				System.out.println(e);
			}
			if(randomNumber%2 == 0)
			{
				EvenThread e =new EvenThread();
				e.run(randomNumber);
				e.start();
			}
			else
			{
				OddThread o = new OddThread();
				o.run(randomNumber);
				o.start();
			}
		}
	}
}

public class Exp13 {

	public static void main(String[] args)
	{
		RandomnumberThread rn = new RandomnumberThread();
		rn.start();

	}

}
