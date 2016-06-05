package framework;

import java.awt.event.ActionListener;

public interface GUIPlugin {
	
	void setGui(GUI gui);
	boolean getMultiplicationActive();
	boolean getDivionActive();
	ActionListener getGleichListener();

}
