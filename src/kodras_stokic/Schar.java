package kodras_stokic;

import java.util.ArrayList;

/**
 * Klasse die eine Schar darstellt
 * 
 * @author Dominik Kodras
 * @author Stefan Stokic
 */
public class Schar implements Quakfaehig {

	private ArrayList<Quakfaehig> quacker = new ArrayList<Quakfaehig>();

	/**
	 * Fuegt die Ente der Schar hinzu
	 * 
	 * @param ente
	 */
	public void hinzufuegen(Quakfaehig ente) {

		quacker.add(ente);
	}

	/**
	 * Laesst alle Enten in der Schar quaken
	 */
	public void quaken() {

		for(Quakfaehig quaker : this.quacker)
			quaker.quaken();
	}

	/**
	 * Registriert Beobachter
	 */
	public void registriereBeobachter(Beobachter beobachter) {

		for(Quakfaehig quacker : this.quacker)
			quacker.registriereBeobachter(beobachter);
	}

	/**
	 * Benachrichtigt Beobachtende
	 */
	public void benachrichtigeBeobachtende() { }
	
	/**
	 * Gibt Schar als String zurueck
	 * 
	 * @return Schar als String
	 */
	public String toString() {
		
		return "Schar";
	}
}