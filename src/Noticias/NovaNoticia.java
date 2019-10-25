package Noticias;

public class NovaNoticia {
	
	String textoNoticia;
	NovaNoticia proximo;
	int efect;
	
	public NovaNoticia(String noticia, int efeito) {
		textoNoticia = noticia;
		proximo = null;
		efect = efeito;
	}

}
