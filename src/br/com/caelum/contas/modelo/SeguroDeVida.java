package br.com.caelum.contas.modelo;

public class SeguroDeVida implements Tributavel{
	private String titular;
	private double valor;
	private int numeroApolice;
	
	public String getTipo() {
		return "Seguro de Vida";
	}

	public String getTitular() {
		return titular;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public int getNumeroApolice() {
		return numeroApolice;
	}

	public void setNumeroApolice(int numeroApolice) {
		this.numeroApolice = numeroApolice;
	}

	@Override
	public double getValorImposto() {
		return (0.02 * valor) + 42;
	}
	
}
