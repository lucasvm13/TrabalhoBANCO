package Tabuleiro;

import Jogador.Jogador;
import Noticias.Noticia;

public class Novo {

	Novo proximo, anterior;
	public String valor;
	
	public Novo(Jogador jogador) {
		valor = jogador.getNomeJogador();
		proximo = null;
		anterior = null;
	}	
	
	public Novo(Imovel imovel) {
		valor = imovel.getNomeImovel();
		proximo = null;
		anterior = null;
	}
	public Novo(Noticia n) {
		valor = "Notícia";
		proximo = null;
		anterior = null;
	}
}
