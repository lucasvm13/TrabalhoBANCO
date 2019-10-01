package Tabuleiro;

import java.util.Random;

import Jogador.Jogador;

public class Imovel {

	String nomeImovel;
	double valorImovel;
	double aluguelImovel;
	String tipoConstrucao; // Nenhuma,Casa ou Hotel;
	double aluguelConstrucao;
	double impostoConstrucao;
	int qtdConstrucoes;

	public Imovel() {

	}

	// VALOR ALUGUEL = 10% VALOR DO IMOVEL (SE N�O TIVER CONSTRU��ES)
	public Imovel(String nome, double valor) {
		setNomeImovel(nome);
		setValorImovel(valor);
		setAluguelImovel(valor * 0.1);
		setTipoConstrucao(null);
		setAluguelConstrucao(0);
		setImpostoConstrucao(0);
		setQtdConstrucoes(0);
	}

	/*public void inserirConstrucao(Jogador jogador, Imovel imovel) {

		Random random = new Random();

		int valorEscolha = random.nextInt(3);
		int qtdConstrucao = random.nextInt(3);

		System.out.println("Escolha: " + valorEscolha);
		if (valorEscolha > 0) {
			System.out.println("Quantidade Constru��es: " + qtdConstrucao);
		}

		// Valor para por casa 5% do valor do imovel
		double valorCasa = (imovel.getValorImovel() * (0.01));
		System.out.println("Valor de uma casa: " + valorCasa);

		// Valor para por hotel 10% do valor do imovel
		double valorHotel = (imovel.getValorImovel() * (0.05));
		System.out.println("Valor de um hotel :" + valorHotel);

		// 1 CASA = 300;
		// 1 HOTEL = 500;

		////////////////////////////////////////////////////////////////////////////////
		//FAZER VERIFICA��O PARA SABER SE O JOGADOR EST� NA CASA E SE � O PROPRIETARIO//
		////////////////////////////////////////////////////////////////////////////////

		// Nenhuma
		if (valorEscolha == 0) {
			setTipoConstrucao(null);
			System.out.println("Nenhum constru��o inserida");
		} else {
			// Casa
			if (valorEscolha == 1) {

				double valorConstrucoes = valorCasa * qtdConstrucao;
				if (qtdConstrucao > 0) {
					System.out.println("Valor das constru��es: " + valorConstrucoes);
				}
				if (jogador.getSaldoJogador() >= valorConstrucoes) {
					imovel.setTipoConstrucao(" Casa ");
					imovel.setQtdConstrucoes(qtdConstrucao);
					imovel.setAluguelConstrucao(qtdConstrucao * 300);
					if (qtdConstrucao > 0) {
						System.out.println("Aluguel das constru��es: " + imovel.aluguelConstrucao);
					}
					jogador.setSaldoJogador(jogador.getSaldoJogador() - valorConstrucoes);

					if (qtdConstrucoes < 0) {
						System.out.println("Constru��es inseridas com sucesso !");
					}
				} else {
					System.out.println("Sem dinheiro suficiente para comprar as constru��es");
				}
			} else {
				// Hotel
				if (valorEscolha == 2) {

					double valorConstrucoes = valorHotel * qtdConstrucao;
					if (qtdConstrucao > 0) {
						System.out.println("Valor das constru��es: " + valorConstrucoes);
					}
					if (jogador.getSaldoJogador() >= valorConstrucoes) {
						imovel.setTipoConstrucao(" Hotel ");
						imovel.setQtdConstrucoes(qtdConstrucao);
						imovel.setAluguelConstrucao(qtdConstrucao * 500);
						if (qtdConstrucao > 0) {
							System.out.println("Aluguel das constru��es: " + imovel.aluguelConstrucao);
						}
						jogador.setSaldoJogador(jogador.getSaldoJogador() - valorConstrucoes);

						if (qtdConstrucoes < 0) {
							System.out.println("Constru��es inseridas com sucesso !");
						}
					} else {
						System.out.println("Sem dinheiro suficiente para comprar as constru��es");
					}
				}
			}
		}
		System.out.println("Saldo Jogador: " + jogador.getSaldoJogador());
	}
*/
	public String getNomeImovel() {
		return nomeImovel;
	}

	public void setNomeImovel(String nomeImovel) {
		this.nomeImovel = nomeImovel;
	}

	public double getValorImovel() {
		return valorImovel;
	}

	public void setValorImovel(double valorImovel) {
		this.valorImovel = valorImovel;
	}

	public double getAluguelImovel() {
		return aluguelImovel;
	}

	public void setAluguelImovel(double aluguelImovel) {
		this.aluguelImovel = aluguelImovel;
	}

	public String getTipoConstrucao() {
		return tipoConstrucao;
	}

	public void setTipoConstrucao(String tipoConstrucao) {
		this.tipoConstrucao = tipoConstrucao;
	}

	public double getAluguelConstrucao() {
		return aluguelConstrucao;
	}

	public void setAluguelConstrucao(double aluguelConstrucao) {
		this.aluguelConstrucao = aluguelConstrucao;
	}

	public double getImpostoConstrucao() {
		return impostoConstrucao;
	}

	public void setImpostoConstrucao(double impostoConstrucao) {
		this.impostoConstrucao = impostoConstrucao;
	}

	public int getQtdConstrucoes() {
		return qtdConstrucoes;
	}

	public void setQtdConstrucoes(int qtdConstrucoes) {
		this.qtdConstrucoes = qtdConstrucoes;
	}

}
