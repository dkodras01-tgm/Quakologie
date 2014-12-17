package kodras_stokic;

/**
 * Adapter fuer Gans
 * 
 * @author Dominik Kodras
 * @author Stefan Stokic
 */
public class GansAdapter implements Quakfaehig {

	private Gans gans;
	private SenderRing senderring;

	/**
	 * Konstruktor
	 * 
	 * @param gans
	 */
	public GansAdapter(Gans gans) {

		this.gans = gans;
		senderring = new SenderRing(this);
	}

	/**
	 * Ruft schnattern auf und benachrichtigt die Beobachtenden
	 */
	public void quaken() {

		gans.schnattern();
		benachrichtigeBeobachtende();
	}

	/**
	 * Registriert einen Beobachter
	 * 
	 * @param beobachter ist ein neuer Beobachter
	 */
	public void registriereBeobachter(Beobachter beobachter) {

		senderring.registriereBeobachter(beobachter);
	}

	/**
	 * Benachrichtigt die Beobachter
	 */
	public void benachrichtigeBeobachtende() {

		senderring.benachrichtigeBeobachtende();
	}

	/**
	 * Gibt einen sich identifizierenden String aus
	 */
	public String toString() {
		
		return "Sich als Ente ausgebende Gans(GansAdapter)";
	}
}