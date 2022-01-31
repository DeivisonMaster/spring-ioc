package br.com.loja;

import java.math.BigDecimal;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import br.com.loja.model.Venda;
import br.com.loja.service.VendaService;

@SpringBootApplication
public class SpringIocApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(SpringIocApplication.class, args);
		
		VendaService vendaService = context.getBean(VendaService.class);
		
		Venda venda = new Venda();
		venda.setProduto("Camisa branca");
		venda.setPrecoUnitario(new BigDecimal("109.23"));
		venda.setQuantidade(new Integer(2));
		
		vendaService.registrar(venda, "402400711122233");
	}

}
