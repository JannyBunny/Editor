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
		
		//menue erzeugen für Fenster
		menueErzeugen(fenster);
		
		//textarea erzeugen
		JTextArea textarea = new JTextArea("Textarea!",10,10);
		
		//textarea hinzufügen
		ContentPane.add(textarea);
		
		//label erzeugen von JLabel
		JLabel label = new JLabel("Dies ist eine Erklärung");
		//label zur ContentPane hinzufügen
		ContentPane.add(label,BorderLayout.SOUTH);
		
		//Fenstergröße anpassen
		fenster.pack();
		
		//Fenster sichtbar machen.
		fenster.setVisible(true);
		
		//Schließt das Programm, wenn das Fenster geschlossen wird.
		fenster.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
	}

	private void menueErzeugen(JFrame fenster) {
		//Menübar hinzufügen
		JMenuBar menuezeile = new JMenuBar();
		//Fenster menuezeile als Menu zuweisen
		fenster.setJMenuBar(menuezeile);
		
		//Datei Menü Erzeigen
		dateiMenueErzeugen(menuezeile);
		//Bearbeiten Menü Erzeigen
		bearbeitenmenueErzeigen(menuezeile);
		//Format Menü Erzeigen		
		formatMenueErzeugen(menuezeile);
		//Hilfe Menü Erzeigen
		hilfeMenueErzeigen(menuezeile);			
		
	}

	private void hilfeMenueErzeigen(JMenuBar menuezeile) {
		//Hilfe erzeugen
		JMenu hilfemenue = new JMenu("Hilfe");
		//Hilfe hinzufügen
		menuezeile.add(hilfemenue);
		//Hilfe anzeigen erzeugen
		JMenuItem hilfeanzeigen = new JMenuItem("Hilfe Anzeigen");		
		//Hilfe anzeigen hinzufügen
		hilfemenue.add(hilfeanzeigen);
		//Info erzeugen
		JMenuItem info = new JMenuItem("Info");		
		//Info hinzufügen
		hilfemenue.add(info);
		
	}

	private void formatMenueErzeugen(JMenuBar menuezeile) {
		//Format erzeigen
		JMenu formatmenue = new JMenu("Format");
		//Format hinzufügen
		menuezeile.add(formatmenue);
		//suchen/ersetzen
		JMenuItem schriftart = new JMenuItem("Schriftart");		
		//beenden meneue hinzufügen
		formatmenue.add(schriftart);
		
	}

	private void bearbeitenmenueErzeigen(JMenuBar menuezeile) {
		//Bearbeiten erzeigen
		JMenu bearbeitenmenue = new JMenu("Bearbeiten");
		//Bearbeiten hinzufügen
		menuezeile.add(bearbeitenmenue);
		//Beenden menue erzeugen
		JMenuItem rueckgaengig = new JMenuItem("Rückgängig");		
		//beenden meneue hinzufügen
		bearbeitenmenue.add(rueckgaengig);
		//Beenden menue erzeugen
		JMenuItem wiederholen = new JMenuItem("Wiederholen");		
		//beenden meneue hinzufügen
		bearbeitenmenue.add(wiederholen);
		//ausschneiden
		JMenuItem ausschneiden = new JMenuItem("Ausschneiden");		
		//beenden meneue hinzufügen
		bearbeitenmenue.add(ausschneiden);
		//suchen/ersetzen
		JMenuItem suchenersetzen = new JMenuItem("Suchen und Ersetzen");		
		//beenden meneue hinzufügen
		bearbeitenmenue.add(suchenersetzen);
		
	}

	private void dateiMenueErzeugen(JMenuBar menuezeile) {
		//Dateimenue erzeigen
		JMenu dateimenue = new JMenu("Datei");
		//Dateimenue hinzufügen
		menuezeile.add(dateimenue);
				
		//Neu menue erzeugen
		JMenuItem neu = new JMenuItem("Neu");		
		//Neu meneue hinzufügen
		dateimenue.add(neu);
		//oeffnen menue erzeugen
		JMenuItem oeffnen = new JMenuItem("Öffnen");		
		//oeffnen meneue hinzufügen
		dateimenue.add(oeffnen);
		//Speichern menue erzeugen
		JMenuItem speichern = new JMenuItem("Speichern");		
		//speichern meneue hinzufügen
		dateimenue.add(speichern);
		//Speichern unter menue erzeugen
		JMenuItem speichernunter = new JMenuItem("Speichern unter");
		//speichern unter meneue hinzufügen
		dateimenue.add(speichernunter);
		//Schliessen menue erzeugen
		JMenuItem schliessen = new JMenuItem("Schließen");		
		//schliessen meneue hinzufügen
		dateimenue.add(schliessen);
		//Beenden menue erzeugen
		JMenuItem beenden = new JMenuItem("Beenden");		
		//beenden meneue hinzufügen
		dateimenue.add(beenden);
		
	}

	public static void main(String[] args) {
		//MeinEditor e = 
		new MeinEditor();

	}

}
