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
		noticiaP.empilhaNoticia("", 4);
		noticiaP.empilhaNoticia("", 5);
		noticiaP.empilhaNoticia("", 6);
		noticiaP.empilhaNoticia("", 7);
		noticiaP.empilhaNoticia("", 8);
		noticiaP.empilhaNoticia("", 9);

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
						if(jogador.getPosicaoJogador()>=2) {
						jogador.setPosicaoJogador(jogador.getPosicaoJogador() - 2);
						}
					} else {
						if (retornaEfeito() == 3) {
							somaDados = 0;
							System.out.println("Volte para o inicio !");
							jogador.setPosicaoJogador(somaDados);
						} else {
							if(retornaEfeito() == 4) {
								System.out.println("Você perdeu R$ 100");
								jogador.setSaldoJogador(jogador.getSaldoJogador()-100);
							} else {
								if(retornaEfeito() == 5) {
									System.out.println("Você ganhou R$ 200");
									jogador.setSaldoJogador(jogador.getSaldoJogador()+200);
								} else {
									if(retornaEfeito() == 6) {
										System.out.println("Volte três casas");
										if(jogador.getPosicaoJogador()>=3) {
										jogador.setPosicaoJogador(jogador.getPosicaoJogador()-3);
										}
									} else {
										if(retornaEfeito() == 7) {
											System.out.println("Pule 3 casas");
											jogador.setPosicaoJogador(jogador.getPosicaoJogador()+3);
										} else {
											if(retornaEfeito() == 8) {
												System.out.println("Você ganhou R$ 300");
												jogador.setSaldoJogador(jogador.getSaldoJogador()+300);
											} else {
												if(retornaEfeito() == 9) {
													System.out.println("Você perdeu R$ 300");
													jogador.setSaldoJogador(jogador.getSaldoJogador()-300);
												}
											}
										}
									}
								}
							}
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
