import java.util.ArrayList;

public class Hilfsmethoden {
	
	// Gibt die Zahlen (Erstes und Zweites Element der Liste) und die Operation 
	// (Drittes Element) zurück.
	public static MathRueckgabe stringAuslesen(String eingabe){
		MathRueckgabe rueckgabe = new MathRueckgabe();
		String[] bestandteile = eingabe.split(" ");
		try{
		int eins = new Integer(bestandteile[0]);
		int zwei = new Integer(bestandteile[2]);
		rueckgabe.setZahlEins(eins);
		rueckgabe.setZahlZwei(zwei);
		} 	catch(Exception e){
			System.out.println(e.getMessage());
		}
		
		System.out.println("Hilfsmethode aufgerufen: Argument: " + bestandteile[1]);
		switch (bestandteile[1]) {
		case "+" : 	rueckgabe.setTyp(MathOps.Plus);
					break;
		case "-" : 	rueckgabe.setTyp(MathOps.Minus);
					break;
		case "*" :	rueckgabe.setTyp(MathOps.Mal);
					break;
		case "/" :  rueckgabe.setTyp(MathOps.Geteilt);
					break;
		case "x^y" :  rueckgabe.setTyp(MathOps.Exponent);
					break;
		default: 	System.err.println("Keine Eingabe erkannt !");
					break;
		}
		return rueckgabe;
	}
	
	public static MathOps castStringToEnum(String op){
		switch (op) {
			case "+" : 	return MathOps.Plus;
			
			case "-" : 	return MathOps.Minus;
						
			case "*" :	return MathOps.Mal;
						
			case "/" :	return MathOps.Geteilt;
			
			case "x^y" : return MathOps.Exponent;
						
			default: 	return MathOps.Fehler;						
			}
	}
}
