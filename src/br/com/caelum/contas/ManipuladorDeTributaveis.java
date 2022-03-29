package br.com.caelum.contas;

import br.com.caelum.contas.modelo.Tributavel;
import br.com.caelum.javafx.api.util.Evento;

public class ManipuladorDeTributaveis {
	private double total;
	
	public void calculaImpostos(Evento evento) {
		int quantidade_tributaveis = evento.getTamanhoDaLista("listaTributaveis");
		for(int i=0; i<quantidade_tributaveis; i++) {
			Tributavel t = evento.getTributavel("listaTributaveis", i);
			total +=  t.getValorImposto();
		}
		
	}
}
