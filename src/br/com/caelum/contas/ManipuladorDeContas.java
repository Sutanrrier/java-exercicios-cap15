package br.com.caelum.contas;

import java.util.Collections;
import java.util.List;

import br.com.caelum.contas.modelo.Conta;
import br.com.caelum.contas.modelo.ContaCorrente;
import br.com.caelum.contas.modelo.ContaPoupanca;
import br.com.caelum.javafx.api.util.Evento;

public class ManipuladorDeContas {

	private Conta conta;

	public void criaConta(Evento evento) {
		
		String tipo = evento.getSelecionadoNoRadio("tipo");
		
		if(tipo.equals("Conta Corrente")){
			this.conta = new ContaCorrente();
			conta.setAgencia(evento.getString("agencia"));
			conta.setNumero(evento.getInt("numero"));
			conta.setTitular(evento.getString("titular"));;
		}
		else {
			this.conta = new ContaPoupanca();
			conta.setAgencia(evento.getString("agencia"));
			conta.setNumero(evento.getInt("numero"));
			conta.setTitular(evento.getString("titular"));;
		}
		
	}

	public void deposita(Evento evento) {
		double valorDigitado = evento.getDouble("valorOperacao");
		this.conta.deposita(valorDigitado);
	}

	public void saca(Evento evento) {
		double valorDigitado = evento.getDouble("valorOperacao");
		this.conta.saca(valorDigitado);
	}
	
	public void transfere(Evento evento) {
		Object conta = evento.getSelecionadoNoCombo("destino");
		this.conta.transfere(evento.getDouble("valorTransferencia"), (Conta) conta);;
	}
	
	public void ordenaLista(Evento evento) {
		List<Conta> contas = evento.getLista("destino");
		Collections.sort(contas);
		
	}
}
