package bancoImobiliario;

import java.util.ArrayList;
import java.util.Random;
import javax.swing.JOptionPane;
import Jogador.FilaJogadorDaVez;
import Jogador.Jogador;
import Tabuleiro.Tabuleiro;

public class MainBanco {

	public static void main(String[] args) {

		ArrayList<Jogador> listaJogadores = new ArrayList<Jogador>();

		FilaJogadorDaVez jogadorDaVez = new FilaJogadorDaVez();

		Tabuleiro tabuleiro = new Tabuleiro();

		tabuleiro.insereCasas();

		String op;

		// CRIAR OS JOGADORES
		do {
			Jogador j = new Jogador(JOptionPane.showInputDialog("Nome: "));
			listaJogadores.add(j);
			jogadorDaVez.InsereJogadorVez(j);
			op = JOptionPane.showInputDialog("Mais jogadores ?" + "(S/N)");

		} while ((op.equals("s") | (op.equals("S"))));
		System.out.println("Participantes e suas posições inciais: " + listaJogadores.toString());

		System.out.println(" ");

		// INICIAR O JOGO

		for (int i = 0; i < 5; i++) {

			Random random = new Random();
			int dado1 = random.nextInt(6);
			int dado2 = random.nextInt(6);
			int somaDados = dado1 + dado2;

			System.out.println(" ");
			System.out.println("Soma dos dados: " + somaDados);
			System.out.println(" ");

			// RETIRA O JOGADOR QUE ESTÁ NO INICIO DA FILA
			Jogador JogadorAtual = jogadorDaVez.retiraJogadorDaVez();

			// SETA POSIÇÃO DO JOGADOR
			JogadorAtual.setPosicaoJogador(somaDados += JogadorAtual.getPosicaoJogador());

			// ADQUIRINDO UM IMOVEL
			boolean adquirir;
			adquirir = random.nextBoolean();
			System.out.println(" ");
			System.out.println("Nome: " + JogadorAtual.getNomeJogador() + "\t" + "Posição atual: "
					+ JogadorAtual.getPosicaoJogador() + "\t" + "Posição atual do tabuleiro: " + somaDados);
			System.out.println(" ");
			tabuleiro.adquirirImovel(somaDados, adquirir, JogadorAtual);

			// PAGAR ALUGUEL
			tabuleiro.pagarAluguel(somaDados, JogadorAtual);

			// COLOCANDO CONSTRUÇÕES
			boolean construir;
			construir = random.nextBoolean();
			System.out.println(" ");
			tabuleiro.colocarConstrução(somaDados, construir, JogadorAtual);

			// INSERE NO INICIO O JOGADOR QUE ACABOU DE SER RETIRADO
			jogadorDaVez.InsereJogadorVez(JogadorAtual);
			System.out.println();

		}

		System.out.println(" ");

		System.out.println("Jogadores e suas posições atuais:" + listaJogadores);

	}
}
