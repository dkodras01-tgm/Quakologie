package kodras_stokic;

/**
 * Klasse zum erzeugen von Zaehler für Enten und Lockpfeife
 * 
 * @author Dominik Kodras
 * @author Stefan Stokic
 */
public class ZaehlendeEntenFabrik extends AbstraktEntenFabrik {
	
	/**
	 * @return Zaehler fuer quaken fuer Stockente
	 */
	public Quakfaehig erzeugeStockEnte() {
		return new QuakZaehler(new StockEnte());
	}
	
	/**
	 * @return Zaehler fuer quaken fuer Moorente
	 */
	public Quakfaehig erzeugeMoorEnte() {
		return new QuakZaehler(new MoorEnte());
	}
	
	/**
	 * @return Zaehler fuer quaken fuer Lockpfeife
	 */
	public Quakfaehig erzeugeLockPfeife() {
		return new QuakZaehler(new LockPfeife());
	}
	
	/**
	 * @return Zaehler fuer quaken fuer SGummiente
	 */
	public Quakfaehig erzeugeGummiEnte() {
		return new QuakZaehler(new GummiEnte());
	}
}