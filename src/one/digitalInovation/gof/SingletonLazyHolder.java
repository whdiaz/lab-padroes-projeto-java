package one.digitalInovation.gof;
/**
 * 
 * Singleton "apressado".
 * @author whdia
 *
 */
public class SingletonLazyHolder {
	
	private static SingletonLazyHolder instancia = new SingletonLazyHolder();
	
	private SingletonLazyHolder() {
		super();
	}
	
	public static SingletonLazyHolder getInstancia() {
		return instancia;
	}

}
