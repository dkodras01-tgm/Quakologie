package kodras_stokic;

/**
 * Klasse stellt eine StockEnte dar
 * 
 * @author Dominik Kodras
 * @author Stefan Stokic
 */
public class StockEnte implements Quakfaehig {

	private SenderRing senderring;
	
	/**
	 * Konstruktor setzt Senderring
	 */
	public StockEnte() {
		
		senderring = new SenderRing(this);
	}
	
	/**
	 * Gibt Quack als String aus und benachrichtigt Beobachter
	 */
	public void quaken() {
		
		System.out.println("Quack");
		benachrichtigeBeobachtende();
	}
	
	/**
	 * Registriert Beobachter
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
	 * Gibt StockEnte als String zurueck
	 * 
	 * @return StockEnte als Sting
	 */
	public String toString() {
		
		return "StockEnte";
	}
}