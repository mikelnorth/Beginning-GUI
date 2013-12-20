package controller;

import view.GUIFrame;

public class GUIController
{
	private GUIFrame appFrame;
	
	public GUIController()
	{
		
	}
	
	public void start()
	{
		appFrame = new GUIFrame(this);
	}
}
