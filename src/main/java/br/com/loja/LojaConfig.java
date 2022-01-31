package br.com.loja;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import br.com.loja.model.GatewayPagamento;
import br.com.loja.service.PagSeguroService;
import br.com.loja.service.PayPalService;
import br.com.loja.service.VendaService;

@Configuration
public class LojaConfig {
	
	@Primary
	@Bean
	public PagSeguroService pagSeguroService(){
		return new PagSeguroService("857db999811555adddbxx222");
	}
	
	@Bean
	public PayPalService paypalService(){
		return new PayPalService("admin", "123");
	}
	
//	@Bean
//	public VendaService vendaService(GatewayPagamento gateway){
//		return new VendaService(gateway);
//	}
	
}
