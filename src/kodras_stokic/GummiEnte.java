package kodras_stokic;

/**
 * Klasse stellt eine Gummiente dar
 * 
 * @author Dominik Kodras
 * @author Stefan Stokic
 */
public class GummiEnte implements Quakfaehig {

	private SenderRing senderring;

	/**
	 * Konstruktor, fuegt neuen Senderring hinzu
	 */
	public GummiEnte() {

		senderring = new SenderRing(this);
	}

	/**
	 * Gibt Quaken aus und benachrichtigt Beobachter
	 */
	public void quaken() {

		System.out.println("Squeak");
		benachrichtigeBeobachtende();
	}

	/**
	 * Registriert Beobachter
	 * 
	 * @param beobachter
	 */
	public void registriereBeobachter(Beobachter beobachter) {

		senderring.registriereBeobachter(beobachter);
	}

	/**
	 * Benachrichtigt Beobachter
	 */
	public void benachrichtigeBeobachtende() {

		senderring.benachrichtigeBeobachtende();
	}
	
	/**
	 * Gibt den String GummiEnte zurueck
	 * 
	 * @return GummiEnte als String
	 */
	public String toString() {
		
		return "GummiEnte";
	}
}