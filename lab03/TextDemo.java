package eecs448_lab3;

import javax.swing.*;
import java.awt.event.*;
import java.awt.Component;
import java.awt.GridLayout;

public class TextDemo 
{
	JPanel panel1;
	 JPanel panel2;
	 JPanel panel3;
	 JPanel panel4;
	 JPanel panel5;
	 JPanel panel6;
	private JButton button1;
	private JTextField text1;
	private JLabel label1;
	private JButton button2;
	private JTextField text2;
	private JLabel label2;
	private JButton button3;
	private JTextField text3;
	private JLabel label3;
	private JButton button4;
	private JTextField text4;
	private JLabel label4;
	private JButton button5;
	private JTextField text5;
	private JLabel label5;
	private JButton button6;
	private JTextField text6;
	private JLabel label6;
	
	public TextDemo()
	{
		//BUTTON 1
		panel1 = new JPanel();
		button1 = new JButton("Convert");
		text1 = new JTextField(3);//3 cols, not 20 chars
		label1 = new JLabel("Enter a temperature from F to C");
		//Load the listener
		button1.addActionListener(button1Listener());	
		
		//load the panel
		panel1.add(text1);
		panel1.add(button1);
		panel1.add(label1);
		
		//BUTTON 2
		panel2 = new JPanel();
		button2 = new JButton("Convert");
		text2 = new JTextField(3);//3 cols, not 20 chars
		label2 = new JLabel("Enter a temperature from F to K");
		
		button2.addActionListener(button2Listener());
		
		panel2.add(text2);
		panel2.add(button2);
		panel2.add(label2);
		
		//BUTTON 3
				panel3 = new JPanel();
				button3 = new JButton("Convert");
				text3 = new JTextField(3);//3 cols, not 20 chars
				label3 = new JLabel("Enter a temperature from C to K");
				
				button3.addActionListener(button3Listener());
				
				panel3.add(text3);
				panel3.add(button3);
				panel3.add(label3);
		//BUTTON 4
				panel4 = new JPanel();
				button4 = new JButton("Convert");
				text4 = new JTextField(3);//3 cols, not 20 chars
				label4 = new JLabel("Enter a temperature from C to F");
				
				button4.addActionListener(button4Listener());
				
				panel4.add(text4);
				panel4.add(button4);
				panel4.add(label4);
		//BUTTON 5
				panel5 = new JPanel();
				button5 = new JButton("Convert");
				text5 = new JTextField(3);//3 cols, not 20 chars
				label5 = new JLabel("Enter a temperature from K to F");
				
				button5.addActionListener(button5Listener());
				
				panel5.add(text5);
				panel5.add(button5);
				panel5.add(label5);
		//BUTTON 6
				panel6 = new JPanel();
				button6 = new JButton("Convert");
				text6 = new JTextField(3);//3 cols, not 20 chars
				label6 = new JLabel("Enter a temperature from K to C");
				
				button6.addActionListener(button6Listener());
				
				panel6.add(text6);
				panel6.add(button6);
				panel6.add(label6);
	}
	
	public Component getContent()
	{
		return (panel1);
	}
	
	private ActionListener button1Listener()
	{
		ActionListener listener = new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				try{
					String input = text1.getText();
					double tempInF = Double.parseDouble(input);//convert String to double
					double tempInC = (tempInF-32)*(5.0/9.0); //convert F to C
					String newText = "Temp in C: " + String.format("%.2f",tempInC);//convert double to String and
												       //only display 2 places past decimal
					label1.setText(newText);
					System.out.println(newText);
				}
				catch(Exception ex){
					System.out.println("Must enter in a number ");
				}
			}
		};
		
		return listener;
	}	
	private ActionListener button2Listener()
	{
		ActionListener listener = new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				try{
					String input = text2.getText();
					double tempInF = Double.parseDouble(input);//convert String to double
					double tempInK = (tempInF-32)*(5.0/9.0)+273; //convert F to K
					String newText = "Temp in K: " + String.format("%.2f",tempInK);//convert double to String and
												       //only display 2 places past decimal
					label2.setText(newText);
					System.out.println(newText);
				}
				catch(Exception ex){
					System.out.println("Must enter in a number ");
				}
			}
		};
		
		return listener;
	}	
	private ActionListener button3Listener()
	{
		ActionListener listener = new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				try{
					String input = text3.getText();
					double tempInC = Double.parseDouble(input);//convert String to double
					double tempInK = tempInC+273; //convert C to K
					String newText = "Temp in K: " + String.format("%.2f",tempInK);//convert double to String and
												       //only display 2 places past decimal
					label3.setText(newText);
					System.out.println(newText);
				}
				catch(Exception ex){
					System.out.println("Must enter in a number ");
				}
			}
		};
		
		return listener;
	}
	private ActionListener button4Listener()
	{
		ActionListener listener = new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				try{
					String input = text4.getText();
					double tempInC = Double.parseDouble(input);//convert String to double
					double tempInF = tempInC*(9.0/5.0)+32; //convert C to F
					String newText = "Temp in F: " + String.format("%.2f",tempInF);//convert double to String and
												       //only display 2 places past decimal
					label4.setText(newText);
					System.out.println(newText);
				}
				catch(Exception ex){
					System.out.println("Must enter in a number ");
				}
			}
		};
		
		return listener;
	}	
	private ActionListener button5Listener()
	{
		ActionListener listener = new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				try{
					String input = text5.getText();
					double tempInK = Double.parseDouble(input);//convert String to double
					double tempInF = (tempInK-273)*(9.0/5.0)+32; //convert C to F
					String newText = "Temp in F: " + String.format("%.2f",tempInF);//convert double to String and
												       //only display 2 places past decimal
					label5.setText(newText);
					System.out.println(newText);
				}
				catch(Exception ex){
					System.out.println("Must enter in a number ");
				}
			}
		};
		
		return listener;
	}	
	private ActionListener button6Listener()
	{
		ActionListener listener = new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				try{
					String input = text6.getText();
					double tempInK = Double.parseDouble(input);//convert String to double
					double tempInC = (tempInK-273); //convert K to C
					String newText = "Temp in C: " + String.format("%.2f",tempInC);//convert double to String and
												       //only display 2 places past decimal
					label6.setText(newText);
					System.out.println(newText);
				}
				catch(Exception ex){
					System.out.println("Must enter in a number ");
				}
			}
		};
		
		return listener;
	}	
}