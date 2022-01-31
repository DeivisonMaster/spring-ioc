package br.com.loja.service;

import java.math.BigDecimal;

import br.com.loja.model.Venda;

public class VendaService {
	private PagSeguroService pagSeguroService;
	
	public VendaService(PagSeguroService pagSeguroService) {
		this.pagSeguroService = pagSeguroService;
	}
	
	public void registrar(Venda venda, String numeroCartao){
		BigDecimal valorTotal = venda.getPrecoUnitario().multiply(new BigDecimal(venda.getQuantidade()));
		
		System.out.printf("[Venda] Registrando venda %s no valor total de %f...\n", venda.getProduto(), valorTotal);
		
		pagSeguroService.efetuarPagamento(numeroCartao, valorTotal);
	}
}
 