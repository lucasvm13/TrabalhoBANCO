package Tabuleiro;

import Jogador.Jogador;
import Noticias.Noticia;

public class Tabuleiro {

	Novo inicio, fim, atual, anterior = null;

	public void InsereInicioJogador(Jogador jogador) {
		Novo novo = new Novo(jogador);
		if (inicio != null) {
			novo.proximo = inicio;
			novo.anterior = fim;
			inicio.anterior = novo;
			inicio = novo;
			fim.proximo = inicio;

		} else {
			inicio = fim = atual = novo;
			novo.proximo = novo;
			novo.anterior = novo;
		}
	}

	public void InsereInicioNoticia(Noticia n) {
		Novo novo = new Novo(n);
		if (inicio != null) {
			novo.proximo = inicio;
			novo.anterior = fim;
			inicio.anterior = novo;
			inicio = novo;
			fim.proximo = inicio;

		} else {
			inicio = fim = atual = novo;
			novo.proximo = novo;
			novo.anterior = novo;
		}

	}

	public void InsereInicioImovel(Imovel imovel) {
		Novo novo = new Novo(imovel);
		if (inicio != null) {
			novo.proximo = inicio;
			novo.anterior = fim;
			inicio.anterior = novo;
			inicio = novo;
			fim.proximo = inicio;

		} else {
			inicio = novo;
			fim = novo;
			atual = novo;
			novo.proximo = novo;
			novo.anterior = novo;
		}

	}

	public boolean Vazio() {
		return inicio == null;
	}

	public String RetiraInicio() {

		String retVal = inicio.valor;
		if (inicio == fim) {
			inicio = null;

		} else {
			inicio = inicio.proximo;
			fim.proximo = inicio;
		}
		return retVal;
	}

	/*
	 * public void InsereFim(Jogador jogador) { Novo novo = new Novo(jogador); if
	 * (inicio == null) { inicio = fim = novo; } else { fim.proximo = novo;
	 * novo.anterior = fim; novo.proximo = inicio; inicio.anterior = novo; } }
	 */
	
	public void moveParaPosicao(int pos) {
		atual = inicio;
		for (int i = 1; i < pos; i++) {
			atual = atual.proximo;
		}
	}

	public void inserePosJogador(Jogador jogador, int posicao) {

		Novo novo = new Novo(jogador);

		if (posicao == 0) {
			InsereInicioJogador(jogador);

		} else {

			moveParaPosicao(posicao);

			atual.proximo.anterior = novo;
			novo.proximo = atual.proximo;
			novo.anterior = atual;
			atual.proximo = novo;
		}
	}
}
