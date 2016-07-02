package app;
public   class  MathematischeFunktionen {
	
	
	public  int addieren(int zahlEins, int zahlZwei) throws UnsupportedFeatureException{
			return zahlEins + zahlZwei;
	}

	

	public  int subtrahieren(int zahlEins, int zahlZwei) throws UnsupportedFeatureException{
			return zahlEins - zahlZwei;
	}

		
	
	public int multiplizieren  (int zahlEins, int zahlZwei) {
			return zahlEins * zahlZwei;	
	}

	
	
	public int dividieren  (int zahlEins, int zahlZwei){
			return zahlEins / zahlZwei;		
	}

	
	
	public int potenz  (int zahlEins, int zahlZwei) throws UnsupportedFeatureException{
		return (int) Math.pow((double)zahlEins, (double)zahlZwei);
	}

		
	
	public String formatUmrech  (int zahlEins) throws UnsupportedFeatureException{
		return Integer.toBinaryString(zahlEins);	
	}


}
