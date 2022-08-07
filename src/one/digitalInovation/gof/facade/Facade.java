package one.digitalInovation.gof.facade;

import one.digitalInovation.gof.subsistema1.crm.CrmService;
import one.digitalInovation.gof.subsistema2.cep.CepApi;

public class Facade {
	
	public void migrarCliente(String nome, String cep) {
		
		String cidade = CepApi.getInstancia().recupareaCidade(cep);
		String estado = CepApi.getInstancia().recuperarEstado(cep);
		
		CrmService.gravarCliente(nome, cep, cidade, estado);
		
		
	}
	

}
