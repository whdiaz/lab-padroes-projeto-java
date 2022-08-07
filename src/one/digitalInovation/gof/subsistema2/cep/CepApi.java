package one.digitalInovation.gof.subsistema2.cep;

public class CepApi {
	
	private static CepApi instancia = new CepApi();
	
	private CepApi() {
		super();
	}
	
	public static CepApi getInstancia() {
		return instancia;
	}
	
	public String recupareaCidade(String cep) {
		return "Araraquara";
	}
	
	public String recuperarEstado(String cep) {
		return "SP";
		}
	

}
