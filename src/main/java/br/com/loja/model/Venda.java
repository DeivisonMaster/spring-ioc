package br.com.loja.model;

import java.math.BigDecimal;

public class Venda {
	private String produto;
	private Integer quantidade;
	private BigDecimal precoUnitario;

	public BigDecimal getPrecoUnitario() {
		return precoUnitario;
	}
	public void setPrecoUnitario(BigDecimal precoUnitario) {
		this.precoUnitario = precoUnitario;
	}
	public void setQuantidade(Integer quantidade) {
		this.quantidade = quantidade;
	}
	public Integer getQuantidade() {
		return quantidade;
	}
	public String getProduto() {
		return this.produto;
	}
	public void setProduto(String produto) {
		this.produto = produto;
	}

}
