/*******************************************************************************
CREATOR : JITHIN JEROME
TITLE - GUI TRAFFIC LIGHT.
DATE - FEBRUARY , 2022
*******************************************************************************/
package lab21;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class TrafficLight extends JPanel implements ActionListener 
{
	JRadioButton r1,r2,r3;
	Color red_c,yellow_c,green_c;
	TrafficLight()
	{
		setBounds(0,00,640,460);
		r1 = new JRadioButton("Red");
		r2 = new JRadioButton("Yellow");
		r3 = new JRadioButton("Green");
		r1.setSelected(true);
		red_c = Color.red;
		yellow_c = getBackground();
		green_c = getBackground();
		ButtonGroup gp = new ButtonGroup();
		gp.add(r1);add(r1);
		gp.add(r2);add(r2);
		gp.add(r3);add(r3);

		r1.addActionListener(this);
		r2.addActionListener(this);
		r3.addActionListener(this);

	}
	public void paintComponent(Graphics g)
	{
		super.paintComponent(g);
		g.drawOval(50,50,50,50);
		g.drawOval(50,110,50,50);
		g.drawOval(50,170,50,50);
		g.setColor(red_c);
		g.fillOval(50,50,50,50);

		g.setColor(yellow_c);
		g.fillOval(50,110,50,50);

		g.setColor(green_c);
		g.fillOval(50,170,50,50);

	}
	public void actionPerformed(ActionEvent e) 
	{
		if(r1.isSelected()==true)
		{
			red_c = Color.red;
			yellow_c = getBackground();
			green_c = getBackground();
		}
		if(r2.isSelected()==true)
		{
			red_c = getBackground();
			yellow_c = Color.yellow;
			green_c = getBackground();
		}
		if(r3.isSelected()==true)
		{
			red_c = getBackground();
			yellow_c = getBackground();
			green_c = Color.green;
		}
		repaint();
	}

	public static void main(String[] args) 
	{
		JFrame f = new JFrame("Traffic Signal");
		f.setSize(500,400);
		f.setLayout(null);
		f.setVisible(true);
		TrafficLight t = new TrafficLight();
		f.add(t);
		

	}
}
