package ImoveisAdquiridos;

import Imovel.Imovel;

public class ImovelAdquiridoFila {

	NovoImovelAdquirido inicio, fim = null;

	public boolean Vazio() {
		return inicio == null;
	}

	public void InsereImovelAdquirido(Imovel imovel) {
		NovoImovelAdquirido novo = new NovoImovelAdquirido(imovel);
		if (inicio == null) {
			inicio = fim = novo;
		} else {
			fim.proximo = novo;
			fim = novo;
		}
	}

	public Imovel retiraImovelAdquirido() {
		Imovel retVal = inicio.imovelAdquirido;
		inicio = inicio.proximo;
		return retVal;
	}
}
