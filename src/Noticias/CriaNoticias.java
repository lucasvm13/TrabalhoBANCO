package Noticias;

import Jogador.Jogador;
import Tabuleiro.TabuleiroLista;

public class CriaNoticias {

	NoticiaPilha noticiaP = new NoticiaPilha();
	TabuleiroLista tabuleiroLista = new TabuleiroLista();

	public void insereNoticias() {

		noticiaP.empilhaNoticia("", 0);
		noticiaP.empilhaNoticia("", 1);
		noticiaP.empilhaNoticia("", 2);
		noticiaP.empilhaNoticia("", 3);

	}

	public String desempilha() {
		return noticiaP.desempilhaNoticia();
	}

	public int retornaEfeito() {
		return noticiaP.verificaEfeito();
	}

	public int defineAcaoCarta(Jogador jogador, int somaDados) {
		try {
			if (retornaEfeito() == 0) {
				System.out.println("Pule duas casas");
				jogador.setPosicaoJogador(jogador.getPosicaoJogador() + 2);
			} else {
				if (retornaEfeito() == 1) {
					System.out.println("Vá para a prisão");
					somaDados = 10;
					jogador.setPosicaoJogador(somaDados);
				} else {
					if (retornaEfeito() == 2) {
						System.out.println("Volte duas casas");
						jogador.setPosicaoJogador(jogador.getPosicaoJogador() - 2);
					} else {
						if (retornaEfeito() == 3) {
							somaDados = 0;
							System.out.println("Voltou para o inicio !");
							jogador.setPosicaoJogador(somaDados);
						}
					}
				}
			}
		} catch (NullPointerException e) {
			System.out.println("Erro !");
		}

		return 0;
	}

}
