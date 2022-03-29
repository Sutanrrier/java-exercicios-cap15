package br.com.caelum.contas.modelo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Banco {
	private String nome;
	private int numero;
	private List<Conta> contas;
	private Map<String, Conta> mapaDeContas = new HashMap<>();
	
	public Banco(String nome, int numero) {
		this.nome = nome;
		this.numero = numero;
		this.contas = new ArrayList<>();
	}

	public String getNome() {
		return nome;
	}

	public int getNumero() {
		return numero;
	}
	
	public void adiciona(Conta conta) {
		mapaDeContas.put(conta.getTitular(), conta);
		contas.add(conta);
	}
	
	public Conta pega(int x) {
		return contas.get(x);
	}
	
	public int pegaQuantidadeDeContas() {
		return contas.size();
	}
	
	public Conta buscaPorTitular(String nome) {
		return mapaDeContas.get(nome);
	}
}
	