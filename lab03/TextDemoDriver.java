package eecs448_lab3;

import javax.swing.BoxLayout;
import javax.swing.JFrame;


public class TextDemoDriver 
{
	private static void createAndDisplayGUI()
	{
		JFrame.setDefaultLookAndFeelDecorated(true);
		JFrame frame = new JFrame("Temperature Converter");
		TextDemo demo = new TextDemo();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		BoxLayout boxlayout= new BoxLayout(frame.getContentPane(), BoxLayout.Y_AXIS);
		frame.setLayout(boxlayout);
		frame.add(demo.panel1);
		frame.add(demo.panel2);
		frame.add(demo.panel3);
		frame.add(demo.panel4);
		frame.add(demo.panel5);
		frame.add(demo.panel6);
		frame.pack();
		frame.setVisible(true);
	}
	
	public static void main(String[] args)
	{
		createAndDisplayGUI();
	}
}