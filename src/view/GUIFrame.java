package view;

import javax.swing.JFrame;

import controller.GUIController;

/**
 * Framework for GUI Frame class.
 * @author Mikel North
 * @version 1.3 10/22/13
 */
public class GUIFrame extends JFrame
{
	/**
	 * The controller object that will be share across the application
	 */
	private GUIController baseController;
	/**
	 * The main panel for the application
	 */
	private GUIPanel basePanel;
	
	public GUIFrame(GUIController baseController)
	{
		this.baseController = baseController;
		basePanel = new GUIPanel(baseController);
		
		setupFrame();
	}
	
	/**
	 * Helper method to setup the default size and panel of the frame.
	 */
	private void setupFrame()
	{
		this.setContentPane(basePanel);
		this.setSize(500, 500);
		this.setVisible(true);
	}
}
