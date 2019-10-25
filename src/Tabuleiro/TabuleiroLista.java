package Tabuleiro;

import Imovel.Imovel;
import Jogador.Jogador;
import Noticias.NoticiaPilha;

public class TabuleiroLista {

	Novo inicio, fim;
	public Novo atual;
	Novo anterior = null;

	public boolean Vazio() {
		return inicio == null;
	}

	public void InsereInicioNoticia(NoticiaPilha n) {
		Novo novo = new Novo(n);
		if (Vazio()) {
			inicio = novo;
			fim = novo;
			atual = novo;

		} else {
			novo.proximo = inicio;
			novo.anterior = fim;
			inicio.anterior = novo;
			inicio = novo;
			fim.proximo = inicio;
		}
	}

	public void inserePosNoticia(NoticiaPilha noticia, int posicao) {

		Novo novo = new Novo(noticia);

		if (posicao == 0) {
			InsereInicioNoticia(noticia);

		} else {

			moveParaPosicao(posicao);
			novo.proximo = atual.proximo;
			novo.anterior = atual;
			atual.proximo = novo;
			atual.proximo.anterior = novo;
		}
	}

	public void inserePosJogador(Jogador jogador, int posicao) {

		Novo novo = new Novo(jogador);

		if (posicao != 0) {
			moveParaPosicao(posicao);
			novo.proximo = atual.proximo;
			novo.anterior = atual;
			atual.proximo = novo;
			atual.proximo.anterior = novo;
		}
	}

	public void InsereInicioImovel(Imovel imovel) {
		Novo novo = new Novo(imovel);
		if (Vazio()) {
			inicio = novo;
			fim = novo;
			atual = novo;

		} else {
			novo.proximo = inicio;
			novo.anterior = fim;
			inicio.anterior = novo;
			inicio = novo;
			fim.proximo = inicio;
		}

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

	public void moveParaPosicao(int pos) {
		try {
			atual = inicio;
			for (int i = 1; i < pos; i++) {
				atual = atual.proximo;
			}
		} catch (NullPointerException e) {
			System.out.println("Erro !");
		}
	}

	public void inserePosImovel(Imovel imovel, int posicao) {

		Novo novo = new Novo(imovel);

		if (posicao == 0) {
			InsereInicioImovel(imovel);

		} else {

			moveParaPosicao(posicao);
			novo.proximo = atual.proximo;
			novo.anterior = atual;
			atual.proximo = novo;
			atual.proximo.anterior = novo;
		}
	}

	public String retiraNaPos(int posicao) {

		moveParaPosicao(posicao);
		String retVal = atual.proximo.valor;
		atual.proximo.anterior = atual;
		atual.proximo = atual.proximo.proximo;
		return retVal;
	}

	public Imovel mostraImovelPos(int pos) {
		moveParaPosicao(pos);
		Imovel retVal = atual.proximo.objImovel;
		return retVal;
	}

	public void InsereImovelNoFim(Imovel imovel) {
		Novo novo = new Novo(imovel);
		if (Vazio()) {
			inicio = novo;
			fim = novo;
			atual = novo;
		} else {

			novo.anterior = fim;
			inicio.anterior = fim;
			fim.proximo = novo;
			fim = novo;

		}
	}

	public String retiraFim() {
		String retVal = fim.valor;
		fim = fim.anterior;
		fim.proximo = inicio;
		return retVal;

	}
}
