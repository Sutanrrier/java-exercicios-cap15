package br.com.caelum.contas.main;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import br.com.caelum.contas.modelo.Conta;
import br.com.caelum.contas.modelo.ContaCorrente;

public class TestaCollections {

	public static void main(String[] args) {
		Conta c1 = new ContaCorrente();
		c1.deposita(10000);
		Conta c2 = new ContaCorrente();
		c2.deposita(3000);

		// cria o mapa
		Map<String, Conta> mapaDeContas = new HashMap<>();

		// adiciona duas chaves e seus valores
		mapaDeContas.put("diretor", c1);
		mapaDeContas.put("gerente", c2);

		// qual a conta do diretor?
		Conta contaDoDiretor = mapaDeContas.get("diretor");
		System.out.println(contaDoDiretor.getSaldo());
		
		
		System.out.println("Iniciando...");
		long inicio = System.currentTimeMillis();
		List<Integer> teste = new LinkedList<>();
		//List<Integer> teste = new ArrayList<>();
		for (int i = 0; i < 30000; i++) {
			teste.add(0, i);
		}
		long fim = System.currentTimeMillis();
		double tempo = (fim - inicio) / 1000.0;
		System.out.println("Tempo	gasto:	" + tempo);

	}

}
