package ImoveisAdquiridos;

import Imovel.Imovel;

public class NovoImovelAdquirido {

	Imovel imovelAdquirido;
	NovoImovelAdquirido proximo;

	public NovoImovelAdquirido(Imovel imovel) {
		imovelAdquirido = imovel;
		proximo = null;
	}

}
