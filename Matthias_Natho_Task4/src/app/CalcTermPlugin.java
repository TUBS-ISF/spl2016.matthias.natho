package app;

import framework.*;
import properties.PropertyManager;

public class CalcTermPlugin implements TerminalPlugin{

	@Override
	public void rechne(String gleichung) {
		int ergebnis = 0;
		MathRueckgabe bestandteile = Hilfsmethoden.stringAuslesen(gleichung);
		try{
		switch (bestandteile.getTyp()) {
		case Plus : ergebnis = MathematischeFunktionen.addieren(bestandteile.getZahlEins(), bestandteile.getZahlZwei());
					break;
		case Minus : 	ergebnis = MathematischeFunktionen.subtrahieren(bestandteile.getZahlEins(), bestandteile.getZahlZwei());
					break;
		case Mal :	if(PropertyManager.getProperty("Multiplikation")){
						ergebnis = MathematischeFunktionen.multiplizieren(bestandteile.getZahlEins(), bestandteile.getZahlZwei());
					}else{
						System.err.println("Feature Multiplikation nicht aktiviert !");
					}
					break;
		case Geteilt :	if(PropertyManager.getProperty("Multiplikation")){
						ergebnis = MathematischeFunktionen.dividieren(bestandteile.getZahlEins(), bestandteile.getZahlZwei());
						} else{
							System.out.println("Feature Division nicht aktiviert !");
						}
					break;
		default: 	System.err.println("Keine Eingabe erkannt !");
						return;
		}
		System.out.println("Ergebnis ist: " + ergebnis);
		} catch(UnsupportedFeatureException exp){
			System.err.println(exp.getMessage());
		}
		
	}

	@Override
	public boolean divisionIsActive() {
		// TODO Auto-generated method stub
		if(PropertyManager.getProperty("Division")){
			return true;
		}else{
			return false;
		}
	}

	@Override
	public boolean multiplicationIsActive() {
		// TODO Auto-generated method stub
		if(PropertyManager.getProperty("Multiplikation")){
			return true;
		}else{
			return false;
		}
	}

}
