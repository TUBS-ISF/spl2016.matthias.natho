import properties.PropertyManager;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		if(PropertyManager.getProperty("Basis")){
			GUI gui = new GUI();
			gui.starteGui();
		} else if(PropertyManager.getProperty("Terminal")){
			while(true){
				UserInterfaceTerminal terminal = new UserInterfaceTerminal();
				terminal.terminalInterfacestarten();
			}
		} else{
			System.err.println("Fehler, bitte wählen Sie ein UserInterface aus!");
		}
		
	}

}
