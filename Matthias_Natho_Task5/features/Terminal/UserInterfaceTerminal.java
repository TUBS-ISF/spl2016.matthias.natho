import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

import properties.PropertyManager;

public class UserInterfaceTerminal {
	
	public void terminalInterfacestarten(){
		
		System.out.println("Bitte Gleichung eingeben: (Form: x + Y)");
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String input = null;
		try {
			input = in.readLine();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if(input != null){
			int ergebnis = 0;
			MathRueckgabe bestandteile = Hilfsmethoden.stringAuslesen(input);
			MathematischeFunktionen Rechner = new MathematischeFunktionen();
			try{
			switch (bestandteile.getTyp()) {
			case Plus : ergebnis = Rechner.addieren(bestandteile.getZahlEins(), bestandteile.getZahlZwei());
						break;
			case Minus : 	ergebnis = Rechner.subtrahieren(bestandteile.getZahlEins(), bestandteile.getZahlZwei());
						break;
			case Mal :	ergebnis = Rechner.multiplizieren(bestandteile.getZahlEins(), bestandteile.getZahlZwei());
						break;
			case Geteilt :	ergebnis = Rechner.dividieren(bestandteile.getZahlEins(), bestandteile.getZahlZwei());
						break;
			default: 	System.err.println("Keine Eingabe erkannt !");
							return;
			}
			System.out.println("Ergebnis ist: " + ergebnis);
			} catch(UnsupportedFeatureException exp){
				System.err.println(exp.getMessage());
			}
			
		}else{
			System.err.println("Keine Eingabe erkannt !");
			return;
		}
	}

}