package kodras_stokic;

public class LockPfeife implements Quakfaehig {

	private SenderRing senderring;
	
	public LockPfeife() {
		
		senderring = new SenderRing(this);
	}
	
	public void quaken() {

		System.out.println("Kwak");
		benachrichtigeBeobachtende();
	}
	
	public void registriereBeobachter(Beobachter beobachter) {

		senderring.registriereBeobachter(beobachter);
	}

	public void benachrichtigeBeobachtende() {

		senderring.benachrichtigeBeobachtende();
	}
	
	public String toString() {
		
		return "LockPfeife";
	}
}