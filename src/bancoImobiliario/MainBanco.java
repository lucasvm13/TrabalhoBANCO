package bancoImobiliario;

import java.util.ArrayList;
import java.util.Random;
import javax.swing.JOptionPane;
import Jogador.FilaJogadorDaVez;
import Jogador.Jogador;
import Noticias.CriaNoticias;
import Tabuleiro.Tabuleiro;
import Tabuleiro.TabuleiroLista;

public class MainBanco {

	public static void main(String[] args) {

		ArrayList<Jogador> listaJogadores = new ArrayList<Jogador>();

		FilaJogadorDaVez jogadorDaVez = new FilaJogadorDaVez();

		Tabuleiro tabuleiro = new Tabuleiro();

		CriaNoticias criaNoticias = new CriaNoticias();
		
		TabuleiroLista tabuleiroLista = new TabuleiroLista();

		tabuleiro.insereCasas();
		criaNoticias.insereNoticias();

		String op;

		// CRIAR OS JOGADORES
		do {
			Jogador j = new Jogador(JOptionPane.showInputDialog("Nome: "));
			listaJogadores.add(j);
			jogadorDaVez.InsereJogadorVez(j);
			op = JOptionPane.showInputDialog("Mais jogadores ?" + "(S/N)");

		} while ((op.equals("s") | (op.equals("S"))));

		System.out.println("Participantes e suas posi��es inciais: " + listaJogadores.toString());

		System.out.println(" ");

		// INICIAR O JOGO

		for (int i = 0; i < 20; i++) {

			Random random = new Random();
			int dado1 = random.nextInt(6);
			int dado2 = random.nextInt(6);
			int somaDados = dado1 + dado2;

			System.out.println(" ");
			System.out.println("Soma dos dados: " + somaDados);
			System.out.println(" ");

			// RETIRA O JOGADOR QUE EST� NO INICIO DA FILA
			Jogador JogadorAtual = jogadorDaVez.retiraJogadorDaVez();

			
			// SETA POSI��O DO JOGADOR
			if(JogadorAtual.getPosicaoJogador()+somaDados<=21) {
			JogadorAtual.setPosicaoJogador(somaDados += JogadorAtual.getPosicaoJogador());
			} else {
				int diferen�a = (JogadorAtual.getPosicaoJogador()+somaDados-21);
				JogadorAtual.setPosicaoJogador(0);
				tabuleiro.moveJogador(diferen�a, JogadorAtual);
				JogadorAtual.setSaldoJogador(JogadorAtual.getSaldoJogador()+2500);
			}
			
			// ADQUIRINDO UM IMOVEL
			boolean adquirir;
			adquirir = random.nextBoolean();
			System.out.println(" ");

			System.out.println("Nome: " + JogadorAtual.getNomeJogador() + "\t" + "Posi��o atual: "
					+ JogadorAtual.getPosicaoJogador() + "\t" + "Posi��o atual do tabuleiro: " + somaDados);
			System.out.println(" ");
			
			System.out.println("Saldo atual : " +JogadorAtual.getSaldoJogador());
			
			System.out.println(" ");

			if (tabuleiro.verificaNotica(somaDados)) {
				try {
				System.out.println("Retirando uma notica... " + criaNoticias.desempilha());
				System.out.println(" ");
				criaNoticias.defineAcaoCarta(JogadorAtual, somaDados);
				somaDados = JogadorAtual.getPosicaoJogador();
				} catch(NullPointerException e) {
					System.out.println("Faltou cartas !");
				}
			} else {
				System.out.println(" ");
				tabuleiro.adquirirImovel(somaDados, adquirir, JogadorAtual);
				somaDados = JogadorAtual.getPosicaoJogador();
			}

			System.out.println(" ");

			System.out.println("Nome: " + JogadorAtual.getNomeJogador() + "\t" + "Posi��o atual: "
					+ JogadorAtual.getPosicaoJogador() + "\t" + "Posi��o atual do tabuleiro: " + somaDados);
			System.out.println(" ");
			
			

			// CRIAR SAIDA DA PRIS�O

			// COLOCANDO CONSTRU��ES
			boolean construir;
			construir = random.nextBoolean();
			System.out.println(" ");
			tabuleiro.colocarConstru��o(somaDados, construir, JogadorAtual);
			System.out.println();
			
			
			// INSERE NO INICIO O JOGADOR QUE ACABOU DE SER RETIRADO
			if (JogadorAtual.getSaldoJogador() <= 0) {
				jogadorDaVez.retiraJogadorDaVez();
			} else {
				jogadorDaVez.InsereJogadorVez(JogadorAtual);
			}
			System.out.println();
			System.out.println();

		}

		System.out.println(" ");

		System.out.println("Jogadores e suas posi��es atuais:" + listaJogadores);

		
	}
}
