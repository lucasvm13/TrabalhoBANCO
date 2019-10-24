package Tabuleiro;

import Imovel.Imovel;
import Jogador.Jogador;
import Noticias.Noticia;

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
	public Novo(Noticia n) {
		valor = "Not�cia";
		proximo = null;
		anterior = null;
	}
}
