package Imovel;

import Jogador.Jogador;

public class Imovel {

	String nomeImovel;
	double valorImovel;
	double aluguelImovel;
	String tipoConstrucao; // Nenhuma,Casa ou Hotel;
	public double aluguelConstrucao;
	double impostoConstrucao;
	int qtdConstrucoes;
	Jogador jogadorDono = null;
	double valorCasa = 100;
	double valorHotel = 300;

	public Imovel() {

	}

	public Imovel(String nome) {
		this.nomeImovel = nome;
	}

	// VALOR ALUGUEL = 10% VALOR DO IMOVEL (SE NÃO TIVER CONSTRUÇÕES)
	public Imovel(String nome, double valor) {
		setNomeImovel(nome);
		setValorImovel(valor);
		setAluguelImovel(valor * 0.1);
		setTipoConstrucao(null);
		setAluguelConstrucao(0);
		setImpostoConstrucao(0);
		setQtdConstrucoes(0);
		setJogadorDono(null);
		setValorCasa(100);
		setValorHotel(300);

	}

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

	public Jogador getJogadorDono() {
		return jogadorDono;
	}

	public void setJogadorDono(Jogador jogadorDono) {
		this.jogadorDono = jogadorDono;
	}

	public double getValorCasa() {
		return valorCasa;
	}

	public void setValorCasa(double valorCasa) {
		this.valorCasa = valorCasa;
	}

	public double getValorHotel() {
		return valorHotel;
	}

	public void setValorHotel(double valorHotel) {
		this.valorHotel = valorHotel;
	}

}
