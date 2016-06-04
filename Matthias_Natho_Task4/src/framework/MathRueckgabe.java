package framework;

public class MathRueckgabe {
	
	private int zahlEins;
	private int zahlZwei;
	private MathOps typ;
	
	public MathRueckgabe(){
		zahlEins = 0;
		zahlZwei = 0;
		typ = MathOps.Fehler;
	}
	
	public MathRueckgabe(int zahleins, int zahlzwei, MathOps typ){
		this.zahlEins = zahleins;
		this.zahlZwei = zahlzwei;
		this.typ = typ;
	}
	
	public int getZahlEins() {
		return zahlEins;
	}

	public int getZahlZwei() {
		return zahlZwei;
	}

	public MathOps getTyp() {
		return typ;
	}

	public void setZahlEins(int zahlEins) {
		this.zahlEins = zahlEins;
	}

	public void setZahlZwei(int zahlZwei) {
		this.zahlZwei = zahlZwei;
	}

	public void setTyp(MathOps typ) {
		this.typ = typ;
	}
}
