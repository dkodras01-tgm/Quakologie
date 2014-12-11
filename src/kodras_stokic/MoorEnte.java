package kodras_stokic;

public class MoorEnte implements Quakfaehig {

	private SenderRing senderring;
	
	public MoorEnte() {
		
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
		
		return "MoorEnte";
	}
}