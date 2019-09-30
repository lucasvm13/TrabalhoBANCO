package Noticias;

public class Noticia {

	private NovaNoticia topo = null;

	public void empilhaNoticia(String noticia) {
		NovaNoticia novo = new NovaNoticia(noticia);
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
		return retVal;
	}
}
