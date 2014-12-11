package kodras_stokic;

public class GummiEnte implements Quakfaehig {

	private SenderRing senderring;

	public GummiEnte() {

		senderring = new SenderRing(this);
	}

	public void quaken() {

		System.out.println("Squeak");
		benachrichtigeBeobachtende();
	}

	public void registriereBeobachter(Beobachter beobachter) {

		senderring.registriereBeobachter(beobachter);
	}

	public void benachrichtigeBeobachtende() {

		senderring.benachrichtigeBeobachtende();
	}
	
	public String toString() {
		
		return "GummiEnte";
	}
}