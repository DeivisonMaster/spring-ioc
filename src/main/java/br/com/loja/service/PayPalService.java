package br.com.loja.service;

import java.math.BigDecimal;

import br.com.loja.model.GatewayPagamento;

public class PayPalService implements GatewayPagamento {
	private String usuario;
	private String senha;

	public PayPalService(String usuario, String senha) {
		this.usuario = usuario;
		this.senha = senha;
	}
	
	@Override
	public void efetuarPagamento(String numeroCartao, BigDecimal valorTotal) {
		System.out.printf("[PayPal] Usando usuário: %s\n", this.usuario);
		System.out.printf("[PayPal] Cobrando %f do cartão %s... \n", valorTotal, numeroCartao);
	}
}
