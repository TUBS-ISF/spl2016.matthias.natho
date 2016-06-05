package app;

import properties.PropertyManager;

public class App {

	public static void main(String[] args){
		
		if(PropertyManager.getProperty("Basis")){
			CalculatorPlugin calc = new CalculatorPlugin();
			System.out.println("MultiIsActivve: " + calc.getMultiplicationActive());
			framework.GUI gui = new framework.GUI(calc);
			calc.setGui(gui);
			gui.starteGui();
		}else if(PropertyManager.getProperty("Terminal")){
			CalcTermPlugin terminalplugin = new CalcTermPlugin();
			new framework.Terminal(terminalplugin).terminalInterfacestarten();
		}
	}
}
