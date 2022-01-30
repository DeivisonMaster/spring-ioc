package br.com.loja.service;

import java.math.BigDecimal;

import br.com.loja.model.Venda;

public class VendaService {
	
	public void registrar(Venda venda, String numeroCartao){
		BigDecimal valorTotal = venda.getPrecoUnitario().multiply(new BigDecimal(venda.getQuantidade()));
		
		System.out.printf("[Venda] Registrando venda %s no valor total de %f...\n", venda.getProduto(), valorTotal);
		
		PagSeguroService pagSeguroService = new PagSeguroService("855565dfs989898asd28787845");
		pagSeguroService.efetuarPagamento(numeroCartao, valorTotal);
	}
}
