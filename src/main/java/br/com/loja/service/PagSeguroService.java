package br.com.loja.service;

import java.math.BigDecimal;

public class PagSeguroService {
	private String token;

	public PagSeguroService(String token) {
		this.token = token;
	}
	public void efetuaPagamento(String numeroCartao, BigDecimal valorTotal) {
		System.out.printf("[PagSeguro] Usando token: %s\n", token);
		System.out.printf("[PagSeguro] Cobrando %f do cartão %s... \n", valorTotal, numeroCartao);
	}

}
