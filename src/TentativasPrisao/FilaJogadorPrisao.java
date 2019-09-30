package TentativasPrisao;

import Jogador.Jogador;

public class FilaJogadorPrisao {
	
	NovoJogadorPrisao inicio, fim =  null;
	
	public boolean Vazio() {
		return inicio == null;
	}
	
	public void InsereNaPrisao(Jogador j) {
		NovoJogadorPrisao novo = new NovoJogadorPrisao(j);
			if(inicio==null) {
				inicio =  fim = novo;
			} else {
			fim.proximo = novo;
			fim = novo;
			}
		}
	
	public Jogador retiraDaPrisao() {
		Jogador retVal = inicio.jogador;
		inicio = inicio.proximo;
		return retVal;
	}
}
	


