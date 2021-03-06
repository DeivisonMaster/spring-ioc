package br.com.loja.service;

import java.math.BigDecimal;

import org.junit.Test;

import br.com.loja.model.Venda;
import br.com.loja.service.VendaService;

public class VendaServiceTest {

	@Test
	public void testaSeRegistraVenda(){
		Venda venda = new Venda();
		venda.setProduto("Camisa branca");
		venda.setPrecoUnitario(new BigDecimal("109.23"));
		venda.setQuantidade(new Integer(2));
		
		VendaService vendaService = new VendaService(new PayPalService("admin", "123"));
		vendaService.registrar(venda, "402400711122233");
		
	}
}
