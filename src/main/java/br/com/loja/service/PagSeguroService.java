package br.com.loja.service;

import java.math.BigDecimal;
import java.util.Date;

import br.com.loja.model.GatewayPagamento;

public class PagSeguroService implements GatewayPagamento {
	private String token;
	private Date data = new Date();

	public PagSeguroService(String token) {
		this.token = token;
	}
	
	@Override
	public void efetuarPagamento(String numeroCartao, BigDecimal valorTotal) {
		System.out.printf("[PagSeguro] Usando token: %s\n", this.token);
		System.out.printf("[PagSeguro] Do dia: %t\n", this.data);
		System.out.printf("[PagSeguro] Cobrando %f do cartão %s... \n", valorTotal, numeroCartao);
	}

}
