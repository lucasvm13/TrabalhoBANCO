package Tabuleiro;

import Imovel.Imovel;
import Jogador.Jogador;
import Noticias.NoticiaPilha;

public class Novo {

	Novo proximo, anterior;
	Imovel objImovel;
	public String valor;
	
	public Novo(Jogador jogador) {
		valor = jogador.getNomeJogador();
		proximo = null;
		anterior = null;
	}	
	
	public Novo(Imovel imovel) {
		valor = imovel.getNomeImovel();
		objImovel = imovel;
		proximo = null;
		anterior = null;
	}
	public Novo(NoticiaPilha n) {
		valor = "Notícia";
		proximo = null;
		anterior = null;
	}
}
