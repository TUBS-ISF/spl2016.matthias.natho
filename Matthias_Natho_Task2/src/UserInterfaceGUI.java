import java.awt.BorderLayout;
import java.awt.event.*;

import javax.swing.*;

public class UserInterfaceGUI {
	
	JFrame frame;
	
	public void starteGui(){
		frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JTextField eingabe = new JTextField();
		frame.add(BorderLayout.NORTH, eingabe);
		
		JTextField ausgabe = new JTextField();
		frame.add(BorderLayout.SOUTH, ausgabe);
		
		JButton Btnergebnis = new JButton("Ergebnis");
		Btnergebnis.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent evt){
				String auslesen = eingabe.getText();
				MathRueckgabe bestandteile = Hilfsmethoden.stringAuslesen(auslesen);
				int ergebnis = 0;
				try{
				switch (bestandteile.getTyp()) {
				case Plus : ergebnis = MathematischeFunktionen.addieren(bestandteile.getZahlEins(), bestandteile.getZahlZwei());
							break;
				case Minus : 	ergebnis = MathematischeFunktionen.subtrahieren(bestandteile.getZahlEins(), bestandteile.getZahlZwei());
							break;
				case Mal :	ergebnis = MathematischeFunktionen.multiplizieren(bestandteile.getZahlEins(), bestandteile.getZahlZwei());
							break;
				case Geteilt :	ergebnis = MathematischeFunktionen.dividieren(bestandteile.getZahlEins(), bestandteile.getZahlZwei());
							break;
				default: 	System.err.println("Keine Eingabe erkannt !");
								return;
				}
				System.out.println("Ergebnis ist: " + ergebnis);
				ausgabe.setText("Ergebnis ist: " + ergebnis);
				} catch (Exception e){
					System.err.println(e.getMessage());
					ausgabe.setText("ERROR: " + e.getMessage());
				}
				
			}
		});
		
		frame.add(BorderLayout.CENTER, Btnergebnis);
		
		frame.setSize(400, 400);
		frame.setVisible(true);
	}
}
