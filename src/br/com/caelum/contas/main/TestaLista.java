package br.com.caelum.contas.main;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import br.com.caelum.contas.modelo.Conta;
import br.com.caelum.contas.modelo.ContaCorrente;

public class TestaLista {

	public static void main(String[] args) {
		List<Conta> contas = new ArrayList<>();
		Random aleatorio = new Random();
		
		for(int i = 0; i <= 5; i++) {
			ContaCorrente conta = new ContaCorrente();
			conta.setAgencia("Agencia" + i);
			conta.setTitular("Titular" + i);
			conta.deposita(aleatorio.nextInt(1000));
			contas.add(conta);
		}
		System.out.println(contas);
	}

}
