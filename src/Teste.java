import one.digitalInovation.gof.SingletonEager;
import one.digitalInovation.gof.SingletonLazy;
import one.digitalInovation.gof.SingletonLazyHolder;
import one.digitalInovation.gof.strategy.Comportamento;
import one.digitalInovation.gof.strategy.ComportamentoAgressivo;
import one.digitalInovation.gof.strategy.ComportamentoDefensivo;
import one.digitalInovation.gof.strategy.ComportamentoNormal;
import one.digitalInovation.gof.strategy.Robo;

public class Teste {
	public static void main(String[] args) {
		
		SingletonLazy lazy =  SingletonLazy.getInstancia();
		System.out.println(lazy);
		lazy = SingletonLazy.getInstancia();
		System.out.println(lazy);
	
	SingletonEager eager =  SingletonEager.getInstancia();
	System.out.println(eager);
	eager = SingletonEager.getInstancia();
	System.out.println(eager);
	
	SingletonLazyHolder lazyHolder =  SingletonLazyHolder.getInstancia();
	System.out.println(lazyHolder);
	lazyHolder = SingletonLazyHolder.getInstancia();
	System.out.println(lazyHolder);
	
	
	Comportamento defensivo = new ComportamentoDefensivo();
	Comportamento normal = new ComportamentoNormal();
	Comportamento agressivo = new ComportamentoAgressivo();
	
	Robo robo = new Robo();
	robo.setComportamento(normal);
	robo.mover();
	robo.setComportamento(defensivo);
	robo.mover();
	robo.setComportamento(agressivo);
	robo.mover();
	
	
	}
}
