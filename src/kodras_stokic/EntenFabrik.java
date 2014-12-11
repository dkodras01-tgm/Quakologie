package kodras_stokic;

public class EntenFabrik extends AbstraktEntenFabrik {
	
	public Quakfaehig erzeugeStockEnte() {
		return new StockEnte();
	}
	
	public Quakfaehig erzeugeMoorEnte() {
		return new MoorEnte();
	}
	
	public Quakfaehig erzeugeLockPfeife() {
		return new LockPfeife();
	}
	
	public Quakfaehig erzeugeGummiEnte() {
		return new GummiEnte();
	}
}