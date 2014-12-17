package kodras_stokic;

/**
 * Klasse stellt eine Lockpfeife dar
 * 
 * @author Dominik Kodars
 * @author Stefan Stokic
 */
public class LockPfeife implements Quakfaehig {

	private SenderRing senderring;
	
	/**
	 * Fuegt Senderring hinzu
	 */
	public LockPfeife() {
		
		senderring = new SenderRing(this);
	}
	
	/**
	 * Gibt Kwak aus und benachrichtigt Beobachter
	 */
	public void quaken() {

		System.out.println("Kwak");
		benachrichtigeBeobachtende();
	}
	
	/**
	 * Registriert neuen Beobachter
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
	 * Gibt den String LockPfeife zurueck
	 * 
	 * @return Lockpfeife als String
	 */
	public String toString() {
		
		return "LockPfeife";
	}
}