package TentativasPrisao;

import Jogador.Jogador;

public class MainImovelAdquirido {

	public static void main(String[] args) {

		FilaJogadorPrisao jogador = new FilaJogadorPrisao();
		
		Jogador j1 = new Jogador("Lucas");
		Jogador j2 = new Jogador("Pedro"
				+ "");
		jogador.InsereNaPrisao(j1);
		jogador.InsereNaPrisao(j2);
		

		while (!jogador.Vazio()) {
			System.out.println(jogador.retiraDaPrisao().getNomeJogador());
		}
	}

}
