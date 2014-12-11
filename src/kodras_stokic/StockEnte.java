package kodras_stokic;

public class StockEnte implements Quakfaehig {

	private SenderRing senderring;
	
	public StockEnte() {
		
		senderring = new SenderRing(this);
	}
	
	public void quaken() {
		
		System.out.println("Quack");
		benachrichtigeBeobachtende();
	}
	
	public void registriereBeobachter(Beobachter beobachter) {

		senderring.registriereBeobachter(beobachter);
	}

	public void benachrichtigeBeobachtende() {

		senderring.benachrichtigeBeobachtende();
	}
	
	public String toString() {
		
		return "StockEnte";
	}
}