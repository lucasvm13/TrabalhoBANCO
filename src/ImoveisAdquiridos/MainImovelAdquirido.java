package ImoveisAdquiridos;

public class MainImovelAdquirido {

	public static void main(String[] args) {

		ImovelAdquirido imovel = new ImovelAdquirido();

		imovel.InsereImovelAdquirido("Imovel 1: Terreno");
		imovel.InsereImovelAdquirido("Imovel 2: Casa");

		while (!imovel.Vazio()) {
			System.out.println(imovel.retiraImovelAdquirido());
		}
	}

}
