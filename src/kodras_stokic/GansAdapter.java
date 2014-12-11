package kodras_stokic;

public class GansAdapter implements Quakfaehig {

	private Gans gans;
	private SenderRing senderring;

	public GansAdapter(Gans gans) {

		this.gans = gans;
		senderring = new SenderRing(this);
	}

	public void quaken() {

		gans.schnattern();
		benachrichtigeBeobachtende();
	}

	public void registriereBeobachter(Beobachter beobachter) {

		senderring.registriereBeobachter(beobachter);
	}

	public void benachrichtigeBeobachtende() {

		senderring.benachrichtigeBeobachtende();
	}

	public String toString() {
		
		return "Sich als Ente ausgebende Gans(GansAdapter)";
	}
}