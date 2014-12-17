package kodras_stokic;

/**
 * Interface fuer Beobachter
 * 
 * @author Dominik Kodras
 * @author Stefan Stokic
 */
public interface QuakBeobachtungsSubjekt {

	public void registriereBeobachter(Beobachter beobachter);
	public void benachrichtigeBeobachtende();
}