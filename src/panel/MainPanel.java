package panel;

import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JPanel;

import pojo.GameData;

public class MainPanel extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public JFrame frame = null;
	private ArrayList<JPanel> panels = null;
	private ArrayList<GameData> gameData = null;

	public void  intializePanel() {

		frame = new JFrame();
		frame.setBounds(0, 0, 442, 520);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		panels = new ArrayList<JPanel>();
		gameData = new ArrayList<GameData>();
		
		
		
		GeneralPanel generalPanel = new GeneralPanel(panels,gameData);
		JPanel panel1 = generalPanel.getPanel();
		panel1.setVisible(true);
		panels.add(panel1);
		frame.getContentPane().add(panel1);
		
		frame.setVisible(true);

	}

}
