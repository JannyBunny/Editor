package de.hsfulda.ai.prog2.editor;
import javax.swing.*;
import java.io.FileReader;
import java.io.IOException;
import java.awt.event.KeyEvent;
import java.awt.BorderLayout;
import java.awt.Container;
//import java.awt.TextArea;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class MeinEditor implements ActionListener {

	/**
	 * 
	 */
	
	private JFrame fenster;
	//private String datei;
	//private JFileChooser dateioeffnen = new JFileChooser();//�ffnen FileChooser erzeugen
	private JTextArea textarea;
	private FileReader reader = null;
	private JLabel label;
	public MeinEditor() {
		super();
		// Von hier Fenster erzeugen
		fensterErzeugen();
		//
	}
	
	private void fensterErzeugen() {
		//Top Level Fenster erstellen
		fenster = new JFrame("Texteditor");
		
		//Content Pane Zugang
		Container ContentPane = fenster.getContentPane();
		
		//menue erzeugen f�r Fenster
		menueErzeugen(fenster);
		
		//textarea erzeugen
		 textarea = new JTextArea("2 Do: Code! Pls no Bugs!",10,10);
		
		//textarea hinzuf�gen
		ContentPane.add(textarea);
		
		//label erzeugen von JLabel
		label = new JLabel("");
		//label zur ContentPane hinzuf�gen
		ContentPane.add(label,BorderLayout.SOUTH);
		
		//Symbolleiste einf�gen
		symbolleisteErzeugen(fenster,ContentPane);
		//Fenstergr��e anpassen
		fenster.pack();
		
		//Fenster sichtbar machen.
		fenster.setVisible(true);
		
		//Schlie�t das Programm, wenn das Fenster geschlossen wird.
		fenster.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}

	private void symbolleisteErzeugen(JFrame fenster, Container ContentPane) {
		JPanel symbolleiste = new JPanel();
		
		//Kopieren Knopf
		ImageIcon copyIcon = new ImageIcon("copy-icon.png");
		JButton copybutton = new JButton(copyIcon);
		symbolleiste.add(copybutton);
		copybutton.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e)
			{
				textKopieren();
			}
		});
		
		//einf�gen Knopf
		ImageIcon pasteIcon = new ImageIcon("paste-icon.png");
		JButton pastebutton = new JButton(pasteIcon);
		symbolleiste.add(pastebutton);
		pastebutton.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e)
			{
				textEinfuegen();
			}
		});
		
		//Ausschneiden Knopf
		ImageIcon cutIcon = new ImageIcon("cut-icon.png");
		JButton cutbutton = new JButton(cutIcon);
		symbolleiste.add(cutbutton);
		cutbutton.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e)
			{
				textAusschneiden();
			}
		});
		
		//Auf die Content Pane mit dir!
		ContentPane.add(symbolleiste,BorderLayout.NORTH);	
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
		hilfemenue.setMnemonic(KeyEvent.VK_H);
		
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
		formatmenue.setMnemonic(KeyEvent.VK_F);
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
		bearbeitenmenue.setMnemonic(KeyEvent.VK_B);
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
		
		//kopieren
		JMenuItem kopieren = new JMenuItem("Kopieren",'C');	
		kopieren.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_C, ActionEvent.CTRL_MASK));
		kopieren.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e)
			{
				textKopieren();
			}
		});
		//beenden meneue hinzuf�gen
		bearbeitenmenue.add(kopieren);
		kopieren.setMnemonic(KeyEvent.VK_C);
		
		//ausschneiden
		JMenuItem ausschneiden = new JMenuItem("Ausschneiden",'A');	
		ausschneiden.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_X, ActionEvent.CTRL_MASK));
		ausschneiden.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e)
			{
				textAusschneiden();
			}
		});
		//ausschneiden meneue hinzuf�gen
		bearbeitenmenue.add(ausschneiden);
		ausschneiden.setMnemonic(KeyEvent.VK_X);
		
		//einf�gen
		JMenuItem einfuegen = new JMenuItem("Einf�gen",'V');	
		einfuegen.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_V, ActionEvent.CTRL_MASK));
		einfuegen.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e)
			{
				textEinfuegen();
			}
		});
		//einfuegen meneue hinzuf�gen
		bearbeitenmenue.add(einfuegen);
		einfuegen.setMnemonic(KeyEvent.VK_V);
		

		bearbeitenmenue.addSeparator();
		//suchen/ersetzen
		JMenuItem suchenersetzen = new JMenuItem("Suchen und Ersetzen",'S');	
		suchenersetzen.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_F, ActionEvent.CTRL_MASK));
		//beenden meneue hinzuf�gen
		bearbeitenmenue.add(suchenersetzen);
		
	}

	protected void textEinfuegen() {
		label.setText("f�ge ein...");
		textarea.paste();
		//System.out.println("nix einf�gen");
		
	}

	protected void textKopieren() {
		label.setText("kopiere...");
		textarea.copy();
		//System.out.println("nix kopieren");
		
	}

	protected void textAusschneiden() {
		label.setText("schneide aus...");
		textarea.cut();
		textarea.setText("");
		//System.out.println("nix ausschneiden");
		
	}

	private void dateiMenueErzeugen(JMenuBar menuezeile) {
		//Dateimenue erzeigen
		JMenu dateimenue = new JMenu("Datei");
		dateimenue.setMnemonic(KeyEvent.VK_D);
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
		OeffnenActionListener oal = new OeffnenActionListener();	
		oeffnen.addActionListener(oal);
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
		beenden.addActionListener(new ActionListener() {
			public void actionPerformed (ActionEvent e) {
				label.setText("beende...");
				beenden();
			}
		});
		
	}
	
	private class OeffnenActionListener implements ActionListener
	{

		public void actionPerformed(ActionEvent e){
			oeffneDatei();
						
		}

		private void oeffneDatei() {
			try {
				reader=new FileReader("textdoc.txt");
				textarea.read(reader, "textdoc.txt");				
			}
			catch(IOException exception) {
				System.err.println("Hoppala! Das hat nicht geklappt");
				exception.printStackTrace();
			}
			finally {
				if (reader != null ) {
					try {
						reader.close();
					}
					catch (IOException exception) {
						System.err.println("Reader schlie�en geht auch nicht");
						exception.printStackTrace();
					}
				}
			}
			
			
		}
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
	
	private void beenden()
	{
		System.exit(0);
	}
	public static void main(String[] args) {
		//MeinEditor e = 
		new MeinEditor();

	}





}
