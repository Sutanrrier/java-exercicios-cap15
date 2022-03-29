package br.com.caelum.contas.main;

import java.util.HashSet;
import java.util.Set;

import br.com.caelum.contas.modelo.Conta;
import br.com.caelum.contas.modelo.ContaCorrente;

public class TestaHash {

	public static void main(String[] args) {
		
		Set<Conta> contas = new HashSet<>();
		
		Conta c1 = new ContaCorrente();
		c1.deposita(10000);
		c1.setNumero(1);
		c1.setAgencia("Bradesco");
		c1.setTitular("Claúdio");
		contas.add(c1);
		
		Conta c2 = new ContaCorrente();
		c2.deposita(3000);
		c2.setNumero(1);
		c2.setTitular("Roberto");
		c2.setAgencia("Bradesco");
		contas.add(c2);
		
		for(Conta conta : contas) {
			System.out.println(conta);
		}

	}

}
