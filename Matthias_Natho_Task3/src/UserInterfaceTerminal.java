import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

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
			try{
			switch (bestandteile.getTyp()) {
			case Plus : ergebnis = MathematischeFunktionen.addieren(bestandteile.getZahlEins(), bestandteile.getZahlZwei());
						break;
			case Minus : 	ergebnis = MathematischeFunktionen.subtrahieren(bestandteile.getZahlEins(), bestandteile.getZahlZwei());
						break;
			case Mal :	ergebnis = MathematischeFunktionen.multiplizieren(bestandteile.getZahlEins(), bestandteile.getZahlZwei());
						break;
			case Geteilt :	ergebnis = MathematischeFunktionen.dividieren(bestandteile.getZahlEins(), bestandteile.getZahlZwei());
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