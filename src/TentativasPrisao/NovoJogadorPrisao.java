package TentativasPrisao;

import Jogador.Jogador;

public class NovoJogadorPrisao {
	
	Jogador jogador;
	NovoJogadorPrisao proximo;
	
	public NovoJogadorPrisao(Jogador j) {
		jogador = j;
		proximo = null;
	}

}
