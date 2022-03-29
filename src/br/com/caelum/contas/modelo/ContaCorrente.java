package br.com.caelum.contas.modelo;

import br.com.caelum.exceptions.SaldoInsuficienteException;

public class ContaCorrente extends Conta implements Tributavel{
	
	@Override
	public String getTipo() {
		return "Conta Corrente";
	}
	
	@Override
	public void saca(double valor) {
		if(valor < saldo) {
			saldo -= valor - 0.10;
		}
		else {
			throw new SaldoInsuficienteException(valor);
		}
	}

	@Override
	public double getValorImposto() {
		return saldo * 0.01;
	}
	
}
