package app;

public class App {

	public void appStarten(){
		System.out.println("Starte App");
	}
	
	public static void main(String[] args) {
		// appStarten wird durch entsprechende Aspekte überschrieben !
		new App().appStarten();

	}

}
