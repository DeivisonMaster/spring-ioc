package br.com.loja.service;

import java.math.BigDecimal;

import br.com.loja.model.GatewayPagamento;

public class PagSeguroService implements GatewayPagamento {
	private String token;

	public PagSeguroService(String token) {
		this.token = token;
	}
	
	@Override
	public void efetuarPagamento(String numeroCartao, BigDecimal valorTotal) {
		System.out.printf("[PagSeguro] Usando token: %s\n", this.token);
		System.out.printf("[PagSeguro] Cobrando %f do cartão %s... \n", valorTotal, numeroCartao);
	}

}
