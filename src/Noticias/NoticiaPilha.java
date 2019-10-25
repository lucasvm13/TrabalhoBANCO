package Noticias;

public class NoticiaPilha {

	private NovaNoticia topo = null;

	public void empilhaNoticia(String noticia, int efeito) {
		NovaNoticia novo = new NovaNoticia(noticia, efeito);
		if (topo == null)
			topo = novo;

		else {

			novo.proximo = topo;
			topo = novo;
		}
	}

	public boolean estaVazia() {
		return topo == null;
	}

	public String desempilhaNoticia() {
		String retVal = topo.textoNoticia;
		topo = topo.proximo;
		verificaEfeito();
		return retVal;
	}

	public int verificaEfeito() {
		int efect = topo.efect;
		return efect;
	}
}
