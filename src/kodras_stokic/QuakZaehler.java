package kodras_stokic;

/**
 * Klasse 
 * 
 * @author Dominik Kodras
 * @author Stefan Stokic
 */
public class QuakZaehler implements Quakfaehig {

	private Quakfaehig ente;
	private static int anzahlDerQuaks;
	
	/**
	 * 
	 * 
	 * @param ente
	 */
	public QuakZaehler(Quakfaehig ente) {
		
		this.ente = ente;
	}
	
	/**
	 * Ruft quaken der entsprechenden Ente auf und inkrementiert die Anzahl der Quacks
	 */
	public void quaken() {
		
		ente.quaken();
		anzahlDerQuaks++;
	}
	
	/**
	 * Gibt die Anzahl der Quaks aus
	 * 
	 * @return anzahlDerQuaks
	 */
	public static int getQuaks() {
		
		return anzahlDerQuaks;
	}
	
	/**
	 * Registriert Beobachter
	 */
	public void registriereBeobachter(Beobachter beobachter) {

		ente.registriereBeobachter(beobachter);
	}

	/**
	 * Benachrichtigt Beobachter
	 */
	public void benachrichtigeBeobachtende() {

		ente.benachrichtigeBeobachtende();
	}
	
	/**
	 * Gibt den Typ der Ente zurueck
	 * 
	 * @return Typ der ente als String
	 */
	public String toString() {
		
		return ente.toString();
	}
}