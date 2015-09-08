import java.awt.BorderLayout;

import javax.swing.JLabel;
import javax.swing.JPanel;


public class TTTwelcomePanel extends JPanel
{
	public TTTwelcomePanel()
	{
		//setLayout(new BorderLayout());
		JLabel welcomeMessege=new JLabel("Tic Tac Toe");
		add(welcomeMessege);
		setVisible(true);

	}

}
