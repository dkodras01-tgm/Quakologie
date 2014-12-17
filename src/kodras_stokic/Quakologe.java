package kodras_stokic;

/**
 * Klasse 
 * 
 * @author Dominik Kodras
 * @author Stefan Stokic
 */
public class Quakologe implements Beobachter {


	/**
	 * Gibt aus wer gerade gequakt hat
	 * 
	 * @param ente
	 */
	public void aktualisieren(QuakBeobachtungsSubjekt ente) {
		
		System.out.println("Quakologe: " + ente + " hat gerade gequakt.");
	}
	
	/**
	 * Gibt Quaakologie als String zurueck
	 * 
	 * @return Quakologie als String
	 */
	public String toString() {
		
		return "Quakologe";
	}
}