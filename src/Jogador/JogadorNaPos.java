package Jogador;

import java.util.Random;

import Tabuleiro.Tabuleiro;

public class JogadorNaPos {

	Tabuleiro t = new Tabuleiro();

	public void movimentaJogador(Jogador j) {

		Random random = new Random();

		int dado1, dado2, somaDados, aux = 0;

		dado1 = random.nextInt(6);
		dado2 = random.nextInt(6);

		somaDados = dado1 + dado2;

		int posAtual = j.getPosicaoJogador();

		j.setPosicaoJogador(posAtual += somaDados);

		System.out.println("Valor da soma dos dados: " + somaDados);

		System.out.println("Posição atual do jogador: " + j.getPosicaoJogador());
	}
}

/*
 * Imovel imovel = new Imovel();
 * 
 * int aux = 0;
 * 
 * for (int i = 0; i < 2; i++) { System.out.println(" ");
 * 
 * 
 * 
 * int dado1 = random.nextInt(6); int dado2 = random.nextInt(6); int somaDados =
 * dado1 + dado2;
 * 
 * System.out.println("Valor dado 1: " + dado1);
 * 
 * System.out.println("Valor dado 2: " + dado2);
 * 
 * System.out.println("Valor da soma dos dados: " + somaDados);
 * 
 * j1.setPosicaoJogador(aux += somaDados);
 * 
 * System.out.println("Posição atual do jogador: " + j1.getPosicaoJogador());
 * 
 * tabuleiro.moveParaPosicao(somaDados);
 * 
 * System.out.println("Posição atual do tabuleiro: " + tabuleiro.atual.valor);
 * 
 * System.out.println("Posição atual do jogador: " + j1.getPosicaoJogador());
 * 
 * System.out.println(" "); }
 */
