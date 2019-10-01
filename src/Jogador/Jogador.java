package Jogador;

public class Jogador {

	String nomeJogador;
	double saldoJogador;
	boolean estaPrisao;
	int posicaoJogador;
	int somaDadosJogador;

	public Jogador() {
		this.saldoJogador = 2500;
		this.estaPrisao = false;
		this.posicaoJogador = -1;
	}
	
	public Jogador(String nome) {
		saldoJogador = 2500;
		estaPrisao = false;
		posicaoJogador = -1;
		nomeJogador = nome;
	}

	public String getNomeJogador() {
		return nomeJogador;
	}

	public void setNomeJogador(String nomeJogador) {
		this.nomeJogador = nomeJogador;
	}

	public double getSaldoJogador() {
		return saldoJogador;
	}

	public void setSaldoJogador(double saldoJogador) {
		this.saldoJogador = saldoJogador;
	}

	public boolean isEstaPrisao() {
		return estaPrisao;
	}

	public void setEstaPrisao(boolean estaPrisao) {
		this.estaPrisao = estaPrisao;
	}

	public int getPosicaoJogador() {
		return posicaoJogador;
	}

	public void setPosicaoJogador(int posicaoJogador) {
		this.posicaoJogador = posicaoJogador;
	}

}
