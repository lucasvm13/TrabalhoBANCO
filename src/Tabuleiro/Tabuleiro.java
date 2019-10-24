package Tabuleiro;

import java.util.Random;

import ImoveisAdquiridos.ImovelAdquiridoFila;
import Imovel.Imovel;
import Jogador.Jogador;

public class Tabuleiro {

	TabuleiroLista tabuleiro = new TabuleiroLista();
	ImovelAdquiridoFila imovelAdquirido = new ImovelAdquiridoFila();

	Imovel imovelPrisao = new Imovel("Prisão", 0);
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
		// INSERE INICIO, FIM E PRISÃO
		tabuleiro.InsereInicioImovel(imovelInicio);
		;
		tabuleiro.InsereImovelNoFim(imovelFim);

		// INSERE IMOVEIS E NOTICIAS
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

	public void pagarAluguel(int somaDados, Jogador JogadorAtual) {
		try {
			if ((imovelNaPos(somaDados).getJogadorDono() != null)
					&& (imovelNaPos(somaDados).getJogadorDono() != JogadorAtual)) {
				JogadorAtual.setSaldoJogador(
						(JogadorAtual.getSaldoJogador() - imovelNaPos(somaDados).getAluguelConstrucao()));
			}
		} catch (NullPointerException e) {
			System.out.println("Erro!");
		}
	}

	public boolean adquirirImovel(int somaDados, boolean adquirir, Jogador JogadorAtual) {
		try {
			if ((imovelNaPos(somaDados).getJogadorDono() == null)
					&& JogadorAtual.getSaldoJogador() > VerificaValorImovel(somaDados) && (adquirir == true)) {

				JogadorAtual.setSaldoJogador(JogadorAtual.getSaldoJogador() - imovelNaPos(somaDados).getValorImovel());

				imovelNaPos(somaDados).setJogadorDono(JogadorAtual);

				imovelAdquirido.InsereImovelAdquirido(imovelNaPos(somaDados));

				System.out.println("Imovel adquirido com sucesso ! " + " Seu saldo atual é: " + "R$ "
						+ JogadorAtual.getSaldoJogador());

				return true;
			} else {

				if (JogadorAtual.getSaldoJogador() < VerificaValorImovel(somaDados)) {
					System.out.println("Sem saldo para adquirir este imóvel !");
				} else {
					if (imovelNaPos(somaDados).getJogadorDono() != null) {
						System.out.println("Este imóvel já possui um dono !");
					}
				}
			}

		} catch (NullPointerException e) {
			System.out.println("Erro!");
		}
		return false;
	}

	public boolean colocarConstrução(int somaDados, boolean construir, Jogador JogadorAtual) {

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

						System.out.println("Nenhum construção inserida");

						return false;

					} else {

						if (valorEscolha == 1) {
							double valorConstrucoes = valorCasa * qtdConstrucao;

							if (JogadorAtual.getSaldoJogador() > VerificaValorImovel(somaDados)) {
								imovelNaPos(somaDados).setTipoConstrucao("Casa");
								imovelNaPos(somaDados).setQtdConstrucoes(qtdConstrucao);
								imovelNaPos(somaDados).setAluguelConstrucao(qtdConstrucao * 300);

								JogadorAtual.setSaldoJogador(JogadorAtual.getSaldoJogador() - valorConstrucoes);

								System.out.println("Construções inseridas com sucesso !");

							} else {
								if (construir) {
									System.out.println("Você não tem dinheiro para construir !");
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

									System.out.println("Construções inseridas com sucesso !");
								}
							}
						}

					}
				} else {
					System.out.println("Você não é o dono desse imóvel");
				}
			}
		} catch (NullPointerException e) {
			System.out.println("Erro!");
		}
		return false;
	}
}
