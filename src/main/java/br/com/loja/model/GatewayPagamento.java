package br.com.loja.model;

import java.math.BigDecimal;

public interface GatewayPagamento {
	
	void efetuarPagamento(String numeroCartao, BigDecimal valorTotal);
}
