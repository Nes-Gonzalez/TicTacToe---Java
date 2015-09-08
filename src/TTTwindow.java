import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;



public class TTTwindow extends JFrame {
	
	private int Height=600;
	private int Width=500;
	
	public TTTwindow()
	{
		super("Tic Tac Toe Game"); //adds name to window
		setSize(Width,Height);
		TTTwelcomePanel welcomePanel = new TTTwelcomePanel();
		add(welcomePanel);
		
	}
}
