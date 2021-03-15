package _00_JButtons_with_Lambdas;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;

public class LambdaButtons implements ActionListener{
	private JFrame window = new JFrame();
	private JButton addNumbers = new JButton("ADD 2 Numbers");
	private JButton randNumber = new JButton("RANDOM NUMBER");
	private JButton tellAJoke = new JButton("TELL A JOKE");
	
	public LambdaButtons() {
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setLayout(new FlowLayout());
		window.add(addNumbers);
		window.add(randNumber);
		window.add(tellAJoke);
		
		//1. Call the addActionListener methods for each button. Use lambdas
		//   to define to functionality of the buttons.
		Random r = new Random();
		
		addNumbers.addActionListener( (n) -> {System.out.println("First Number: " + Math.random() * 10 + "\nSecond Number: " + Math.random() * 10);});
		
		randNumber.addActionListener( (n) -> 
		{int x = r.nextInt(10) + 5; 
		System.out.println("Random Number: " + x);});
		
		tellAJoke.addActionListener( (n) -> { 
			System.out.println("Q:What do you call a Dark Souls fan who has stayed up too long and has been to tired to play properly for the past hour? \n\n\tA: Sleepy Hollow");
			
		});
		window.setVisible(true);
		window.pack();
	}
	
	public static void main(String[] args) {
		new LambdaButtons();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
	
	
}
