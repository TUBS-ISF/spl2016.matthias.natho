
public class MathematischeFunktionen {
	
	public  int addieren(int zahlEins, int zahlZwei) throws UnsupportedFeatureException{
			return zahlEins + zahlZwei;
	}

	public  int subtrahieren(int zahlEins, int zahlZwei) throws UnsupportedFeatureException{
			return zahlEins - zahlZwei;
	}
	
	public int multiplizieren(int zahlEins, int zahlZwei) throws UnsupportedFeatureException{
		/*if(PropertyManager.getProperty("Multiplikation")){
			return zahlEins * zahlZwei;
		}else{*/
			throw new UnsupportedFeatureException("Multiplikation");
		//}
	}
	
	public  int dividieren(int zahlEins, int zahlZwei) throws UnsupportedFeatureException{
		/*if(PropertyManager.getProperty("Division")){
			return zahlEins / zahlZwei;
		}else{*/
			throw new UnsupportedFeatureException("Division");
		//}
	}
}
