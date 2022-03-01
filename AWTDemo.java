/*******************************************************************************
CREATOR : JITHIN JEROME
TITLE - GUI SIMPLE LAYOUT USING AWT.
DATE - FABRUARY , 2022
*******************************************************************************/
package doneInClass;
import java.awt.*;
import java.awt.event.*;

public class AWTDemo {

	public static void main(String[] args)
	{
		Frame f = new Frame("My Frame title");
		f.setTitle("My new Frame title");
		Label l=new Label("My Label");  
	        l.setBounds(20,100, 100,20); 
	        f.add(l);
	        Button b = new Button("My press me button");
			b.setBounds(50,50,150,40);
			f.add(b);
			
			TextField tf=new TextField("My text field");
			tf.setBounds(230,100,100,40);
			f.add(tf);
			
			TextArea area = new TextArea("My text area");
			area.setBounds(250,160,200,200);
			f.add(area);
			
			Checkbox android = new Checkbox("Android",true);
			f.add(android);
			android.setBounds(50,180,100,100);
		
		f.setSize(500,500);
		f.setLayout(null);
		f.setVisible(true);
		
		f.addWindowListener(new WindowAdapter() 
		{
	         public void windowClosing(WindowEvent windowEvent)
	         {
	            System.exit(0);
	         }        
	      });  


	}

}
