package ImoveisAdquiridos;

public class ImovelAdquirido {
	
	NovoImovelAdquirido inicio, fim =  null;
	
	public boolean Vazio() {
		return inicio == null;
	}
	
	public void InsereImovelAdquirido(String imovel) {
		NovoImovelAdquirido novo = new NovoImovelAdquirido(imovel);
			if(inicio==null) {
				inicio =  fim = novo;
			} else {
			fim.proximo = novo;
			fim = novo;
			}
		}
	
	public String retiraImovelAdquirido() {
		String retVal = inicio.imovelAdquirido;
		inicio = inicio.proximo;
		return retVal;
	}
}
	


