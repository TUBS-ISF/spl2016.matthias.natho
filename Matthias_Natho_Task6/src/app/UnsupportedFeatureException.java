package app;

public  class  UnsupportedFeatureException  extends Exception {
	
	
	UnsupportedFeatureException(){
		super("Dieses Feature ist nicht aktiviert !");
	}

	
	
	UnsupportedFeatureException(String feature){
		super("Das Feature \"" + feature + "\" ist nicht aktiviert !");
	}


}
