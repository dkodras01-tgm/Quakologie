package kodras_stokic;

import java.util.ArrayList;

public class Schar implements Quakfaehig {

	private ArrayList<Quakfaehig> quacker = new ArrayList<Quakfaehig>();

	public void hinzufuegen(Quakfaehig ente) {

		quacker.add(ente);
	}

	public void quaken() {

		for(Quakfaehig quaker : this.quacker)
			quaker.quaken();
	}

	public void registriereBeobachter(Beobachter beobachter) {

		for(Quakfaehig quacker : this.quacker)
			quacker.registriereBeobachter(beobachter);
	}

	public void benachrichtigeBeobachtende() { }
	
	public String toString() {
		
		return "Schar";
	}
}