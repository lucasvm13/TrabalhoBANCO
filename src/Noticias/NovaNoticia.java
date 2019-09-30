package Noticias;

public class NovaNoticia {
	
	String textoNoticia;
	NovaNoticia proximo;
	
	public NovaNoticia(String noticia) {
		textoNoticia = noticia;
		proximo = null;
	}

}
