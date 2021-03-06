import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;

import java.awt.BorderLayout;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class GUI {

	private JFrame frame;
	private JTextField textField;
	private int zahlEins;
	private int zahlZwei;
	private MathOps operation;
	JButton buttonMulti;
	JButton buttonDivi;
	JButton buttonExpon;
	JButton buttonUmrechn;

	/**
	 * Create the application.
	 */
	public GUI() {
		initialize();
		zahlEins = 0;
		zahlZwei = 0;
		operation = MathOps.Fehler;
	}
	
	public void starteGui(){
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GUI window = new GUI();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Initialize the contents of the frame.
	 */
	void initialize() {
		frame = new JFrame();
		frame.setResizable(false);
		frame.setBounds(100, 100, 556, 325);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(38, 6, 481, 57);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JButton btnNewButton = new JButton("=");
		btnNewButton.addActionListener(new GleichListener());
		btnNewButton.setBounds(444, 75, 75, 29);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnC = new JButton("C");
		btnC.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText("");
			}
		});
		btnC.setBounds(337, 75, 75, 29);
		frame.getContentPane().add(btnC);
		
		JButton button_1 = new JButton("+");
		button_1.setBounds(444, 118, 75, 29);
		frame.getContentPane().add(button_1);
		button_1.addActionListener(new MathOpsListener());
		
		JButton button_2 = new JButton("-");
		button_2.setBounds(444, 159, 75, 29);
		frame.getContentPane().add(button_2);
		button_2.addActionListener(new MathOpsListener());
		
		JButton btnNewButton_4 = new JButton("x^y");
		btnNewButton_4.addActionListener(new MathOpsListener());
		btnNewButton_4.setBounds(250, 75, 75, 29);
		buttonExpon = btnNewButton_4;
		frame.getContentPane().add(btnNewButton_4);
		buttonExpon.setEnabled(false);
		
		JButton btnTobin = new JButton("ToBin");
		btnTobin.setBounds(163, 75, 75, 29);
		buttonUmrechn = btnTobin;
		frame.getContentPane().add(btnTobin);
		btnTobin.addActionListener(new MathOpsListener());
		buttonUmrechn.setEnabled(false);
		
		JButton button = new JButton("*");
		button.setBounds(444, 200, 75, 29);
		buttonMulti = button;
		frame.getContentPane().add(button);
		button.addActionListener(new MathOpsListener());
		// Hier anpassen, wenn Feature Multiplikation aktiv !!
			button.setEnabled(false);
		
		
		JButton button_3 = new JButton("/");
		button_3.setBackground(Color.ORANGE);
		button_3.setBounds(444, 241, 75, 29);
		buttonDivi = button_3;
		frame.getContentPane().add(button_3);
		button_3.addActionListener(new MathOpsListener());
		// Feature Divison aktiv -> anpassen !
			button_3.setEnabled(false);
		
		
		JButton btnNewButton_1 = new JButton("1");
		btnNewButton_1.setBounds(163, 200, 75, 29);
		frame.getContentPane().add(btnNewButton_1);
		btnNewButton_1.addActionListener(new NumberListener());
		
		JButton btnNewButton_2 = new JButton("2");
		btnNewButton_2.setBounds(250, 200, 75, 29);
		frame.getContentPane().add(btnNewButton_2);
		btnNewButton_2.addActionListener(new NumberListener());
		
		JButton button_4 = new JButton("3");
		button_4.setBounds(337, 200, 75, 29);
		frame.getContentPane().add(button_4);
		button_4.addActionListener(new NumberListener());
		
		JButton button_5 = new JButton("4");
		button_5.setBounds(163, 159, 75, 29);
		frame.getContentPane().add(button_5);
		button_5.addActionListener(new NumberListener());
		
		JButton btnNewButton_3 = new JButton("0");
		btnNewButton_3.setBounds(170, 241, 242, 29);
		frame.getContentPane().add(btnNewButton_3);
		btnNewButton_3.addActionListener(new NumberListener());
		
		JButton button_6 = new JButton("5");
		button_6.setBounds(250, 159, 75, 29);
		frame.getContentPane().add(button_6);
		button_6.addActionListener(new NumberListener());
		
		JButton button_7 = new JButton("6");
		button_7.setBounds(337, 159, 75, 29);
		frame.getContentPane().add(button_7);
		button_7.addActionListener(new NumberListener());
		
		JButton button_8 = new JButton("7");
		button_8.setBounds(163, 118, 75, 29);
		frame.getContentPane().add(button_8);
		button_8.addActionListener(new NumberListener());
		
		JButton button_9 = new JButton("8");
		button_9.setBounds(250, 118, 75, 29);
		frame.getContentPane().add(button_9);
		button_9.addActionListener(new NumberListener());
		
		JButton button_10 = new JButton("9");
		button_10.setBounds(337, 118, 75, 29);
		frame.getContentPane().add(button_10);
		button_10.addActionListener(new NumberListener());
	}
	
	class NumberListener implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent e) {
			JButton temp = (JButton) e.getSource();
			textField.setText(textField.getText() + temp.getText());
		}
		
	}
	
	class MathOpsListener implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent e) {
			JButton temp = (JButton) e.getSource();
			zahlEins = new Integer(textField.getText());
			operation = Hilfsmethoden.castStringToEnum(temp.getText());
			textField.setText("");
			// Zahlenformat umrechnen hat nur einen Parameter, deshalb hier bereits rechnen !
			if(operation == MathOps.Format){
				rechnen();
			}
		}
		
	}
	
	class GleichListener implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent e) {
			if(operation != MathOps.Fehler){
				zahlZwei = new Integer(textField.getText());
				rechnen();
			} else{
				textField.setText("Fehler: bitte Rechenart auswählen !");
				try {
					Thread.sleep(2000);
				} catch (InterruptedException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				textField.setText("");
			}
			
		}
		
	}
	
	private int rechnen(){
		int ergebnis = 0;
		MathematischeFunktionen Rechner = new MathematischeFunktionen();
		try{
			System.out.println("Rechnen aufgerufen: Operation: "+ operation);
			switch (operation) {
			case Plus : textField.setText("" + Rechner.addieren(zahlEins, zahlZwei));
						break;
			case Minus : textField.setText("" + Rechner.subtrahieren(zahlEins, zahlZwei));
						break;
			case Mal :	textField.setText("" + Rechner.multiplizieren(zahlEins, zahlZwei));
						break;
			case Geteilt :	textField.setText("" + Rechner.dividieren(zahlEins, zahlZwei));
						break;
			case Exponent : textField.setText("" + Rechner.potenz(zahlEins, zahlZwei) );
						break;
			case Format : textField.setText("" + Rechner.formatUmrech(zahlEins) );
						break;
			default: 	System.err.println("Keine Eingabe erkannt !");
						
			}
			return ergebnis;
			} catch(UnsupportedFeatureException exp){
				System.err.println(exp.getMessage());
				textField.setText(exp.getMessage());
			}
		return ergebnis;
	}
	
	public static void main(String[] args){
		new GUI().starteGui();
	}
}
