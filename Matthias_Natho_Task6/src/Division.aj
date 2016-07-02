import app.MathematischeFunktionen;

public aspect Division {
	
	pointcut dividieren(int zahlEins, int zahlZwei) : execution(int MathematischeFunktionen.divieren(int, int)) && args(zahlEins, zahlZwei);
	
	int around(int zahlEins, int zahlZwei) : dividieren(zahlEins, zahlZwei){
		return zahlEins / zahlZwei;
	}
}