package eecs448_lab3;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Dice {
	
	private static JButton button;
	private static JTextField text;
	private static JLabel label;
	private static void createAndDisplayGUI(){
	JPanel panel;
		
		
		panel = new JPanel();
		button = new JButton("Roll");
		text = new JTextField(3);//3 cols, not 20 chars
		label = new JLabel("How many sides do you want your dice to have?");
		//Load the listener
		button.addActionListener(buttonListener());
		
		JFrame frame = new JFrame("Dice");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		panel.add(label);
		panel.add(text);
		panel.add(button);
		
		frame.add(panel);
		frame.pack();
		frame.setVisible(true);
	}
	private static ActionListener buttonListener()
	{
		ActionListener listener = new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
					Random rm=new Random();
					String input = text.getText();
					int num = Integer.parseInt(input);//convert String to int
					int rnum = rm.nextInt(num)+1;
					String newText = "You Rolled: " + Integer.toString(rnum);//convert double to String and
					label.setText(newText);
					System.out.println(newText);
			}
		};
		
		return listener;
	}	
	
	public static void main(String[] args)
	{
		createAndDisplayGUI();
	}
}
