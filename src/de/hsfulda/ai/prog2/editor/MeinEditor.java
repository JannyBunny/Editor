package de.hsfulda.ai.prog2.editor;
import javax.swing.*;
import java.awt.event.KeyEvent;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.event.ActionEvent;


public class MeinEditor {

	/**
	 * 
	 */
	public MeinEditor() {
		super();
		// Von hier Fenster erzeugen
		fensterErzeugen();
	}

	private void fensterErzeugen() {
		//Top Level Fenster erstellen
		JFrame fenster = new JFrame("Texteditor");
		
		//Content Pane Zugang
		Container ContentPane = fenster.getContentPane();
		
		//menue erzeugen f�r Fenster
		menueErzeugen(fenster);
		
		//textarea erzeugen
		JTextArea textarea = new JTextArea("2 Do: Code!",10,10);
		
		//textarea hinzuf�gen
		ContentPane.add(textarea);
		
		//label erzeugen von JLabel
		JLabel label = new JLabel("Dies ist eine Erkl�rung");
		//label zur ContentPane hinzuf�gen
		ContentPane.add(label,BorderLayout.SOUTH);
		
		//Fenstergr��e anpassen
		fenster.pack();
		
		//Fenster sichtbar machen.
		fenster.setVisible(true);
		
		//Schlie�t das Programm, wenn das Fenster geschlossen wird.
		fenster.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
	}

	private void menueErzeugen(JFrame fenster) {
		//Men�bar hinzuf�gen
		JMenuBar menuezeile = new JMenuBar();
		//Fenster menuezeile als Menu zuweisen
		fenster.setJMenuBar(menuezeile);
		
		//Datei Men� erzeugen
		dateiMenueErzeugen(menuezeile);
		//Bearbeiten Men� erzeugen
		bearbeitenmenueErzeugen(menuezeile);
		//Format Men� erzeugen		
		formatMenueErzeugen(menuezeile);
		//Hilfe Men� erzeugen
		hilfeMenueErzeugen(menuezeile);			
		
	}

	private void hilfeMenueErzeugen(JMenuBar menuezeile) {
		//Hilfe erzeugen
		JMenu hilfemenue = new JMenu("Hilfe");
		
		//Hilfe hinzuf�gen
		menuezeile.add(hilfemenue);
		//Hilfe anzeigen erzeugen
		JMenuItem hilfeanzeigen = new JMenuItem("Hilfe Anzeigen",'H');
		hilfeanzeigen.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_F1, ActionEvent.CTRL_MASK));
		//Hilfe anzeigen hinzuf�gen
		hilfemenue.add(hilfeanzeigen);
		hilfeanzeigen.setMnemonic(KeyEvent.VK_H);
		hilfemenue.addSeparator();
		//Info erzeugen
		JMenuItem info = new JMenuItem("Info",'I');		
		//Info hinzuf�gen
		hilfemenue.add(info);
		
	}

	private void formatMenueErzeugen(JMenuBar menuezeile) {
		//Format erzeigen
		JMenu formatmenue = new JMenu("Format");
		//Format hinzuf�gen
		menuezeile.add(formatmenue);
		//suchen/ersetzen
		JMenuItem schriftart = new JMenuItem("Schriftart");		
		//beenden meneue hinzuf�gen
		formatmenue.add(schriftart);
		
	}

	private void bearbeitenmenueErzeugen(JMenuBar menuezeile) {
		//Bearbeiten erzeigen
		JMenu bearbeitenmenue = new JMenu("Bearbeiten");
		//Bearbeiten hinzuf�gen
		menuezeile.add(bearbeitenmenue);
		//Beenden menue erzeugen
		JMenuItem rueckgaengig = new JMenuItem("R�ckg�ngig",'R');
		rueckgaengig.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_R, ActionEvent.CTRL_MASK));
		//beenden meneue hinzuf�gen
		bearbeitenmenue.add(rueckgaengig);
		rueckgaengig.setMnemonic(KeyEvent.VK_R);
		//Beenden menue erzeugen
		JMenuItem wiederholen = new JMenuItem("Wiederholen",'W');
		wiederholen.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_W, ActionEvent.CTRL_MASK));
		//beenden meneue hinzuf�gen
		bearbeitenmenue.add(wiederholen);
		wiederholen.setMnemonic(KeyEvent.VK_W);
		//ausschneiden
		JMenuItem ausschneiden = new JMenuItem("Ausschneiden",'A');	
		ausschneiden.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_X, ActionEvent.CTRL_MASK));
		//beenden meneue hinzuf�gen
		bearbeitenmenue.add(ausschneiden);
		ausschneiden.setMnemonic(KeyEvent.VK_X);
		bearbeitenmenue.addSeparator();
		//suchen/ersetzen
		JMenuItem suchenersetzen = new JMenuItem("Suchen und Ersetzen",'S');	
		suchenersetzen.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_F, ActionEvent.CTRL_MASK));
		//beenden meneue hinzuf�gen
		bearbeitenmenue.add(suchenersetzen);
		
	}

	private void dateiMenueErzeugen(JMenuBar menuezeile) {
		//Dateimenue erzeigen
		JMenu dateimenue = new JMenu("Datei");
		//Dateimenue hinzuf�gen
		menuezeile.add(dateimenue);
				
		//Neu menue erzeugen
		JMenuItem neu = new JMenuItem("Neu",'N');
		neu.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_N, ActionEvent.CTRL_MASK));
		//Neu meneue hinzuf�gen
		dateimenue.add(neu);
		neu.setMnemonic(KeyEvent.VK_N);
		//oeffnen menue erzeugen
		JMenuItem oeffnen = new JMenuItem("�ffnen",'O');
		oeffnen.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_O, ActionEvent.CTRL_MASK));
		//oeffnen meneue hinzuf�gen
		dateimenue.add(oeffnen);
		oeffnen.setMnemonic(KeyEvent.VK_O);
		dateimenue.addSeparator();
		//Speichern menue erzeugen
		JMenuItem speichern = new JMenuItem("Speichern",'S');
		speichern.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, ActionEvent.CTRL_MASK));
		//speichern meneue hinzuf�gen
		dateimenue.add(speichern);
		speichern.setMnemonic(KeyEvent.VK_S);
		//Speichern unter menue erzeugen
		JMenuItem speichernunter = new JMenuItem("Speichern unter");
		//speichern unter meneue hinzuf�gen
		dateimenue.add(speichernunter);
		dateimenue.addSeparator();
		//Schliessen menue erzeugen
		JMenuItem schliessen = new JMenuItem("Schlie�en",'C');		
		//schliessen meneue hinzuf�gen
		dateimenue.add(schliessen);
		//Beenden menue erzeugen
		JMenuItem beenden = new JMenuItem("Beenden");		
		//beenden meneue hinzuf�gen
		dateimenue.add(beenden);
		
	}

	public static void main(String[] args) {
		//MeinEditor e = 
		new MeinEditor();

	}

}
