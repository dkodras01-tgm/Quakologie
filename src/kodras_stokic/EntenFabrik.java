package kodras_stokic;

public class EntenFabrik extends AbstraktEntenFabrik {
	
	@Override
	public Quakfaehig erzeugeStockEnte() {
		return new StockEnte();
	}
	
	@Override
	public Quakfaehig erzeugeMoorEnte() {
		return new MoorEnte();
	}
	
	@Override
	public Quakfaehig erzeugeLockPfeife() {
		return new LockPfeife();
	}
	
	@Override
	public Quakfaehig erzeugeGummiEnte() {
		return new GummiEnte();
	}
}