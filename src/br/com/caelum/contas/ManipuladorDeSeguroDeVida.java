package br.com.caelum.contas;

import br.com.caelum.contas.modelo.SeguroDeVida;
import br.com.caelum.javafx.api.util.Evento;

public class ManipuladorDeSeguroDeVida {
		SeguroDeVida seguroDeVida;
		
	public void criaSeguro(Evento evento) {
		seguroDeVida = new SeguroDeVida();
		seguroDeVida.setNumeroApolice(evento.getInt("numeroApolice"));	
		seguroDeVida.setTitular(evento.getString("titular"));
		seguroDeVida.setValor(evento.getDouble("valor"));	
	}
	
	
}
