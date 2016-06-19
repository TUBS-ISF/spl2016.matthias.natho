
public class MathematischeFunktionen {
	
	public static int addieren(int zahlEins, int zahlZwei) throws UnsupportedFeatureException{
			return zahlEins + zahlZwei;
	}

	public static int subtrahieren(int zahlEins, int zahlZwei) throws UnsupportedFeatureException{
			return zahlEins - zahlZwei;
	}
	
	public static int multiplizieren(int zahlEins, int zahlZwei) throws UnsupportedFeatureException{
		/*if(PropertyManager.getProperty("Multiplikation")){
			return zahlEins * zahlZwei;
		}else{*/
			throw new UnsupportedFeatureException("Multiplikation");
		//}
	}
	
	public static int dividieren(int zahlEins, int zahlZwei) throws UnsupportedFeatureException{
		/*if(PropertyManager.getProperty("Division")){
			return zahlEins / zahlZwei;
		}else{*/
			throw new UnsupportedFeatureException("Division");
		//}
	}
}
