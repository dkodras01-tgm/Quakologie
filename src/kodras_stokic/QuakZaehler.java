package kodras_stokic;

public class QuakZaehler implements Quakfaehig {

	private Quakfaehig ente;
	private static int anzahlDerQuaks;
	
	public QuakZaehler(Quakfaehig ente) {
		
		this.ente = ente;
	}
	
	public void quaken() {
		
		ente.quaken();
		anzahlDerQuaks++;
	}
	
	public static int getQuaks() {
		
		return anzahlDerQuaks;
	}
}