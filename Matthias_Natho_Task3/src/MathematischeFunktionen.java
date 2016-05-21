public class MathematischeFunktionen {
	
	public static int addieren(int zahlEins, int zahlZwei) throws UnsupportedFeatureException{
			return zahlEins + zahlZwei;
	}

	public static int subtrahieren(int zahlEins, int zahlZwei) throws UnsupportedFeatureException{
			return zahlEins - zahlZwei;	
	}
	
	public static int multiplizieren(int zahlEins, int zahlZwei) throws UnsupportedFeatureException{
		
		//#if Multiplikation
//@			return zahlEins * zahlZwei;
		//#else
			throw new UnsupportedFeatureException("Multiplikation");
		//#endif
	}
	
	public static int dividieren(int zahlEins, int zahlZwei) throws UnsupportedFeatureException{
		
		//#if Division
//@			return zahlEins / zahlZwei;
		//#else
			throw new UnsupportedFeatureException("Division");
		//#endif
		
	}
}
