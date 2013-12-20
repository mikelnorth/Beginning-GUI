package view;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.SpringLayout;

import controller.GUIController;
/**
 * 
 * @author Mikel North
 * @version 1.2
 */
public class GUIPanel extends JPanel
{
	
	private GUIController baseController;
	private SpringLayout baseLayout;
	private JButton firstButton;
	private JButton secondButton;
	
	public GUIPanel(GUIController baseController)
	{
		this.baseController = baseController;
		
		baseLayout = new SpringLayout();
		firstButton = new JButton("my first button!!!");
		secondButton = new JButton("wow I made a second button!");
	
		setupPanel();
		setupLayout();
	}
	
	private void setupPanel()
	{
		this.setLayout(baseLayout);
		this.add(firstButton);
		this.add(secondButton);
	}
	
	private void setupLayout()
	{
		baseLayout.putConstraint(SpringLayout.NORTH, firstButton, 31, SpringLayout.NORTH, this);
		baseLayout.putConstraint(SpringLayout.WEST, firstButton, 124, SpringLayout.WEST, this);
		baseLayout.putConstraint(SpringLayout.NORTH, secondButton, 27, SpringLayout.SOUTH, firstButton);
		baseLayout.putConstraint(SpringLayout.WEST, secondButton, 98, SpringLayout.WEST, this);
	}
}
