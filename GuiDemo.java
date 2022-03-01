/*******************************************************************************
CREATOR : JITHIN JEROME
TITLE - GUI BUTTON CLICK.
DATE - FABRUARY , 2022
*******************************************************************************/
package Lab;
import java.awt.event.*;
import javax.swing.*;

public class GuiDemo implements ActionListener
{
	JButton b;
	JTextField t;
	GuiDemo()
	{
		JFrame f = new JFrame();
		JPanel p = new JPanel();
		t = new JTextField();
		t.setBounds(120,50,100,30);
		p.add(t);
		
		b = new JButton("Click");
		b.setBounds(10,50,80,30);
		b.addActionListener(this);
		p.add(b);
		
		p.setLayout(null);
		f.setContentPane(p);
		f.setSize(400,180);
		f.setVisible(true);
	}
	public void actionPerformed(ActionEvent e) 
	{
		if(e.getSource()==b)
		{
			t.setText("Button Clicked");
		}
		
	}

	public static void main(String[] args) 
	{
		new GuiDemo();

	}
}
