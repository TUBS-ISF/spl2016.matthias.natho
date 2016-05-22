public class App {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//#if Basis
//@			GUI gui = new GUI();
//@			gui.starteGui();
		//#endif
		//#if Terminal
		while(true){
				UserInterfaceTerminal terminal = new UserInterfaceTerminal();
				terminal.terminalInterfacestarten();
		}
		//#endif
	}

}
