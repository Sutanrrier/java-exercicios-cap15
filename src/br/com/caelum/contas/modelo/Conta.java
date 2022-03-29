package br.com.caelum.contas.modelo;

import java.util.Objects;

public abstract class Conta implements Comparable<Conta>{
	private String titular, agencia;
	private int numero, identificador;
	protected double saldo;
	private static int contador_de_contas = 0; // variável que não muda independente do objeto.

	public Conta(String titular) {
		this.titular = titular;
		contador_de_contas += 1;
		identificador = Conta.contador_de_contas;
	}

	public Conta() {
		contador_de_contas += 1;
		identificador = Conta.contador_de_contas;
	}

	public String getTitular() {
		return titular;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getAgencia() {
		return agencia;
	}

	public void setAgencia(String agencia) {
		this.agencia = agencia;
	}

	public double getSaldo() {
		return saldo;
	}

	public abstract String getTipo();

	public void saca(double valor) {
		if (valor > 0) {
			saldo -= valor;
		} else {
			throw new IllegalArgumentException("Valor inválido");
		}

	}

	public void deposita(double valor) {
		if (valor > 0) {
			saldo += valor;
		} else {
			throw new IllegalArgumentException("Valor inválido");
		}
	}

	public double calcularRendimento() {
		return saldo * 0.1;
	}

	public void transfere(double valor, Conta destino) {
		this.saca(valor);
		destino.deposita(valor);
	}

	public void recuperaDadosParaImpressao() {
		System.out.println("Identificador " + identificador);
		System.out.println("Nome do titular: " + titular);
		System.out.println("Número da Conta: " + numero + " | Agência: " + agencia);
		System.out.println("Saldo na conta: " + saldo);
		System.out.println("Tipo da conta:" + getTipo());
	}
	
	//Adições deste exercício abaixo
	
	//Sobreõe a impressão da referência deste objeto.
	public String toString() {
		return "Titular: " + titular.toUpperCase() + " | Número: " + numero + " | Agência: " + agencia + " | Saldo: " + saldo;
	}
	
	public int compareTo(Conta outraConta) {
		return this.titular.compareTo(outraConta.titular);
	}

	@Override
	public int hashCode() {
		return Objects.hash(agencia, numero);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Conta other = (Conta) obj;
		return Objects.equals(agencia, other.agencia) && numero == other.numero;
	}
	
	
}
