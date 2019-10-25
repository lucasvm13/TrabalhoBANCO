package Tabuleiro;

import java.util.Random;

import ImoveisAdquiridos.ImovelAdquiridoFila;
import Imovel.Imovel;
import Jogador.FilaJogadorDaVez;
import Jogador.Jogador;
import Noticias.NoticiaPilha;

public class Tabuleiro {

	TabuleiroLista tabuleiro = new TabuleiroLista();
	ImovelAdquiridoFila imovelAdquirido = new ImovelAdquiridoFila();
	FilaJogadorDaVez jogadorDaVez = new FilaJogadorDaVez();

	Imovel imovelPrisao = new Imovel("Pris�o", 0);
	Imovel imovelFim = new Imovel("Fim", 0);
	Imovel imovelInicio = new Imovel("Inicio", 0);
	Imovel imovel1 = new Imovel("Leblon", 20000);
	Imovel imovel2 = new Imovel("Avenida Presidente Vargas", 30000);
	Imovel imovel3 = new Imovel("Avenida Brigadeiro Faria Lima", 30000);
	Imovel imovel4 = new Imovel("Avenida 9 de Julho", 25000);
	Imovel imovel5 = new Imovel("Copacabana", 60000);
	Imovel imovel6 = new Imovel("Ipanema", 55000);
	Imovel imovel7 = new Imovel("Avenida Europa", 450000);
	Imovel imovel8 = new Imovel("Rua Augusta", 40000);
	Imovel imovel9 = new Imovel("Morumbi", 100000);
	Imovel imovel10 = new Imovel("Interlagos", 75000);
	Imovel imovel11 = new Imovel("Av. Brasil", 50000);
	Imovel imovel12 = new Imovel("Jardim Europa", 55000);
	Imovel imovel13 = new Imovel("Jardim Paulista", 45000);
	Imovel imovel14 = new Imovel("Brooklin", 50000);

	public void insereCasas() {

		// INSERE IMOVEIS E NOTICIAS
		tabuleiro.inserePosImovel(imovelInicio, 0);
		tabuleiro.inserePosImovel(imovel1, 1);
		tabuleiro.inserePosImovel(imovel2, 2);
		tabuleiro.inserePosNoticia(null, 3);
		tabuleiro.inserePosImovel(imovel3, 4);
		tabuleiro.inserePosImovel(imovel4, 5);
		tabuleiro.inserePosNoticia(null, 6);
		tabuleiro.inserePosImovel(imovel5, 7);
		tabuleiro.inserePosImovel(imovel6, 8);
		tabuleiro.inserePosImovel(imovel7, 9);
		tabuleiro.inserePosImovel(imovelPrisao, 10);
		tabuleiro.inserePosNoticia(null, 11);
		tabuleiro.inserePosImovel(imovel8, 12);
		tabuleiro.inserePosImovel(imovel9, 13);
		tabuleiro.inserePosImovel(imovel10, 14);
		tabuleiro.inserePosNoticia(null, 15);
		tabuleiro.inserePosImovel(imovel11, 16);
		tabuleiro.inserePosImovel(imovel12, 17);
		tabuleiro.inserePosImovel(imovel13, 18);
		tabuleiro.inserePosImovel(imovel14, 19);
		tabuleiro.inserePosNoticia(null, 20);
		tabuleiro.inserePosImovel(imovelFim, 21);
	}

	public Imovel imovelNaPos(int pos) {
		tabuleiro.moveParaPosicao(pos);
		Imovel retVal = tabuleiro.atual.proximo.objImovel;
		return retVal;
	}

	public double VerificaValorImovel(int pos) {
		tabuleiro.moveParaPosicao(pos);
		double retVal = tabuleiro.atual.proximo.objImovel.getValorImovel();
		return retVal;
	}

	public void moveJogador(int pos, Jogador jogador) {
		tabuleiro.inserePosJogador(jogador, pos);
		jogador.setPosicaoJogador(pos);
	}

	public boolean verificaNotica(int pos) {
		try {
			tabuleiro.moveParaPosicao(pos);
			if (tabuleiro.atual.proximo.valor.equals("Not�cia")) {
				return true;
			}

		} catch (NullPointerException e) {
			System.out.println("Erro !");
		}
		return false;
	}

	public void pagarAluguel(int somaDados, Jogador JogadorAtual) {
		try {
			if ((imovelNaPos(somaDados).getJogadorDono() != null)
					&& (imovelNaPos(somaDados).getJogadorDono() != JogadorAtual)) {
	
				if(imovelNaPos(somaDados).getAluguelConstrucao()<=0) {
					JogadorAtual.setSaldoJogador(
							(JogadorAtual.getSaldoJogador() - 100));
					System.out.println("Aluguel minimo pago com sucesso !   Saldo atual: R$" +JogadorAtual.getSaldoJogador());
		
				} else {
					JogadorAtual.setSaldoJogador(
							(JogadorAtual.getSaldoJogador() - imovelNaPos(somaDados).getAluguelConstrucao()));
					System.out.println("Aluguel total pago com sucesso !");
				}
				
			}

			if (JogadorAtual.getSaldoJogador() < imovelNaPos(somaDados).getAluguelConstrucao()) {
				System.out.println("Sem saldo para pagar aluguel !");
				jogadorDaVez.retiraJogadorDaVez();
			}
			
			
		} catch (NullPointerException e) {
			System.out.println("Erro pagar aluguel !");
		}
	}

	public boolean adquirirImovel(int somaDados, boolean adquirir, Jogador JogadorAtual) {
		try {

			if ((imovelNaPos(somaDados).getJogadorDono() == null)
					&& JogadorAtual.getSaldoJogador() > VerificaValorImovel(somaDados) && (adquirir == true)
					&& (!verificaNotica(somaDados) && (imovelNaPos(somaDados).getValorImovel() != 0))) {

				JogadorAtual.setSaldoJogador(JogadorAtual.getSaldoJogador() - imovelNaPos(somaDados).getValorImovel());

				imovelNaPos(somaDados).setJogadorDono(JogadorAtual);

				imovelAdquirido.InsereImovelAdquirido(imovelNaPos(somaDados));

				System.out.println("Imovel adquirido com sucesso ! " + " Seu saldo atual �: " + "R$ "
						+ JogadorAtual.getSaldoJogador());

				return true;
			} else {

				if (verificaNotica(somaDados)) {
					if (adquirir) {
						System.out.println("Essa casa � uma not�cia !");
					}
				}

				if (imovelNaPos(somaDados).getValorImovel() == 0) {
					if (adquirir) {
						System.out.println("Imposs�vel adquirir este im�vel !");
					}
				}

				if (JogadorAtual.getSaldoJogador() < VerificaValorImovel(somaDados)) {
					if (adquirir) {
						System.out.println("Sem saldo para adquirir este im�vel !");
					}
				} else {
					if (imovelNaPos(somaDados).getJogadorDono() != null) {
						System.out.println("Este im�vel j� possui um dono !");
						pagarAluguel(somaDados, JogadorAtual);
					}
				}
			}

		} catch (NullPointerException e) {
			System.out.println("Erro adquirir im�vel !");
		}
		return false;
	}

	public boolean colocarConstru��o(int somaDados, boolean construir, Jogador JogadorAtual) {

		double valorCasa = 100;
		double valorHotel = 300;

		try {
			Random random = new Random();

			int valorEscolha = random.nextInt(3);
			int qtdConstrucao = random.nextInt(3);
			if (construir) {
				if (imovelNaPos(somaDados).getJogadorDono().getNomeJogador().equals(JogadorAtual.getNomeJogador())) {
					if (valorEscolha == 0) {
						imovelNaPos(somaDados).setTipoConstrucao(null);

						System.out.println("Nenhum constru��o inserida");

						return false;

					} else {

						if (valorEscolha == 1) {
							double valorConstrucoes = valorCasa * qtdConstrucao;

							if (JogadorAtual.getSaldoJogador() > VerificaValorImovel(somaDados)) {
								imovelNaPos(somaDados).setTipoConstrucao("Casa");
								imovelNaPos(somaDados).setQtdConstrucoes(qtdConstrucao);
								imovelNaPos(somaDados).setAluguelConstrucao(qtdConstrucao * 300);

								JogadorAtual.setSaldoJogador(JogadorAtual.getSaldoJogador() - valorConstrucoes);

								System.out.println("Constru��es inseridas com sucesso !");

							} else {
								if (construir) {
									System.out.println("Voc� n�o tem dinheiro para construir !");
								}
							}

						} else {

							if (valorEscolha == 2) {

								double valorConstrucoes = valorHotel * qtdConstrucao;
								if (JogadorAtual.getSaldoJogador() >= valorConstrucoes) {
									imovelNaPos(somaDados).setTipoConstrucao(" Hotel ");
									imovelNaPos(somaDados).setQtdConstrucoes(qtdConstrucao);
									imovelNaPos(somaDados).setAluguelConstrucao(qtdConstrucao * 500);

									JogadorAtual.setSaldoJogador(JogadorAtual.getSaldoJogador() - valorConstrucoes);

									System.out.println("Constru��es inseridas com sucesso !");
								}
							}
						}

					}
				} else {
					System.out.println("Voc� n�o � o dono desse im�vel");
				}
			}
		} catch (NullPointerException e) {
			System.out.println("Erro comprar constru��o !");
		}
		return false;
	}

}
