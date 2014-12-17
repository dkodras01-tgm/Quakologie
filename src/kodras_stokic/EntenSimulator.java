package kodras_stokic;

/**
 * Klasse zum simulieren der Quakologie
 * 
 * @author Dominik Kodras
 * @author Stefan Stokic
 */
public class EntenSimulator {

	/**
	 * Main-Methode ruft die Simulation auf
	 * 
	 * @param args
	 */
	public static void main(String[] args) {

		EntenSimulator entenSimulator = new EntenSimulator();
		AbstraktEntenFabrik entenFabrik = new ZaehlendeEntenFabrik();

		entenSimulator.simulieren(entenFabrik);
	}

	/**
	 * Gesamte Simulation
	 * 
	 * @param entenfabrik
	 */
	public void simulieren(AbstraktEntenFabrik entenfabrik) {

		Quakfaehig moorEnte = entenfabrik.erzeugeMoorEnte();
		Quakfaehig lockPfeife = entenfabrik.erzeugeLockPfeife();
		Quakfaehig gummiEnte = entenfabrik.erzeugeGummiEnte();
		Quakfaehig gansEnte = new GansAdapter(new Gans());
		
		Schar entenSchar = new Schar();
		entenSchar.hinzufuegen(moorEnte);
		entenSchar.hinzufuegen(lockPfeife);
		entenSchar.hinzufuegen(gummiEnte);
		entenSchar.hinzufuegen(gansEnte);
		
		Quakfaehig stockEnte1 = entenfabrik.erzeugeStockEnte();
		Quakfaehig stockEnte2 = entenfabrik.erzeugeStockEnte();
		Quakfaehig stockEnte3 = entenfabrik.erzeugeStockEnte();
		Quakfaehig stockEnte4 = entenfabrik.erzeugeStockEnte();
		
		Schar stockEntenSchar = new Schar();
		stockEntenSchar.hinzufuegen(stockEnte1);
		stockEntenSchar.hinzufuegen(stockEnte2);
		stockEntenSchar.hinzufuegen(stockEnte3);
		stockEntenSchar.hinzufuegen(stockEnte4);
		
		
		entenSchar.hinzufuegen(stockEntenSchar);

		System.out.println("EntenSimulator:");

		Quakologe quakologe = new Quakologe();
		entenSchar.registriereBeobachter(quakologe);

		simulieren(entenSchar);

		System.out.println("\nDie Enten haben " + QuakZaehler.getQuaks() + " mal gequakt.");
	}

	/**
	 * Ente fuehrt das quaken aus
	 * 
	 * @param ente
	 */
	public void simulieren(Quakfaehig ente) {

		ente.quaken();
	}
}