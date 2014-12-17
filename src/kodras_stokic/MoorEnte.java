package kodras_stokic;

/**
 * Klasse stellt eine Moorente dar
 * 
 * @author Dominik Kodras
 * @author Stefan Stokic
 */
public class MoorEnte implements Quakfaehig {

	private SenderRing senderring;
	
	/**
	 * Konstruktor fuegt Senderring hinzu
	 */
	public MoorEnte() {
		
		senderring = new SenderRing(this);
	}
	
	/**
	 * Gibt Quack aus und benachrichtigt Beobachter
	 */
	public void quaken() {
		
		System.out.println("Quack");
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
	 * Gibt MoorEnte als String zurueck
	 * 
	 * @return MoorEnte als String
	 */
	public String toString() {
		return "MoorEnte";
	}
}