package app;

public class App {

	public static void main(String[] args){
		CalculatorPlugin calc = new CalculatorPlugin();
		System.out.println("MultiIsActivve: " + calc.getMultiplicationActive());
		framework.GUI test = new framework.GUI(calc);
		test.starteGui();
	}
}
