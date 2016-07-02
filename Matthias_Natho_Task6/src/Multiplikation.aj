
public aspect Multiplikation {
	
	pointcut multiplizieren(int zahlEins, int zahlZwei) : execution(int MathematischeFunktionen.multiplizieren(int, int)) && args(zahlEins, zahlZwei);
	
	int around(int zahlEins, int zahlZwei) : multiplizieren(zahlEins, zahlZwei){
		return zahlEins * zahlZwei;
	}
}