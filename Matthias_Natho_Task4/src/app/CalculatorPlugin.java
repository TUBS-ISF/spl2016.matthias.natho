package app;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import framework.GUI;
import framework.MathOps;
import framework.MathematischeFunktionen;
import framework.UnsupportedFeatureException;
import properties.PropertyManager;

public class CalculatorPlugin implements framework.GUIPlugin {

	private framework.GUI application;
	
	class GleichListener implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent e) {
			if(application.getOperation() != framework.MathOps.Fehler){
				application.setZahlZwei(new Integer(application.getTextField().getText()));
				rechnen();
			} else{
				application.getTextField().setText("Fehler: bitte Rechenart auswählen !");
				try {
					Thread.sleep(2000);
				} catch (InterruptedException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				application.getTextField().setText("");
			}
			
		}
		
	}
	
	@Override
	public boolean getMultiplicationActive() {
		// TODO Auto-generated method stub
		if(PropertyManager.getProperty("Multiplikation")){
			return true;
		}else{
			return false;
		}
	}

	@Override
	public boolean getDivionActive() {
		// TODO Auto-generated method stub
		if(PropertyManager.getProperty("Division")){
			return true;
		}else{
			return false;
		}
	}

	@Override
	public ActionListener getGleichListener() {
		// TODO Auto-generated method stub
		return new GleichListener();
	}

	@Override
	public void setGui(GUI gui) {
		// TODO Auto-generated method stub
		application = gui;
	}

	private int rechnen(){
		int ergebnis = 0;
		try{
			switch (application.getOperation()) {
			case Plus : application.getTextField().setText("" + MathematischeFunktionen.addieren(application.getZahlEins(), application.getZahlZwei()));
						break;
			case Minus : application.getTextField().setText("" + MathematischeFunktionen.subtrahieren(application.getZahlEins(), application.getZahlZwei()));
						break;
			case Mal :	application.getTextField().setText("" + MathematischeFunktionen.multiplizieren(application.getZahlEins(), application.getZahlZwei()));
						break;
			case Geteilt :	application.getTextField().setText("" + MathematischeFunktionen.dividieren(application.getZahlEins(), application.getZahlZwei()));
						break;
			default: 	System.err.println("Keine Eingabe erkannt !");
						
			}
			return ergebnis;
			} catch(UnsupportedFeatureException exp){
				System.err.println(exp.getMessage());
				application.getTextField().setText(exp.getMessage());
			}
		return ergebnis;
	}
}
