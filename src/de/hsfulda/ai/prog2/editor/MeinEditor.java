package de.hsfulda.ai.prog2.editor;
import javax.swing.*;

import java.awt.BorderLayout;
import java.awt.Container;


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
		JTextArea textarea = new JTextArea("Textarea!",10,10);
		
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
		
		//Datei Men� Erzeigen
		dateiMenueErzeugen(menuezeile);
		//Bearbeiten Men� Erzeigen
		bearbeitenmenueErzeigen(menuezeile);
		//Format Men� Erzeigen		
		formatMenueErzeugen(menuezeile);
		//Hilfe Men� Erzeigen
		hilfeMenueErzeigen(menuezeile);			
		
	}

	private void hilfeMenueErzeigen(JMenuBar menuezeile) {
		//Hilfe erzeugen
		JMenu hilfemenue = new JMenu("Hilfe");
		//Hilfe hinzuf�gen
		menuezeile.add(hilfemenue);
		//Hilfe anzeigen erzeugen
		JMenuItem hilfeanzeigen = new JMenuItem("Hilfe Anzeigen");		
		//Hilfe anzeigen hinzuf�gen
		hilfemenue.add(hilfeanzeigen);
		//Info erzeugen
		JMenuItem info = new JMenuItem("Info");		
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

	private void bearbeitenmenueErzeigen(JMenuBar menuezeile) {
		//Bearbeiten erzeigen
		JMenu bearbeitenmenue = new JMenu("Bearbeiten");
		//Bearbeiten hinzuf�gen
		menuezeile.add(bearbeitenmenue);
		//Beenden menue erzeugen
		JMenuItem rueckgaengig = new JMenuItem("R�ckg�ngig");		
		//beenden meneue hinzuf�gen
		bearbeitenmenue.add(rueckgaengig);
		//Beenden menue erzeugen
		JMenuItem wiederholen = new JMenuItem("Wiederholen");		
		//beenden meneue hinzuf�gen
		bearbeitenmenue.add(wiederholen);
		//ausschneiden
		JMenuItem ausschneiden = new JMenuItem("Ausschneiden");		
		//beenden meneue hinzuf�gen
		bearbeitenmenue.add(ausschneiden);
		//suchen/ersetzen
		JMenuItem suchenersetzen = new JMenuItem("Suchen und Ersetzen");		
		//beenden meneue hinzuf�gen
		bearbeitenmenue.add(suchenersetzen);
		
	}

	private void dateiMenueErzeugen(JMenuBar menuezeile) {
		//Dateimenue erzeigen
		JMenu dateimenue = new JMenu("Datei");
		//Dateimenue hinzuf�gen
		menuezeile.add(dateimenue);
				
		//Neu menue erzeugen
		JMenuItem neu = new JMenuItem("Neu");		
		//Neu meneue hinzuf�gen
		dateimenue.add(neu);
		//oeffnen menue erzeugen
		JMenuItem oeffnen = new JMenuItem("�ffnen");		
		//oeffnen meneue hinzuf�gen
		dateimenue.add(oeffnen);
		//Speichern menue erzeugen
		JMenuItem speichern = new JMenuItem("Speichern");		
		//speichern meneue hinzuf�gen
		dateimenue.add(speichern);
		//Speichern unter menue erzeugen
		JMenuItem speichernunter = new JMenuItem("Speichern unter");
		//speichern unter meneue hinzuf�gen
		dateimenue.add(speichernunter);
		//Schliessen menue erzeugen
		JMenuItem schliessen = new JMenuItem("Schlie�en");		
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
