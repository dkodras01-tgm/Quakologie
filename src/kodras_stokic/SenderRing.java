package kodras_stokic;

import java.util.ArrayList;

/**
 * Klasse fuer Senderring
 * 
 * @author Dominik Kodras
 * @author Stefan Stokic
 */
public class SenderRing implements QuakBeobachtungsSubjekt {

	private ArrayList<Beobachter> beobachter = new ArrayList<Beobachter>();
	private QuakBeobachtungsSubjekt ente;
	
	/**
	 * Konstruktor setzt die Ente als Beobachtungssubjekt
	 * 
	 * @param ente
	 */
	public SenderRing(QuakBeobachtungsSubjekt ente) {
		
		this.ente = ente;
	}
	
	/**
	 * Registriert Beobachter
	 */
	public void registriereBeobachter(Beobachter beobachter) {

		this.beobachter.add(beobachter);
	}

	/**
	 * Benachrichtigt Beobachter
	 */
	public void benachrichtigeBeobachtende() {

		for(Beobachter beobachter : this.beobachter)
			beobachter.aktualisieren(ente);
	}
}