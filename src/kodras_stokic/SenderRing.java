package kodras_stokic;

import java.util.ArrayList;

public class SenderRing implements QuakBeobachtungsSubjekt {

	private ArrayList<Beobachter> beobachter = new ArrayList<Beobachter>();
	private QuakBeobachtungsSubjekt ente;
	
	public SenderRing(QuakBeobachtungsSubjekt ente) {
		
		this.ente = ente;
	}
	
	public void registriereBeobachter(Beobachter beobachter) {

		this.beobachter.add(beobachter);
	}

	public void benachrichtigeBeobachtende() {

		for(Beobachter beobachter : this.beobachter)
			beobachter.aktualisieren(ente);
	}
}