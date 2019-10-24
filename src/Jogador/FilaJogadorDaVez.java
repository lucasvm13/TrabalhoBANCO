package Jogador;

public class FilaJogadorDaVez {

	NovoJogadorDaVez inicio, fim = null;

	public boolean Vazio() {
		return inicio == null;
	}

	public void InsereJogadorVez(Jogador j) {
		NovoJogadorDaVez novo = new NovoJogadorDaVez(j);
		if (inicio == null) {
			inicio = fim = novo;
		} else {
			fim.proximo = novo;
			fim = novo;
		}
	}

	public Jogador retiraJogadorDaVez() {
		Jogador retVal = inicio.jogador;
		inicio = inicio.proximo;
		return retVal;
	}
}
