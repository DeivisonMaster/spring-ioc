package br.com.loja.service;

import java.math.BigDecimal;

import org.springframework.stereotype.Service;

import br.com.loja.model.GatewayPagamento;
import br.com.loja.model.Venda;

@Service
public class VendaService {
	
	/*
	 * PONTOS DE INJEÇÃO
	 * 1. por propriedade
	 * 2. por construtor
	 * 3. por método setter
	 * */
//	@Autowired
	private GatewayPagamento gateway;
	
//  2 CONSTRUCTOR	
	public VendaService(GatewayPagamento gateway) {
		this.gateway = gateway;
	}
	
	public void registrar(Venda venda, String numeroCartao){
		BigDecimal valorTotal = venda.getPrecoUnitario().multiply(new BigDecimal(venda.getQuantidade()));
		
		System.out.printf("[Venda] Registrando venda %s no valor total de %f...\n", venda.getProduto(), valorTotal);
		
		gateway.efetuarPagamento(numeroCartao, valorTotal);
	}
	
	// 3 SETTER
	public void setGateway(GatewayPagamento gateway) {
		this.gateway = gateway;
	}
}
 