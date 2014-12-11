package kodras_stokic;

public class GansAdapter implements Quakfaehig {

	Gans gans;
	
	public GansAdapter(Gans gans) {
		
		this.gans = gans;
	}
	
	public void quaken() {
		
		gans.schnattern();
	}
}